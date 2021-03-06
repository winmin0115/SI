
// - 페이지 로딩시 1회 수행
function initUI2() {
	console.log("initUI called");
	
	// refresh
	$("#btnRegister").click(function() {
		registerDevice();	
	});
	
	$('input[type="file"]').on('change', function() {
		var rgExp = /(.csv|.txt)$/;
		var table = $("#csvTable");
	    if (rgExp.test($("#btnFileName").val())) {
	        if (typeof (FileReader) != "undefined") {
	            var reader = new FileReader();
	            reader.onload = function (e) {
	                var rows = e.target.result.split("\r\n");
	                var thead = $("<tr><th>"+"OUI"+"</th><th>"+"MODELNAME"+"</th><th>"+"SN"+"</th><th>"+"AUTH_ID "+"</th><th>"+" AUTH_PWD"+"</th></tr>")
                    table.append(thead);
	                
	                for (var i = 1; i < rows.length; i++) {
	                	var header = rows[0].split(",").length;
	                	var row = $("<tr />");
	                	var cells = rows[i].split(",");
	                	
	                	if (header != cells.length) {
	                    	$("#csvTable tr").remove();
	                    	alert("파일 형식이 올바르지 않습니다. 확인 후 다시 시도해주세요.");
	                    	$("#fileName").val("");
	                    	break;
	                    } else {
	                    	for (var j = 0; j < cells.length; j++) {
		                        var cell = $("<td />");
		                        cell.html(cells[j]);
		                        row.append(cell);
		                    }
		                    table.append(row);
	                    }
	                }
	            }
	            reader.readAsText($("#btnFileName")[0].files[0]);
	        } else {}
	    } else {} 
	    $("#csvTable tr").remove();
	});
	$("#btnRegisters").click(function() {
    	$("#csvTable tr").remove();
		registersDevice();
	});
}
//context: {"param":{ "oui":oui, "modelName":modelName, "sn":sn},
//		"handler": regDeviceHandler};
function registerDevice(context, loading) {
	
	var tokens = $("#search_deviceModel").val().split("|");
	var id = tokens[0];
	var oui = tokens[1];
	var modelName = tokens[2];
	var sn = $("#serialNo").val();
	var dmType = $("#search_deviceType").val();
	var authId = $("#authId").val();
	var authPwd = $("#authPwd").val();
	
	console.log(" =========>>>>>> authId : " + authId + " authPwd : " + authPwd + " deviceType : " + dmType);
	
	if (sn.length == 0) {
		alert("시리얼 번호를 입력하세요.");
		return;
	}
	var context = { "param":{ "deviceModelId":id, "sn":sn, "dmType":dmType, "authId":authId, "authPwd":authPwd}, "handler":regDeviceHandler, "errorHandler": regDeviceErrorHandler} ;
	hdb_register_device(context, false);
	
}

//HERE
function registersDevice(context, loading) {
	$("#fileName").val("");
	var rgExp = /(.csv|.txt)$/;
    if (rgExp.test($("#btnFileName").val())) {
        if (typeof (FileReader) != "undefined") {
            var reader = new FileReader();
            reader.onload = function (e) {
                var rows = e.target.result.split("\r\n");
                var array = new Array();
                
                for (var i = 1; i < rows.length; i++) {
                    var cells = rows[i].split(",");
                    var devInfo =  {"oui":cells[0], "modelName":cells[1], "sn":cells[2], "authId":cells[3], "authPwd":cells[4]};
                    array.push(devInfo);
                }
                console.log("array : " + array.toString());
                console.log("array : " + array[0]);
                
                var jsonStr = JSON.stringify(array);
                console.log("jsonarray : " + jsonStr);
                
                var context = { "param":{ "deviceRegInfo": jsonStr}, "handler":regDeviceHandler, "errorHandler": regDeviceErrorHandler} ;
                console.log("myparam : " + context.toString());
                hdb_registers_device(context, false);
            }
            reader.readAsText($("#btnFileName")[0].files[0]);
        } else {}
    } else {}
}

function regDeviceErrorHandler(msg, context) {
	console.log("regDeviceErrorHandler called ");
	
	if (msg.errorCode == "102") {
		alert("중복된 디바이스ID가 이미 존재합니다. 시리얼번호를 확인 후 다시 시도해주세요.");
		return true;
	} 
	return false;
}

function regDeviceHandler(msg, context) {
	console.log("regDeviceHandler called ");
	
	if (msg.result != 0) {
		if (msg.errorCode == "102") {
			alert("중복된 디바이스ID가 이미 존재합니다. 시리얼번호를 확인 후 다시 시도해주세요.");
			return;
		}
	} else {
		alert("디바이스 등록에 성공했습니다.");
		$("#serialNo").val("");
		$("#authId").val("");
		$("#authPwd").val("");
	}
	return true;
}
