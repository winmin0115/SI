// Custom scripts
$(document).ready(function () {
	dsmsk.init();
	
	console.log("device.summary.model_sk js initialized");
});

var dsmsk = {
	divs: null,
	resources: null,	
	deviceInfo: null,
	init: function() {
		dsmsk.divs = $(".hit-component-dsmsk");
		dsmsk.resources = [];
		
		dsmsk.deviceInfo = _ucc.getDeviceInfo();
		$("#dsd_sn").text(dsmsk.deviceInfo.sn);
		
		$.each(dsmsk.divs, function(idx, div) {
			$.each(_ucc.getResListWithComponentDiv(div), function(ix, val) {
				dsmsk.resources.push(val);
			});
			var resource = _ucc.getResListWithComponentDiv(div)[0];
			//var resource = '/2/-/9';
			var profile = _ucc.getProfileInfo(resource);
			var btn = $(div).find(".btn-refresh");
			var updateTime = $(div).find(".span-update-time");
			if (profile.operation.indexOf("E") >= 0) {
				btn.on("click", dsmsk.onRefreshClick);				
			} /*else {
				btn.hide();
				updateTime.hide();
			}*/
		});
		
		_ucc.setResourceHandler("dsmsk", dsmsk.resources, dsmsk.refresh);
		dsmsk.refresh();
	},
	refresh: function(type) {
		console.log("dsmsk.refresh("+type+") called");
		
		//$.each(dsmsk.divs, function(idx, div) {
			dsmsk.refreshComponent(dsmsk.divs);
		//});		
	},
	refreshComponent: function(div) {
		var resources = _ucc.getResListWithComponentDiv(div);

		var moData = _ucc.getMoData(resources);
		//var unit = _ucc.getUnitString(resources[0]);
		

		if (moData == null || typeof moData == "undefined") {
			console.error("디바이스에 대해서 MO데이터가 정의되지 않았습니다. (DSSM:"+resources+")");
			//alert("디바이스에 대해서 MO데이터가 정의되지 않았습니다. (DSSNB:"+resources[0]+")");					
			//$(div).find(".dssnb-value").text("-");
			//$(div).find(".dssnb-unit").text("-");
			return;
		}					
		//$(div).find(".dssnb-value").text(moData.data);
		//$(div).find(".dssnb-unit").text(unit);
		$(div).find(".span-update-time").text(moData.dataTime);
		
	},
	onRefreshClick: function(evt) {
		console.log("dsmsk.onRefreshClick()");
		var compDiv = $(evt.target).parents(".hit-component-dsmsk");
		var res = _ucc.getSingleResWithComponentDiv(compDiv);
		
		var optionData = "";
		var profile = _ucc.getProfileInfo(res);
		if (profile != null && profile.optionDataList != null && profile.optionDataList.length > 0) {
			optionData = profile.optionDataList[0].data;
		} 
		console.log("dssnbsk.onRefreshClick - "+ _ucc.getDeviceId() +","+ res +","+optionData);
		_ucc.executeOrWrite(_ucc.getDeviceId(), res, optionData);
	}
	/*refresh: function() {
		console.log("dsm.refresh called ");
		
		var info = _ucc.getDeviceModelInfo();
		
		$("#dsm_model_manufacturer").text(info.manufacturer);
		$("#dsm_model_oui").text(info.oui);
		$("#dsm_model_name").text(info.modelName);
		$("#dsm_model_image").attr("src", "/hdm"+info.iconUrl);		
	}*/
};
