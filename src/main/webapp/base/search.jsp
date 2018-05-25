<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.hhoss.boot.AppContext" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title><%=AppContext.getProperty("res.config.module.basic","app.module.title") %></title>
	<SCRIPT type="text/javascript" src="../biz/zheng/config.jsp"></SCRIPT>
	<SCRIPT type="text/javascript" src="../biz/zheng/import.js"></SCRIPT>
    <link rel="stylesheet" type="text/css" href="../biz/ext3/examples/ux/gridfilters/css/GridFilters.css" />
    <link rel="stylesheet" type="text/css" href="../biz/ext3/examples/ux/gridfilters/css/RangeMenu.css" />
    <SCRIPT type="text/javascript"> $import("gui.loader"); </SCRIPT>
    <script type="text/javascript" src="../biz/ext3/examples/ux/gridfilters/menu/RangeMenu.js"></script>
	<script type="text/javascript" src="../biz/ext3/examples/ux/gridfilters/menu/ListMenu.js"></script>
	<script type="text/javascript" src="../biz/ext3/examples/ux/gridfilters/GridFilters.js"></script>
	<script type="text/javascript" src="../biz/ext3/examples/ux/gridfilters/filter/Filter.js"></script>
	<script type="text/javascript" src="../biz/ext3/examples/ux/gridfilters/filter/StringFilter.js"></script>
	<script type="text/javascript" src="../biz/ext3/examples/ux/gridfilters/filter/DateFilter.js"></script>
	<script type="text/javascript" src="../biz/ext3/examples/ux/gridfilters/filter/ListFilter.js"></script>
	<script type="text/javascript" src="../biz/ext3/examples/ux/gridfilters/filter/NumericFilter.js"></script>
	<script type="text/javascript" src="../biz/ext3/examples/ux/gridfilters/filter/BooleanFilter.js"></script>
<SCRIPT type="text/javascript">
    	if('<%=session.getAttribute("FULL_NAME") %>'=='null'){
    		 window.location="../login/Login.action";
    	}
    </SCRIPT>
	<script type="text/javascript">
		var menuId = '<%=request.getParameter("sid") %>';
	    var attrs = storeHelper.getAttrs(menuId);
	    var tbId = parseInt(attrs.tableId||menuId);
		var companel = new CompositePanel(tbId);
		companel.getColsConfig=function(){
			if( this.colsConfig ){
				 return this.colsConfig;
			}
			var colsConfig={ names:[], items:[], model:[], filter:[], datum:[] };
			var fStore = storeHelper.get("modelFields", this.getMetaId());
			for ( var k = 0; k < fStore.getCount(); k++) {
				var rec = fStore.getAt(k);
				rec.data["NAME"]=rec.data["NAME"].toUpperCase();
				var colInfo = this.getColumnInfo( rec);
				if(this.attrConfig.idProperty==rec.get('NAME')){
					Ext.applyIf(colInfo,{editable:false,allowBlank:false});
				}
				colsConfig.names.push(colInfo);
				// comment for show in client always;
				colsConfig.items.push(colInfo);
				//filter id for ext filter plugins in grid header;
				colsConfig.filter.push(this.getFiltersConfigByType( rec));
				colsConfig.model.push(this.getFiltersColumnsConfigByType( rec));
				colsConfig.datum.push(rec.data);
			}
			 this.colsConfig=colsConfig;
			 return this.colsConfig;
		};
		function getTextByName(Name){
			var flds=companel.getColsConfig().names;
			var uName=Name.toUpperCase();
			for(var i in flds){
				var f=flds[i];
				if(uName==f["name"])
					return f["header"];
			}
			return uName;
		}
		Ext.onReady(function(){
		    Ext.QuickTips.init();
			companel.formConfig.buttons=false;
			companel.formConfig.height=60;
			//this.dataStore.setBaseParam(name,'');
			for(var k in attrs){//todo:list loop by rank
				if(typeof(k)=='string' && k.indexOf('filter.')==0){
					companel.dataConfig.baseParams[k]=attrs[k];
				}
			}
		    if( attrs.formFields){
		        var arrFlds = attrs.formFields.split(',');
		        if(arrFlds.length>0){
		            var flds = companel.getCompositeFields();
		        	for(var i=0;i<arrFlds.length;i++){
			            flds[flds.length]={xtype: 'displayfield',value: getTextByName(arrFlds[i])};
			            flds[flds.length]={name:'filter.'+arrFlds[i]};
			            //flds[flds.length]={xtype: 'displayfield',value: '节点层级:'};
			        }
		    	    flds[flds.length]=companel.getButton('doSearch');
		        }
		    }		    
			
		     companel.initBefore=function(){
		     	//this.gridConfig.tbar=false;
		    	this.gridConfig.xtype='editorgrid';
		     	this.gridConfig.clicksToEdit='auto';
		    	this.gridConfig.height=document.documentElement.clientHeight-60; 
		    	this.gridConfig.filter=true;
		    	//this.gridConfig.width=window.screen.availWidth-212;  
		     };
		  	
			companel.display();
		 
		});
	</script>
	
 </head>
<body  style="background-color:rgb(223, 232, 246);">
<div id="form_container"></div>
<div id="grid_container"></div>
<div id="container3" ></div>
<div id="container4"></div>
<div id="container5"></div>
<div id="container6"></div>
<div id="container7"></div>
 <div id="performance_div">
 	<div id="performance_chart"></div>
 	<div id="performance_table"></div>
 </div>
</body>
</html>
