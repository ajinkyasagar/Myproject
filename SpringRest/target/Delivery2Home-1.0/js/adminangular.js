var app = angular.module('app', ['ui.grid.autoResize','ngAnimate','ngTouch', 'ui.grid','ngRoute','ui.bootstrap','ngCookies','ui.bootstrap','ui.grid.resizeColumns', 'ui.grid.moveColumns','ui.grid.selection', 'ui.grid.exporter']);
app.config(['$routeProvider','$locationProvider',function($routeProvider,$locationProvider) {

	$routeProvider.when('/order', {
	templateUrl : '/Delivery2Home/checkorder.html'

	}).when('/checkorder', {
	templateUrl : '/Delivery2Home/checkorder.html'

	}).when('/reject', {
	templateUrl : '/Delivery2Home/reject.html'

	}).when('/damage', {
	templateUrl : '/Delivery2Home/damage.html'

	}).when('/checkallorder', {
	templateUrl : '/Delivery2Home/checkallorder.html'

	}).when('/updateorder', {
	templateUrl : '/Delivery2Home/updateorder.html'

	}).otherwise({
        redirectTo: '/order'
      });

	

	}]);
app.controller('adminCtrl', ['$scope','$http','uiGridConstants', function ($scope,$http,uiGridConstants) {
$scope.checkallorder={};
$scope.update={};
$scope.checkorder={};
$scope.orderdata={};
$scope.rejectdamage={};
$scope.error={};
$scope.success={};
 $scope.open = function($event) {
    $scope.status.opened = true;
  };
   $scope.status = {
    opened: false
  };
  
  $scope.openfrom = function($event) {
    $scope.status.openedfrom = true;
  };
   $scope.status = {
    openedfrom: false
  };
  $scope.dateOptions = {
    formatYear: 'yy',
    startingDay: 1,
	 format: 'yyyy-mm-dd'
  };

  $scope.formats = ['dd-MMMM-yyyy', 'yyyy/MM/dd', 'dd.MM.yyyy', 'shortDate'];
  $scope.format = $scope.formats[0];

 
$scope.filterValue = function($event){
        if(isNaN(String.fromCharCode($event.keyCode))){
            $event.preventDefault();
        }
};
$scope.user={};
$scope.search={};
$scope.user.mobileNumber={};
$scope.orderdata={};
 $scope.searchorder=function()
   {
	   if($scope.search.mobileNumber.length>0)
	   {
		   $scope.user.mobileNumber=$scope.search.mobileNumber;
		   $http({method:'POST',url:'/Delivery2Home/getorders',data:$scope.user}).success(function(data) {
	$scope.orderdata.orders = data;
	console.log(JSON.stringify(data,null," "));
	console.log(data);
	 $scope.gridOptions.data = $scope.orderdata.orders;

	}).error(function(data){
	console.log("Errorssss");
	});;

	   }else{
		   
	   }
	   
	   	
	   
   }
   
   
   
    $scope.updateorder=function()
   {
	  
		   $http({method:'POST',url:'/Delivery2Home/updateOrder',data:$scope.update}).success(function(data) {
	$scope.orderdata.orders = data;
	console.log(JSON.stringify(data,null," "));
	console.log(data);
	 $scope.gridOptions.data = data;

	}).error(function(data){
	console.log("Errorssss");
	});;
	   
   }
   
   
      $scope.getorder=function()
   {
	   
	  $scope.getorderurl="/Delivery2Home/selectid/"+$scope.rejectdamage.orderid
	  
		   $http({method:'GET',url:$scope.getorderurl}).success(function(data) {
	$scope.orderdata.getorder = data;
	console.log(JSON.stringify(data,null," "));
	console.log(data);
	 $scope.gridOptions.data = data;

	}).error(function(data){
	console.log("Errorssss");
	});;
	   
   }
   
   
   $scope.updatereturnedProduct=function()
   {
	$scope.error.quantyerror=false;	  
	$scope.success.reject=false;	
	$scope.error.reject=false;
	$scope.data=$scope.orderdata.getorder[0].productList;
	
	$scope.partialReturnedProduct={};
	$scope.partialReturnedProduct.productList=[];
	$scope.product={};
	for(var i=0;i<$scope.data.length;i++)
	{
		if($scope.data[i].ischecked)
		{	
	
	if($scope.data[i].orderQty==0)
	{
			$scope.error.quantyerror=true;
	}
else
{
	$scope.product={};
			$scope.product.productId=$scope.data[i].productId;
			$scope.product.orderCancelQty=$scope.data[i].orderQty;
			$scope.partialReturnedProduct.productList.push($scope.product);
}
			
		}
	}
	if($scope.error.quantyerror==false)
	{
	$scope.partialReturnedProduct.orderId=$scope.orderdata.getorder[0].orderId;
	console.log("partialReturnedProduct"+JSON.stringify($scope.partialReturnedProduct,null," "));
	console.log($scope.partialReturnedProduct);
	 $http({method:'POST',url:'/Delivery2Home/cancelReturn',data:$scope.partialReturnedProduct}).success(function(data) {
	$scope.success.reject=true;
		}).error(function(data){
			$scope.error.reject=true;
	console.log("Errorssss");
	});;
	}
   }
   
   
   
   
   
    $scope.updaterejectdamage=function()
   {
	   if($scope.search.mobileNumber.length>0)
	   {
		   $scope.user.mobileNumber=$scope.search.mobileNumber;
		   $http({method:'POST',url:'/Delivery2Home/getorders',data:$scope.user}).success(function(data) {
	$scope.orderdata.orders = data;
	console.log(JSON.stringify(data,null," "));
	console.log(data);
	 $scope.gridOptions.data = $scope.orderdata.orders;

	}).error(function(data){
	console.log("Errorssss");
	});;

	   }else{
		   
	   }
	   
	   	
	   
   }
   
   
   
    $scope.allorders=function()
   {
	
		 
		   $http({method:'POST',url:'/Delivery2Home/ordersByDates',data:$scope.checkallorder}).success(function(data) {
	$scope.orderdata.orders = data;
	console.log(JSON.stringify(data,null," "));
	console.log(data);
	 $scope.gridOptions.data = data;

	}).error(function(data){
	console.log("Errorssss");
	});;

	   
	   
	   	
	   
   }
   $scope.ordersByDateMobileNumber=function()
   {
	
		 
		   $http({method:'POST',url:'/Delivery2Home/ordersByDateMobileNumber',data:$scope.checkorder}).success(function(data) {

	console.log(JSON.stringify(data,null," "));
	console.log(data);
	
	
	
	
	
	 $scope.ordersByDateMobileNumbergrid.data = data;

	}).error(function(data){
	console.log("Errorssss");
	});;

	   
	   
	   	
	   
   }
   
   $scope.init=function()
   {
	   
   }

   $scope.ordersByDateMobileNumbergrid = {
	       enableFiltering: true,
	    enableGridMenu: true,
    enableSelectAll: true,
    exporterCsvFilename: 'myFile.csv',
    exporterPdfDefaultStyle: {fontSize: 9},
    exporterPdfTableStyle: {margin: [30, 30, 30, 30]},
    exporterPdfTableHeaderStyle: {fontSize: 10, bold: true, italics: true, color: 'red'},
    exporterPdfHeader: { text: "My Header", style: 'headerStyle' },
    exporterPdfFooter: function ( currentPage, pageCount ) {
      return { text: currentPage.toString() + ' of ' + pageCount.toString(), style: 'footerStyle' };
    },
    exporterPdfCustomFormatter: function ( docDefinition ) {
      docDefinition.styles.headerStyle = { fontSize: 22, bold: true };
      docDefinition.styles.footerStyle = { fontSize: 10, bold: true };
      return docDefinition;
    },
    exporterPdfOrientation: 'landscape',
    exporterPdfPageSize: 'LETTER',
    exporterPdfMaxGridWidth: 500,
    exporterCsvLinkElement: angular.element(document.querySelectorAll(".custom-csv-link-location")),
    onRegisterApi: function(gridApi){
      $scope.gridApi = gridApi;
    },

	   
	   enableHorizontalScrollbar:true
    
};
   
$scope.gridOptions = {
    enableFiltering: true,
    
};
  $scope.gridOptions.data = $scope.orderdata.orders;
}]);


function isNumberKey(evt)
       {
          var charCode = (evt.which) ? evt.which : evt.keyCode;
          if (charCode != 46 && charCode > 31 
            && (charCode < 48 || charCode > 57))
             return false;

          return true;
       }