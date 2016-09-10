var myapp=angular.module('myapp',['ngRoute','ui.bootstrap','ngCookies','ui.bootstrap','ngAnimate','ngStorage','uiGmapgoogle-maps','angular.filter','me-lazyload']);


myapp.config(['$routeProvider','$locationProvider','uiGmapGoogleMapApiProvider',function($routeProvider,$locationProvider,GoogleMapApiProviders) {
/*
This logic is used to detect  mobile 
var _isNotMobile = (function() {
        var check = false;
        (function(a){if(/(android|bb\d+|meego).+mobile|avantgo|bada\/|blackberry|blazer|compal|elaine|fennec|hiptop|iemobile|ip(hone|od)|iris|kindle|lge |maemo|midp|mmp|netfront|opera m(ob|in)i|palm( os)?|phone|p(ixi|re)\/|plucker|pocket|psp|series(4|6)0|symbian|treo|up\.(browser|link)|vodafone|wap|windows (ce|phone)|xda|xiino/i.test(a)||/1207|6310|6590|3gso|4thp|50[1-6]i|770s|802s|a wa|abac|ac(er|oo|s\-)|ai(ko|rn)|al(av|ca|co)|amoi|an(ex|ny|yw)|aptu|ar(ch|go)|as(te|us)|attw|au(di|\-m|r |s )|avan|be(ck|ll|nq)|bi(lb|rd)|bl(ac|az)|br(e|v)w|bumb|bw\-(n|u)|c55\/|capi|ccwa|cdm\-|cell|chtm|cldc|cmd\-|co(mp|nd)|craw|da(it|ll|ng)|dbte|dc\-s|devi|dica|dmob|do(c|p)o|ds(12|\-d)|el(49|ai)|em(l2|ul)|er(ic|k0)|esl8|ez([4-7]0|os|wa|ze)|fetc|fly(\-|_)|g1 u|g560|gene|gf\-5|g\-mo|go(\.w|od)|gr(ad|un)|haie|hcit|hd\-(m|p|t)|hei\-|hi(pt|ta)|hp( i|ip)|hs\-c|ht(c(\-| |_|a|g|p|s|t)|tp)|hu(aw|tc)|i\-(20|go|ma)|i230|iac( |\-|\/)|ibro|idea|ig01|ikom|im1k|inno|ipaq|iris|ja(t|v)a|jbro|jemu|jigs|kddi|keji|kgt( |\/)|klon|kpt |kwc\-|kyo(c|k)|le(no|xi)|lg( g|\/(k|l|u)|50|54|\-[a-w])|libw|lynx|m1\-w|m3ga|m50\/|ma(te|ui|xo)|mc(01|21|ca)|m\-cr|me(rc|ri)|mi(o8|oa|ts)|mmef|mo(01|02|bi|de|do|t(\-| |o|v)|zz)|mt(50|p1|v )|mwbp|mywa|n10[0-2]|n20[2-3]|n30(0|2)|n50(0|2|5)|n7(0(0|1)|10)|ne((c|m)\-|on|tf|wf|wg|wt)|nok(6|i)|nzph|o2im|op(ti|wv)|oran|owg1|p800|pan(a|d|t)|pdxg|pg(13|\-([1-8]|c))|phil|pire|pl(ay|uc)|pn\-2|po(ck|rt|se)|prox|psio|pt\-g|qa\-a|qc(07|12|21|32|60|\-[2-7]|i\-)|qtek|r380|r600|raks|rim9|ro(ve|zo)|s55\/|sa(ge|ma|mm|ms|ny|va)|sc(01|h\-|oo|p\-)|sdk\/|se(c(\-|0|1)|47|mc|nd|ri)|sgh\-|shar|sie(\-|m)|sk\-0|sl(45|id)|sm(al|ar|b3|it|t5)|so(ft|ny)|sp(01|h\-|v\-|v )|sy(01|mb)|t2(18|50)|t6(00|10|18)|ta(gt|lk)|tcl\-|tdg\-|tel(i|m)|tim\-|t\-mo|to(pl|sh)|ts(70|m\-|m3|m5)|tx\-9|up(\.b|g1|si)|utst|v400|v750|veri|vi(rg|te)|vk(40|5[0-3]|\-v)|vm40|voda|vulc|vx(52|53|60|61|70|80|81|83|85|98)|w3c(\-| )|webc|whit|wi(g |nc|nw)|wmlb|wonu|x700|yas\-|your|zeto|zte\-/i.test(a.substr(0,4)))check = true})(navigator.userAgent||navigator.vendor||window.opera);
        return !check;
    })();



	$routeProvider.when('/index', {
	templateUrl : '/Delivery2Home/catalouge.html'

	}).when('/modal', {
	templateUrl : '/Delivery2Home/description.html'

	}).when('/main', {
	templateUrl : (_isNotMobile )?'/Delivery2Home/cover.html':'/Delivery2Home/aboutus.html'

	}).when('/aboutus', {
	templateUrl : '/Delivery2Home/aboutus.html'

	}).when('/orderconfirmation', {
	templateUrl : '/Delivery2Home/orderconfirmation.html'

	}).when('/myorder', {
	templateUrl : '/Delivery2Home/myorder.html'

	}).otherwise({
        redirectTo: '/main'
      });

	

	}]);*/

var _isNotMobile = (function() {
        var check = false;
        (function(a){if(/(android|bb\d+|meego).+mobile|avantgo|bada\/|blackberry|blazer|compal|elaine|fennec|hiptop|iemobile|ip(hone|od)|iris|kindle|lge |maemo|midp|mmp|netfront|opera m(ob|in)i|palm( os)?|phone|p(ixi|re)\/|plucker|pocket|psp|series(4|6)0|symbian|treo|up\.(browser|link)|vodafone|wap|windows (ce|phone)|xda|xiino/i.test(a)||/1207|6310|6590|3gso|4thp|50[1-6]i|770s|802s|a wa|abac|ac(er|oo|s\-)|ai(ko|rn)|al(av|ca|co)|amoi|an(ex|ny|yw)|aptu|ar(ch|go)|as(te|us)|attw|au(di|\-m|r |s )|avan|be(ck|ll|nq)|bi(lb|rd)|bl(ac|az)|br(e|v)w|bumb|bw\-(n|u)|c55\/|capi|ccwa|cdm\-|cell|chtm|cldc|cmd\-|co(mp|nd)|craw|da(it|ll|ng)|dbte|dc\-s|devi|dica|dmob|do(c|p)o|ds(12|\-d)|el(49|ai)|em(l2|ul)|er(ic|k0)|esl8|ez([4-7]0|os|wa|ze)|fetc|fly(\-|_)|g1 u|g560|gene|gf\-5|g\-mo|go(\.w|od)|gr(ad|un)|haie|hcit|hd\-(m|p|t)|hei\-|hi(pt|ta)|hp( i|ip)|hs\-c|ht(c(\-| |_|a|g|p|s|t)|tp)|hu(aw|tc)|i\-(20|go|ma)|i230|iac( |\-|\/)|ibro|idea|ig01|ikom|im1k|inno|ipaq|iris|ja(t|v)a|jbro|jemu|jigs|kddi|keji|kgt( |\/)|klon|kpt |kwc\-|kyo(c|k)|le(no|xi)|lg( g|\/(k|l|u)|50|54|\-[a-w])|libw|lynx|m1\-w|m3ga|m50\/|ma(te|ui|xo)|mc(01|21|ca)|m\-cr|me(rc|ri)|mi(o8|oa|ts)|mmef|mo(01|02|bi|de|do|t(\-| |o|v)|zz)|mt(50|p1|v )|mwbp|mywa|n10[0-2]|n20[2-3]|n30(0|2)|n50(0|2|5)|n7(0(0|1)|10)|ne((c|m)\-|on|tf|wf|wg|wt)|nok(6|i)|nzph|o2im|op(ti|wv)|oran|owg1|p800|pan(a|d|t)|pdxg|pg(13|\-([1-8]|c))|phil|pire|pl(ay|uc)|pn\-2|po(ck|rt|se)|prox|psio|pt\-g|qa\-a|qc(07|12|21|32|60|\-[2-7]|i\-)|qtek|r380|r600|raks|rim9|ro(ve|zo)|s55\/|sa(ge|ma|mm|ms|ny|va)|sc(01|h\-|oo|p\-)|sdk\/|se(c(\-|0|1)|47|mc|nd|ri)|sgh\-|shar|sie(\-|m)|sk\-0|sl(45|id)|sm(al|ar|b3|it|t5)|so(ft|ny)|sp(01|h\-|v\-|v )|sy(01|mb)|t2(18|50)|t6(00|10|18)|ta(gt|lk)|tcl\-|tdg\-|tel(i|m)|tim\-|t\-mo|to(pl|sh)|ts(70|m\-|m3|m5)|tx\-9|up(\.b|g1|si)|utst|v400|v750|veri|vi(rg|te)|vk(40|5[0-3]|\-v)|vm40|voda|vulc|vx(52|53|60|61|70|80|81|83|85|98)|w3c(\-| )|webc|whit|wi(g |nc|nw)|wmlb|wonu|x700|yas\-|your|zeto|zte\-/i.test(a.substr(0,4)))check = true})(navigator.userAgent||navigator.vendor||window.opera);
        return !check;
    })();




	$routeProvider.when('/index', {
	templateUrl : '/Delivery2Home/catalouge.html'

	}).when('/modal', {
	templateUrl : '/Delivery2Home/description.html'

	}).when('/main', {
	templateUrl :(_isNotMobile )?'/Delivery2Home/cover.html':'/Delivery2Home/mobile.html'

	}).when('/aboutus', {
	templateUrl : '/Delivery2Home/aboutus.html'

	}).when('/faq', {
	templateUrl : '/Delivery2Home/faq.html'

	}).when('/orderconfirmation', {
	templateUrl : '/Delivery2Home/orderconfirmation.html'

	}).when('/myorder', {
	templateUrl : '/Delivery2Home/myorder.html'

	}).when('/success', {
	templateUrl : '/Delivery2Home/success.html'

	}).when('/failure', {
	templateUrl : '/Delivery2Home/failure.html'

	}).otherwise({
        redirectTo: '/main'
      });

	

	}]);
	
	
	
	myapp.directive('zoom2', ['$compile',
  function($compile) {
    return {
      restrict: 'AEC',
      scope: {
        tiny: "=",
        small: "=",
        big: "=",
        title: "="
      },
      //Template doesn't seem work correctly, leaves a loading message.
      //template: '<a href="{{big}}" class="cloud-zoom" rel="adjustX: 10, adjustY:-4"><img src="{{small}}"/></a>',
      //replace: true,
      controller: ["$scope", "$attrs", "$element", "$compile",
        function($scope, $attrs, $element, $compile) {

		
		
          $scope.init = function() {


            //Create a watch to know when to open the PopOver Text
            $scope.$watch('tiny + small + big + title', function(newValue, oldValue) {
              console.log("in watch.");

				var url="http://localhost:8080/Delivery2Home/img/"+$scope.small+"s.jpeg";
				var small="http://localhost:8080/Delivery2Home/img/"+$scope.small+".jpeg";
              var str =  ' <a href="' + url + '" class="cloud-zoom" rel="adjustX: 10, adjustY:-4">' +
                '<img src="' + small+ '"/></a>';
              var e = $compile(str)($scope);

              $element.html(e);

              $(".cloud-zoom, .cloud-zoom-gallery").CloudZoom();

            }, true);

          }; // end init

          //set the popover properties
          $scope.init();

        }
      ]

    };
  }
]);
	
	
	
	myapp.directive('category', function() {
var a="red";
  return {
	  link: function(scope, element, attr) {
		  var color=hexToRgb(("#"+Math.floor(100000 + Math.random() * 900000)))
	  element.css({
		 border:'2px solid',
		  borderColor:'rgba('+color.r+','+color.g+','+color.b+','+0.5+')'
		  });
	  },
	   restrict: 'AE'
    
  };
});

myapp.directive("loadMoreData", [function() {
        return {
            restrict: 'ACE',
            link: function($scope, element, attrs, ctrl) {
                var raw = element[0];
                element.scroll(function() {
                    if (raw.scrollTop + raw.offsetHeight >= raw.scrollHeight){
                        $scope.$apply("loadMoreData()");
                    }
                });
            }
        };
 
}]);



function hexToRgb(hex) {
    // Expand shorthand form (e.g. "03F") to full form (e.g. "0033FF")
    var shorthandRegex = /^#?([a-f\d])([a-f\d])([a-f\d])$/i;
    hex = hex.replace(shorthandRegex, function(m, r, g, b) {
        return r + r + g + g + b + b;
    });

    var result = /^#?([a-f\d]{2})([a-f\d]{2})([a-f\d]{2})$/i.exec(hex);
    return result ? {
        r: parseInt(result[1], 16),
        g: parseInt(result[2], 16),
        b: parseInt(result[3], 16)
    } : null;
}




myapp.directive("bottomreached", function ( $document, $window) {
    return function(scope, element, attrs) {	
       
	   angular.element($window).bind("scroll", function() {
    var windowHeight = "innerHeight" in window ? window.innerHeight : document.documentElement.offsetHeight;
    var body = document.body, html = document.documentElement;
    var docHeight = Math.max(body.scrollHeight, body.offsetHeight, html.clientHeight,  html.scrollHeight, html.offsetHeight);
    windowBottom = windowHeight + window.pageYOffset;
    if (windowBottom >= docHeight) {
        alert('bottom reached');
		
                
				
				console.log('at end'+Math.random())
				
				
				/* for(var i=0;i<50;i++)
				{
					var a={};
					a.productName="salvar"+Math.random();
				
					a.productId=Math.round(Math.random()*240+23 )+Math.round(Math.random()*240+130 );
					
					scope.products.push(a);
					   scope.$apply();
				}
							 */
							 
							 scope.loadmoreproducts();
				
		 
             	  
          
    }
	  scope.$apply();scope.$digest();
});
	   
	
    };
});



myapp.directive("yourordertopmargin", function ( $document, $window) {
    return function(scope, element, attrs) {	
       angular.element($window).bind("scroll", function() {
   


			if (this.pageYOffset <= 100) {
                
				
				console.log('at end'+Math.random())
				
				
				for(var i=0;i<10;i++)
				{
					var a={};
					a.productName="salvar"+Math.random();
				
					a.productId=Math.round(Math.random()*240+23 )+Math.round(Math.random()*240+130 );
					
					scope.products.push(a);
					   scope.$apply();
				}
				
				
				
		 
                 console.log('Scrolled below header.');
             } 
	  
            scope.$apply();scope.$digest();
        });
    };
});
myapp.directive("scroll", function ($window) {
    return function(scope, element, attrs) {	
        angular.element($window).bind("scroll", function() {
		
			
             if (this.pageYOffset >= 100) {
                 scope.boolChangeClass = true;
				 
                 console.log('Scrolled below header.');
             } else {
                 scope.boolChangeClass = false;
				 
                 console.log('Header is in view.');
             }
			 var a=this.pageYOffset+200;
			 scope.topheight="{'margin':'"+a+"'}";
            scope.$apply();
        });
    };
});






myapp.directive('onlyDigits', function () {

    return {
        restrict: 'A',
        require: 'ngModel',
        link: function (scope, element, attrs, modelCtrl) {
            modelCtrl.$parsers.push(function (inputValue) {
                if (inputValue == undefined) return '';
                var transformedInput = inputValue.replace(/[^0-9]/g, '');
                if (transformedInput !== inputValue) {
                    modelCtrl.$setViewValue(transformedInput);
                    modelCtrl.$render();
                }
                return transformedInput;
            });
        }
    };
});
/* code for angularmodal window*/
angular.module('myapp').controller('ModalInstanceCtrl', function ($scope, $modalInstance,cart,$http,$rootScope,$cookieStore,$location,$localStorage) {

$scope.cart = cart;

$scope.selectAddressfunction=function(index)
{
	$scope.selectedAddress.index=index;
	$scope.modalcheckout.showAddressnext=true;
}



$scope.redirecttoGoogle = function () {

$modalInstance.close();
};

$scope.redirecttoFacebook = function () {

$modalInstance.close();
};

$scope.redirecttoLnkedin = function () {

$modalInstance.close();
};
$scope.modalcheckout.checkout=true;
$scope.modalcheckout.showAddress=false;
$scope.modalcheckout.finalcheckout=false;
$scope.modalcheckout.showpayment=false;

$scope.ok = function () {
$modalInstance.close();
};

$scope.selectAddress=function (index) {

if(index=="z")
{
	
}else
{
	
	
}
};
$scope.customaddress= function () {

$scope.customaddressflag=true;	

}
$scope.checkoutfunction = function () {

	$scope.user = $cookieStore.get('validuser');
if(typeof $scope.user== 'undefined')
{
	
	$scope.openLogin();
}
else
{
if($scope.user.valid)
{
$scope.modalcheckout.showAddressnext=false;
$scope.modalcheckout.showAddress=true;
$scope.modalcheckout.checkout=false;
//$scope.modalcheckout.finalcheckout=false;

$scope.modalcheckout.showpayment=false;
$scope.openwaitingpopoup();
	$http({method:'POST',url:'/Delivery2Home/address',data:$scope.user}).success(function(data) {
	$scope.userdetail.addresses=data;
	$scope.hidewaitingpopoup();
}).error(function(data){
	$scope.hidewaitingpopoup();
	console.log("Errorssss while fetchin address");
	});;



}else{
	$scope.openLogin();
}
}
$scope.size='sm';
};
$scope.cancel = function () {
$modalInstance.dismiss('cancel');

};

$scope.login = function () {
	$http({method:'POST',url:'/Delivery2Home/login',data:$scope.loginUser}).success(function(data) {
	console.log(JSON.stringify($scope.loginUser,null," "));
	console.log(JSON.stringify(data,null," "));
	console.log(data);
	//$scope.user.isvalid = true;
	$scope.user.firstName = data.firstName;
	$scope.user.lastName = data.lastName;
	$scope.user.valid=data.valid;
	
	$cookieStore.put('validuser', data);
	$scope.cancel();
	}).error(function(data){
	console.log("Errorssss");
	});;
var name=angular.element(document.querySelector('#inputEmail'));






};

$scope.getotp = function () {

	$http({method:'POST',url:'/Delivery2Home/otp',data:$scope.loginUser}).success(function(data) {
	console.log(JSON.stringify($scope.loginUser,null," "));
	console.log(JSON.stringify(data,null," "));
	console.log(data);
	$cookieStore.put('validuser', data);
	//$scope.user.isvalid = true;
	$scope.otp = true;
	
	}).error(function(data){
	console.log("Errorssss");
	});;
	};
	$scope.validateotp = function () {
		var storeduser = $cookieStore.get('validuser');
	if(storeduser.otp == $scope.loginUser.otp)
	{
		$scope.modalcheckout.showAddress=true;
		$scope.modalcheckout.checkout=false;
		$scope.modalcheckout.showpayment=false;
		$scope.otperror=false;
		$scope.user.mobileNumber=storeduser.mobileNumber;
		$scope.user.email=storeduser.email;
		$scope.user.lastName=storeduser.lastName;
		$scope.user.firstName=storeduser.firstName;
		$scope.user.valid=true;
		$scope.openwaitingpopoup();
		$http({method:'POST',url:'/Delivery2Home/address',data:storeduser}).success(function(data) {
		$scope.userdetail.addresses=data;
	$scope.hidewaitingpopoup();
}).error(function(data){
	console.log("Errorssss while fetchin address");
	$scope.hidewaitingpopoup();
	});;
		
	$cookieStore.put('validuser', $scope.user);
	$scope.cancel();
	}
	else{
		$scope.otperror=true;
		
		
	}
	
	
	};
	
	
var name=angular.element(document.querySelector('#inputEmail'));

$scope.applycoupon=function()
{
	$scope.coupons={};
	
	$scope.coupons.shoppingAmount=$scope.cart.subtotal;
	$scope.coupons.couponCode=$scope.coupon.couponCode;
  $scope.openwaitingpopoup();
	  	$http({method:'POST',url:'/Delivery2Home/validateCoupan',data:$scope.coupons}).success(function(data) {
	
	console.log(JSON.stringify(data,null," "));
	console.log(data);
	$scope.cart.maxDiscountAmount=data.maxDiscountAmount;
	if(parseInt(data.maxDiscountAmount)>0)
	{
	$scope.cart.Total=$scope.cart.subtotal-parseInt(data.maxDiscountAmount);
	}
	$scope.hidewaitingpopoup();

	}).error(function(data){
			  console.log("Errorssss while applying coupon code");
	});;
	  
	  
}








$scope.signup = function () {
	
	console.log(JSON.stringify($scope.user,null," "));
		$http({method:'POST',url:'/Delivery2Home/signUp',data:$scope.user}).success(function(data) {
	$scope.greeting = data;
	console.log(JSON.stringify(data,null," "));
	console.log(data);
$scope.cancel();

	}).error(function(data){
	console.log("Errorssss");
	});;


	
	
	
	


};


$scope.forgotpassword = function () {
	
	console.log(JSON.stringify($scope.forgot,null," "));
		$http({method:'POST',url:'/Delivery2Home/forgetPassword',data:$scope.forgot}).success(function(data) {
	$scope.greeting = data;
	console.log(JSON.stringify(data,null," "));
	console.log(data);
	if(data.valid==true)
	{
		$scope.cancel();
	}else{
		
	}


	}).error(function(data){
	console.log("Errorssss");
	});;


	
	
	
	


};

$scope.sendInvitation=function () {
console.log(JSON.stringify($scope.seller,null," "));
		$http({method:'POST',url:'/Delivery2Home/sellerSignUp',data:$scope.seller}).success(function(data) {
	$scope.greeting = data;
	console.log(JSON.stringify(data,null," "));
	console.log(data);
	$scope.showmessagetoseller=true;

	}).error(function(data){
	console.log("Errorssss");
	});;


};


});
myapp.controller('myCtrl', ['$scope','$location','$cookieStore','$timeout','$modal','$http','$window','$rootScope','$cacheFactory','$localStorage',function( $scope , $location ,$cookieStore,$timeout,$modal,$http,$window,$rootScope,$cacheFactory,$localStorage,$modalInstance,uiGmapGoogleMapApi){



$scope.showloaderimage=false;
  $scope.topsellinglist1=[];
$scope.topsellinglist2=[];
$scope.topsellinglist3=[];
$scope.topsellinglist4=[];
$scope.topsellinglist=[];
$scope.mostpopularlist=[];
$scope.maxdiscountlist=[];
$scope.descriptionimage={};

$scope.myInterval = 5000;
  $scope.noWrapSlides = false;
  
  	$scope.imagearray=['111','112','113','114','115','116','117','118','119','120','121','122'];
   $scope.slides = [
	   {
		   "image":"img/banner1.jpg",
		   "text":"First Slide"
	   },
	   {
		   "image":"img/banner2.jpg",
		   "text":"First Slide"
	   },{
		   "image":"img/banner3.jpg",
		   "text":"First Slide"
	   },{
		   "image":"img/banner4.jpg",
		   "text":"First Slide"
	   }]
	   
   ;
$rootScope.latitude=18;
$rootScope.longitude=20;
$scope.errors={};
$scope.userorder ={};
$scope.userorder.orders=[];
	$scope.relatedItems=[];
	$scope.coupons={};
	$scope.modalcheckout = {};
	$scope.userdetail = {};
	$scope.payment={};
	$scope.pay={};
	$scope.conf={};
	$scope.selectedAddress={};
			$scope.finalOrder={};
			$scope.customeAddress={};
			$scope.newcustomer={};
			$scope.paymentgtewayresponse={};
			$scope.contact={};
			$scope.ui={};
			$scope.ui.displayproduct={}
			$scope.ui.searchcriteria={};
			$scope.ui.searchcriteria.category={};
			$scope.ui.counter=50;

$scope.contactussubmit=function () {
console.log(JSON.stringify($scope.contact,null," "));
		$http({method:'POST',url:'/Delivery2Home/contactUs',data:$scope.contact}).success(function(data) {
	$scope.greeting = data;
	console.log(JSON.stringify(data,null," "));
	console.log(data);
	$scope.showmessagetocustomer=true;
		$scope.contact={};
	}).error(function(data){
	console.log("Errorssss");
	});;


};

$scope.loadMoreData=function()
{
	alert("End of page");
};
$scope.callpayment=function(order,selectedAddress)
{
	
	
	if($scope.pay.online)
		
	{	
	$scope.openwaitingpopoup();
	$scope.storeFinalOrder();
		var payuForm = document.forms.payuForm;
		
		payuForm.submit();
	}else{
		$scope.placeOrder();
		
	}
	$scope.cancel();
	
}

$scope.calculateshippingcharges=function()
{
	if(finalOrder.Total>250)
	return 0;
else
	return 30;
}

$scope.nextorder=function(order,selectedAddress)
{

if($scope.validateAddress())
{
	
}else{
$scope.pay.online=false;
$scope.pay.cash=false;
$scope.pay.swipe=false;
$scope.modalcheckout.checkout=false;
$scope.modalcheckout.showAddress=false;
$scope.modalcheckout.finalcheckout=false;
$scope.modalcheckout.showpayment=true;
if($scope.selectedAddress.index==999)
{
$scope.finalOrder.address=$scope.customeAddress;
}else{
if(typeof $scope.selectedAddress.index!='undefined')
$scope.finalOrder.address=$scope.userdetail.addresses[$scope.selectedAddress.index];
else
$scope.finalOrder.address=$scope.customeAddress;	
}
}	
}
$scope.validateAddress=function()
{
	if($scope.selectedAddress.index==999)
	{
	
	return $scope.validateOnlyAddress();
	}else{
	if(typeof $scope.selectedAddress.index=='undefined')
	{
	return($scope.validateOnlyAddress()&&$scope.validatenewcustomer())
	}
	}
}

$scope.validatenewcustomer=function()
{
if($scope.validateString($scope.customeAddress.firstName))
	{
		$scope.errors.address.firstName=true;
		return true;
	}

f($scope.validateString($scope.customeAddress.lastName))
	{
		$scope.errors.address.lastName=true;
		return true;
	}	
}

$scope.validateOnlyAddress=function()
{
	$scope.errors.address={};
	if($scope.validateString($scope.customeAddress.addressLine1))
	{
		$scope.errors.address.addressLine1=true;
		return true;
	}

	if($scope.validateString($scope.customeAddress.landMark))
	{
		$scope.errors.address.landMark=true;
		return true;
	}
	if($scope.validateString($scope.customeAddress.locality))
	{
		$scope.errors.address.locality=true;
		return true;
	}
	if(validateEmail($scope.customeAddress.email))
	{
		$scope.errors.address.email=true;
		return true;
	}
	
}
$scope.validateString=function(str)
{
	if( isEmpty(str) || isBlank(str)|| isEmpty(str))
	{
		return true;
	}
}


$scope.filterValue = function(e){
        var specialKeys = new Array();
        specialKeys.push(8); //Backspace
       
            var keyCode = e.which ? e.which : e.keyCode
            var ret = ((keyCode >= 48 && keyCode <= 57) || specialKeys.indexOf(keyCode) != -1);
            if(!ret)
			{
				 e.preventDefault();
				 return false;
			}
			

        
};

//For checking if a string is empty, null or undefined I use:

function isEmpty(str) {
    return (!str || 0 === str.length);
}
//For checking if a string is blank, null or undefined I use:

function isBlank(str) {
    return (!str || /^\s*$/.test(str));
}
//For checking if a string is blank or contains only white-space:

String.prototype.isEmpty = function(str) {
    return (str.length === 0 || !str.trim());
};

function ValidateMobNumber(txtMobId) {
  

  if (txtMobId == "") {
   return false;
 }
  else if (isNaN(txtMobId)) {
    return false;
 }
 else if (!(txtMobId.length == 10)) {
   return false;
 }

}


function validateEmail(email) {
	
	
    var re = /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    return !re.test(email);
}

$scope.storeFinalOrder=function()
{
		//$scope.finalOrder={};

	$scope.finalOrder.productList={};
	$scope.finalOrder.customer = $cookieStore.get('validuser');
	
	
	if(typeof $scope.finalOrder.address=='undefined')
	{
	if($scope.selectedAddress.index==999)
	{
		$scope.finalOrder.address=$scope.customeAddress;
	}else{
		if(typeof $scope.selectedAddress.index!='undefined')
		$scope.finalOrder.address=$scope.userdetail.addresses[$scope.selectedAddress.index];
	else
	$scope.finalOrder.address=$scope.customeAddress;	
	}
	}
	
	if($scope.finalOrder.address.mobileNumber ==null)
	{
		$scope.finalOrder.address.mobileNumber=$scope.finalOrder.customer.mobileNumber;
	}
	$scope.finalOrder.orderQty=$rootScope.itemsaddedtocart;
	if($scope.finalOrder.customer.email==null)
	{
		$scope.finalOrder.customer.email=$scope.finalOrder.address.email;
	}
	if($scope.finalOrder.customer.firstName==null && $scope.userdetail.addresses.length==0)
	{
		$scope.finalOrder.customer.firstName=$scope.newcustomer.firstName;
	}
	if($scope.finalOrder.customer.lastName==null && $scope.userdetail.addresses.length==0 )
	{
		$scope.finalOrder.customer.lastName=$scope.newcustomer.lastName;
	}
	
	
	

	$scope.finalOrder.productList=$scope.cart.products;
	for(var i=0;i<$scope.finalOrder.productList.length;i++)
	{
		var product=$scope.finalOrder.productList[i];
		product.orderQty=product.numberOfItemsIncart;
		$scope.finalOrder.productList[i]=product;
	}

	$scope.finalOrder.orderStatus="Submitted";
	if($scope.pay.online)
	{
	$scope.finalOrder.paymentType="Online";
	}else if($scope.pay.cash)
	{
		$scope.finalOrder.paymentType="Cash";
	}else if($scope.pay.swipe)
	{
		$scope.finalOrder.paymentType="Swipe";
	}
	$scope.finalOrder.couponDiscount=$scope.cart.maxDiscountAmount;
	$scope.finalOrder.orderDesc= "Best Quality Grocery Order",
	console.log("Order:"+JSON.stringify($scope.finalOrder,null,4));
	$scope.finalOrder.subtotal=$scope.cart.Total;
	$scope.finalOrder.Total=$scope.finalOrder.subtotal-	$scope.finalOrder.couponDiscount;
	$localStorage.finalOrder=$scope.finalOrder;
//$location.path('/orderconfirmation');
	}

$scope.openwaitingpopoup=function(){
	$rootScope.modalInstance=$modal.open({
		templateUrl:'process.html',
		controller:'myCtrl',
		size:'sm',
		backdrop:'static'
		
	})
	

}
$scope.hidewaitingpopoup=function(){
if($rootScope.modalInstance!=null)
{
	$rootScope.modalInstance.close();
}
}
$scope.placeOrder=function()
{
		//$scope.finalOrder={};
   $scope.showloaderimage=true;
	$scope.finalOrder.productList={};
	$scope.finalOrder.customer = $cookieStore.get('validuser');
	
	
	if(typeof $scope.finalOrder.address=='undefined')
	{
	if($scope.selectedAddress.index==999)
	{
		$scope.finalOrder.address=$scope.customeAddress;
	}else{
		if(typeof $scope.selectedAddress.index!='undefined')
		$scope.finalOrder.address=$scope.userdetail.addresses[$scope.selectedAddress.index];
	else
	$scope.finalOrder.address=$scope.customeAddress;	
	}
	}
	
	if($scope.finalOrder.address.mobileNumber ==null)
	{
		$scope.finalOrder.address.mobileNumber=$scope.finalOrder.customer.mobileNumber;
	}
	$scope.finalOrder.orderQty=$rootScope.itemsaddedtocart;
	if($scope.finalOrder.customer.email==null)
	{
		$scope.finalOrder.customer.email=$scope.finalOrder.address.email;
	}
	if($scope.finalOrder.customer.firstName==null && $scope.userdetail.addresses.length==0)
	{
		$scope.finalOrder.customer.firstName=$scope.newcustomer.firstName;
	}
	if($scope.finalOrder.customer.lastName==null && $scope.userdetail.addresses.length==0 )
	{
		$scope.finalOrder.customer.lastName=$scope.newcustomer.lastName;
	}
	
	
	

	$scope.finalOrder.productList=$scope.cart.products;
	for(var i=0;i<$scope.finalOrder.productList.length;i++)
	{
		var product=$scope.finalOrder.productList[i];
		product.orderQty=product.numberOfItemsIncart;
		$scope.finalOrder.productList[i]=product;
	}

	$scope.finalOrder.orderStatus="Submitted";
	if($scope.pay.cash)
	$scope.finalOrder.paymentType="Cash";
	if($scope.pay.swipe)
	$scope.finalOrder.paymentType="Swipe";
	$scope.finalOrder.couponDiscount=$scope.cart.maxDiscountAmount;
	$scope.finalOrder.orderDesc= "Best Quality Grocery Order",
	console.log("Order:"+JSON.stringify($scope.finalOrder,null,4));
	delete $scope.finalOrder.subtotal;
	delete $scope.finalOrder.Total;
	
	$http({method:'POST',url:'/Delivery2Home/insertOrder',data:$scope.finalOrder}).success(function(data) {
	
	$scope.orderSuccess=true;
	$scope.finalOrder.subtotal=$scope.cart.Total;
	$scope.finalOrder.Total=parseInt($scope.finalOrder.subtotal)-	parseFloat($scope.finalOrder.couponDiscount);
	$localStorage.finalOrder=$scope.finalOrder;
		$location.url('/success');

	if(!(typeof $scope.newcustomer=="undefined"))
	{
	if(!(typeof $scope.newcustomer.firstName=="undefined"))
	{
	if($scope.newcustomer.firstName!=null)
	{
		$cookieStore.remove('validuser');
	}
	}
	}
	$scope.cart={};
	
	$scope.selectedAddress={};
	$scope.resetallobject();
	$scope.showloaderimage=false;
}).error(function(data){
		$scope.showloaderimage=false;
		$location.path('/failure');
	console.log("Errorssss while insertOrder");
	
	});;
	
}





$scope.placeFinalOrder=function()
{
		//$scope.finalOrder={};
		  
		$scope.finalOrder=$localStorage.finalOrder;
	delete $scope.finalOrder.subtotal;
	delete $scope.finalOrder.Total;
	$scope.showloaderimage=true;
	$http({method:'POST',url:'/Delivery2Home/insertOrder',data:$scope.finalOrder}).success(function(data) {
	
	$scope.conf.orderSuccess=true;
	$scope.finalOrder.subtotal=$scope.cart.Total;
	$scope.finalOrder.Total=parseInt($scope.finalOrder.subtotal)-	parseFloat($scope.finalOrder.couponDiscount);
	$localStorage.finalOrder=$scope.finalOrder;
//$location.path('/orderconfirmation');
	$scope.modalcheckout.checkout=false;
$scope.modalcheckout.showAddress=false;
$scope.modalcheckout.finalcheckout=true;
	if(!typeof $scope.newcustomer=="undefined")
	{
	if(!typeof $scope.newcustomer.firstName=="undefined")
	{
	if($scope.newcustomer.firstName!=null)
	{
		$cookieStore.remove('validuser');
	}
	}
	}
	$scope.cart={};
	
	$scope.selectedAddress={};
	$scope.resetallobject();
	$scope.showloaderimage=false;
}).error(function(data){
	$scope.showloaderimage=false;
	console.log("Errorssss while insertOrder");
	});;
	
}

$scope.paymentstatus=function()
{
$scope.modalcheckout.showpayment=true;
$scope.modalcheckout.showAddress=false;

	
	if($scope.selectedAddress.index==999)
	{
		$scope.finalOrder.address=$scope.customeAddress;
	}else{
		if(typeof $scope.selectedAddress.index!='undefined')
		$scope.finalOrder.address=$scope.userdetail.addresses[$scope.selectedAddress.index];
	else
	$scope.finalOrder.address=$scope.customeAddress;	
	}
	
}


function getLocation() {
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(showPosition);
    } else {
        console.log("Geolocation is not supported by this browser.");
    }
	$rootScope.map = { center: { latitude: $rootScope.latitude, longitude: $rootScope.longitude }, zoom: 6 };
$rootScope.marker = {
    id: 0,
    coords: {
        latitude:  $rootScope.latitude,
        longitude: $rootScope.longitude
    },
    options: {
        draggable: false,
        title: 'Your Sweet Home',
        animation: 1 // 1: BOUNCE, 2: DROP
    }
};	
}




function showPosition(position) {
	
	$rootScope.latitude=position.coords.latitude;
	$rootScope.longitude=position.coords.longitude;
    console.log( "Latitude: " + position.coords.latitude + 
    "Longitude: " + position.coords.longitude);

}
$scope.randomnumber={};

$scope.seller={};
$scope.showlogin=true;
var modalInstanceLogin;
$scope.productdescription={};
var cache = $cacheFactory.get('$http');



$rootScope.putIntoLocalStaorage=function (value) {
$localStorage.cart=value;



}


$scope.makepayment=function(input)
{
	$scope.modalcheckout.submitfinalorder=true;
	
	if(input=='cash')
	{		
		$scope.pay.online=false;
		$scope.pay.cash=true;
		$scope.pay.swipe=false;
	
	}else if( input=='swipe' )
		
		{
		$scope.pay.online=false;
		$scope.pay.cash=false;
		$scope.pay.swipe=true;
			
		}else if(input=='online')
		{
			
		$scope.pay.online=true;
		$scope.pay.cash=false;
		$scope.pay.swipe=false;
		
		$scope.json=JSON.parse('{"amount":"100","firstname":"sagar","email":"sagarthakare1@gmail.com","phone":"9422915439","productinfo":"Grains"}');

		$scope.payment.amount=$scope.cart.Total;

		var user=$cookieStore.get('validuser');
		
		$scope.payment.email=$scope.finalOrder.address.email;
		$scope.payment.firstname=$scope.finalOrder.address.city;
		$scope.payment.productinfo=$scope.finalOrder.address.city;
		$scope.payment.phone=user.mobileNumber;
		console.log(JSON.stringify($scope.payment));
			$http({method:'POST',url:'/Delivery2Home/getpayment',data:$scope.payment}).success(function(data) {
		console.log(data.email);
		$scope.payment=data;
		console.log(JSON.stringify(data));
		$scope.payment.surl='http://delivery2home.com/Delivery2Home/success.jsp';
		$scope.payment.furl='http://delivery2home.com/Delivery2Home/#/failure';
			//$http({method:'POST',url:'https://test.payu.in/_payment',data:data});
		var url='&key='+data.key+'&hash='+data.hash+'&service_provider='+data.service_provider+'&amount='+data.amount+'&firstname='+data.firstname+'&email='+data.email+'&phone='
		+data.phone+'&productinfo='+data.productinfo+'&txnid='+data.txnid+'&surl='+'http://localhost:8080/#/success'+'&furl='+data.furl
		;
			console.log(url);
			
		//	var completeurl='https://test.payu.in/_payment?method=post'+url;
		//$window.location.href=completeurl; 
			}).error(function(data){
				console.log("Errorssss while fetchin paymentdetails");
				});
		}
	
$localStorage.pay=$scope.pay;
	
}


$scope.showorder=function()
{
	$location.path('/myorder');
	$http({method:'POST',url:'/Delivery2Home/orders',data:$scope.user}).success(function(data) {
	$scope.userorder = data;
	console.log(JSON.stringify(data,null," "));
	console.log(data);
	
		$scope.userorder.orders=data;
	}).error(function(data){
	console.log("Errors While fetchin orders");
	});;
	
}
$scope.resetallobject=function()
{
	$scope.cart={};
$scope.cart.products=[];
	$scope.selectedAddress={};
	for(var i=0;i<$scope.products.length;i++)
	{
		 $scope.products[i].numberOfItemsIncart=0;
		$scope.products[i].totalPriceInCart=0;
	}
	$scope.finalOrder=$localStorage.finalOrder;
	$localStorage.cart={};
	//delete $localStorage.pay;
	$rootScope.itemsaddedtocart=0;
}

$scope.logout=function()
{

	$scope.user={};
	$cookieStore.remove('validuser');
	
	
}

$rootScope.$on('$routeChangeStart', function () {
          //This method will get called whenever we ware moving from one page to other
		 
        });
// in controller
$scope.init = function () {
	
	

	
	
	if(typeof $localStorage.pay!='undefined')
	{
		$scope.pay=$localStorage.pay;
	}
	
			
	
	
	console.log($location.path());
	if($location.path()=='/success')
	{
		if(typeof $localStorage.paymentgtewayresponse!='undefined')
		$scope.paymentgtewayresponse= $localStorage.paymentgtewayresponse;
	
		if (typeof $localStorage.finalOrder!= 'undefined')
					
				$scope.finalOrder=$localStorage.finalOrder;
	if($location.search().ordersubmitted=='1')
	{
		$scope.paymentgtewayresponse.amount=$location.search().amount;
			$scope.paymentgtewayresponse.txnid=$location.search().txnid;
				$scope.paymentgtewayresponse.p_Id=$location.search().p_Id;
					$scope.paymentgtewayresponse.bank_ref_num=$location.search().bank_ref_num;
			$scope.paymentgtewayresponse.mode=$location.search().mode;
		
				$localStorage.paymentgtewayresponse=$scope.paymentgtewayresponse;
				$scope.placeFinalOrder();
				$location.url('/success');
				
				
	}
				
}
	if($location.path()=='/failure')
	{
		if(typeof $localStorage.paymentgtewayresponse!='undefined')
		$scope.paymentgtewayresponse= $localStorage.paymentgtewayresponse;
	if (typeof $localStorage.finalOrder!= 'undefined')
				$scope.finalOrder=$localStorage.finalOrder;
		if (typeof $localStorage.finalOrder!= 'undefined')
			
			
			$scope.paymentgtewayresponse.amount=$location.search().amount;
			$scope.paymentgtewayresponse.txnid=$location.search().txnid;
				$scope.paymentgtewayresponse.p_Id=$location.search().p_Id;
					$scope.paymentgtewayresponse.bank_ref_num=$location.search().bank_ref_num;
			$scope.paymentgtewayresponse.mode=$location.search().mode;
			$scope.paymentgtewayresponse.errors=$location.search().error;
		$localStorage.paymentgtewayresponse=$scope.paymentgtewayresponse;
				
		
	}
	
	if($location.path()=='/myorder')
	{
		
		if($scope.userorder.orders.length==0)
		{
			var user=$cookieStore.get('validuser');
		$http({method:'POST',url:'/Delivery2Home/orders',data:user}).success(function(data) {
	$scope.userorder = data;
	console.log(JSON.stringify(data,null," "));
	console.log(data);
	
		$scope.userorder.orders=data;
	}).error(function(data){
	console.log("Errors While fetchin orders");
	});;
		}
	}
 $scope.isMobile=(function() {
        var check = false;
        (function(a){if(/(android|bb\d+|meego).+mobile|avantgo|bada\/|blackberry|blazer|compal|elaine|fennec|hiptop|iemobile|ip(hone|od)|iris|kindle|lge |maemo|midp|mmp|netfront|opera m(ob|in)i|palm( os)?|phone|p(ixi|re)\/|plucker|pocket|psp|series(4|6)0|symbian|treo|up\.(browser|link)|vodafone|wap|windows (ce|phone)|xda|xiino/i.test(a)||/1207|6310|6590|3gso|4thp|50[1-6]i|770s|802s|a wa|abac|ac(er|oo|s\-)|ai(ko|rn)|al(av|ca|co)|amoi|an(ex|ny|yw)|aptu|ar(ch|go)|as(te|us)|attw|au(di|\-m|r |s )|avan|be(ck|ll|nq)|bi(lb|rd)|bl(ac|az)|br(e|v)w|bumb|bw\-(n|u)|c55\/|capi|ccwa|cdm\-|cell|chtm|cldc|cmd\-|co(mp|nd)|craw|da(it|ll|ng)|dbte|dc\-s|devi|dica|dmob|do(c|p)o|ds(12|\-d)|el(49|ai)|em(l2|ul)|er(ic|k0)|esl8|ez([4-7]0|os|wa|ze)|fetc|fly(\-|_)|g1 u|g560|gene|gf\-5|g\-mo|go(\.w|od)|gr(ad|un)|haie|hcit|hd\-(m|p|t)|hei\-|hi(pt|ta)|hp( i|ip)|hs\-c|ht(c(\-| |_|a|g|p|s|t)|tp)|hu(aw|tc)|i\-(20|go|ma)|i230|iac( |\-|\/)|ibro|idea|ig01|ikom|im1k|inno|ipaq|iris|ja(t|v)a|jbro|jemu|jigs|kddi|keji|kgt( |\/)|klon|kpt |kwc\-|kyo(c|k)|le(no|xi)|lg( g|\/(k|l|u)|50|54|\-[a-w])|libw|lynx|m1\-w|m3ga|m50\/|ma(te|ui|xo)|mc(01|21|ca)|m\-cr|me(rc|ri)|mi(o8|oa|ts)|mmef|mo(01|02|bi|de|do|t(\-| |o|v)|zz)|mt(50|p1|v )|mwbp|mywa|n10[0-2]|n20[2-3]|n30(0|2)|n50(0|2|5)|n7(0(0|1)|10)|ne((c|m)\-|on|tf|wf|wg|wt)|nok(6|i)|nzph|o2im|op(ti|wv)|oran|owg1|p800|pan(a|d|t)|pdxg|pg(13|\-([1-8]|c))|phil|pire|pl(ay|uc)|pn\-2|po(ck|rt|se)|prox|psio|pt\-g|qa\-a|qc(07|12|21|32|60|\-[2-7]|i\-)|qtek|r380|r600|raks|rim9|ro(ve|zo)|s55\/|sa(ge|ma|mm|ms|ny|va)|sc(01|h\-|oo|p\-)|sdk\/|se(c(\-|0|1)|47|mc|nd|ri)|sgh\-|shar|sie(\-|m)|sk\-0|sl(45|id)|sm(al|ar|b3|it|t5)|so(ft|ny)|sp(01|h\-|v\-|v )|sy(01|mb)|t2(18|50)|t6(00|10|18)|ta(gt|lk)|tcl\-|tdg\-|tel(i|m)|tim\-|t\-mo|to(pl|sh)|ts(70|m\-|m3|m5)|tx\-9|up(\.b|g1|si)|utst|v400|v750|veri|vi(rg|te)|vk(40|5[0-3]|\-v)|vm40|voda|vulc|vx(52|53|60|61|70|80|81|83|85|98)|w3c(\-| )|webc|whit|wi(g |nc|nw)|wmlb|wonu|x700|yas\-|your|zeto|zte\-/i.test(a.substr(0,4)))check = true})(navigator.userAgent||navigator.vendor||window.opera);
        return !check;
    })();
	$scope.user={};
	console.log("random"+Math.floor(100000 + Math.random() * 900000));
	$scope.openwaitingpopoup();
	
	
	$scope.loadmoreproducts=function()
	{
		var limit=$scope.ui.counter+50;
		
		
		for(i=$scope.ui.counter;i<limit;i++)
		{
			var product=$scope.masterproducts[i];
			//if($scope.filterproduct(product))
							
			$scope.products.push(product);
				
		}
		$scope.ui.counter=limit;
		
	}
	
	
	$scope.filterproduct=function(product)
	{
		var flag=false;
		if($scope.ui.searchcriteria.category!=0)
		{
			if(product.productCatagory==$scope.ui.searchcriteria.category)
			{
				flag=true;
			}
		}	
		if($scope.ui.searchcriteria.price!=0)
		{
			
		}	
		
		return true;
		
	}
	$scope.updatewithcart=function(products)
	{
		
			if (typeof $localStorage.cart != 'undefined')
	{
	$scope.cart=$localStorage.cart;
	if (typeof $scope.cart.products != 'undefined')
	{
	$rootScope.itemsaddedtocart=$scope.cart.products.length;
	
	if($scope.cart.products.length>0)
	{
	for(var i=0;i< $scope.cart.products.length;i++) {
		var cartProduct=$scope.cart.products[i];
		for(var j=0;j<products.length;j++)
		if(products[j].productId==cartProduct.productId)
		{
			prod=products[j];
			prod.numberOfItemsIncart=parseInt(cartProduct.numberOfItemsIncart);
			prod.totalPriceInCart=parseInt(cartProduct.totalPriceInCart);
			products[j]=prod;
			break;
		}
	}
	}
	}
	}
		
	}
	
	
	$http.get('/Delivery2Home/products/0').
	  then(function(response) {
	
			
		$scope.products = response.data;
		$scope.updatewithcart($scope.products);
	for(i=0;i<$scope.products.length;i++)
{
	
		if($scope.products[i].numberOfItemsIncart==0 )
		{
			if(i<4 )
			{
			$scope.topsellinglist1.push($scope.products[i]);
			}
			if(i>=5 && i<8 )
			{
			$scope.topsellinglist2.push($scope.products[i]);
			}
			if(i>=8 && i<12 )
			{
			$scope.topsellinglist3.push($scope.products[i]);
			}
			if(i>=12 && i<16 )
			{
			$scope.topsellinglist4.push($scope.products[i]);
			}
		
	}
	if(i==25)
	{
		i=$scope.products.length;
		$scope.topsellinglist.push($scope.topsellinglist1);
		$scope.topsellinglist.push($scope.topsellinglist2);
		$scope.topsellinglist.push($scope.topsellinglist3);
		$scope.topsellinglist.push($scope.topsellinglist4);
		$scope.mostpopularlist=$scope.topsellinglist;
$scope.maxdiscountlist=$scope.topsellinglist;
	}
	if(i==($scope.products.length-1))
	{
		$scope.topsellinglist.push($scope.topsellinglist1);
		$scope.topsellinglist.push($scope.topsellinglist2);
		$scope.topsellinglist.push($scope.topsellinglist3);
		$scope.topsellinglist.push($scope.topsellinglist4);
		$scope.mostpopularlist=$scope.topsellinglist;
$scope.maxdiscountlist=$scope.topsellinglist;
	}
}	
	$scope.hidewaitingpopoup();
	  }, function(response) {
		  console.log("Errorssss");
	  });
	  
	  
	  
	  
	  
	  
	  $scope.hidewaitingpopoup();
	  

	  $http.get('/Delivery2Home/allProducts').
	  then(function(response) {
		$scope.masterproducts = response.data;
		$scope.updatewithcart($scope.masterproducts)
	  }, function(response) {
		  console.log("Errorssss");
	  });


	  
	  $http.get('/Delivery2Home/mproducts').
	  then(function(response) {
	
			
		$scope.categories = response.data;
		
	  }, function(response) {
		  console.log("Errorssss");
	  });
	  
	  
	


	
    // check if there is query in url
    // and fire search in case its value is not empty
	console.log("Cart from local storage"+JSON.stringify($localStorage.cart,null," "));

	var a=cache.get("hello");
console.log(a);
var favoriteCookie;
favoriteCookie= $cookieStore.get('productdescription');
var user=$cookieStore.get('validuser');
console.log('variable' + favoriteCookie);
if (typeof favoriteCookie != 'undefined') {
$scope.productdescription = JSON.parse(favoriteCookie);
$scope.descriptionimage=$scope.productdescription .productId;
}
if (typeof user != 'undefined') {
$scope.user=user;
}
	$scope.greeting={};
$scope.hidewaitingpopoup();
};
$scope.open = function () {
	$scope.modalcheckout.submitfinalorder=false;
$scope.modalcheckout.showAddress=false;
$scope.modalcheckout.checkout=true;
$scope.modalcheckout.finalcheckout=false;
$scope.cart.maxDiscountAmount=0;
$scope.cart.Total=$scope.cart.subtotal;
$scope.selectedAddress={};
var modalInstance = $modal.open({
scope:$scope,
templateUrl: 'myModalContent.html',
controller: 'ModalInstanceCtrl',
size:'lg' ,
resolve: {
cart: function () {
return $scope.cart;
}
}

});

}

$scope.openLogin = function () {

modalInstanceLogin = $modal.open({
scope:$scope,
templateUrl: 'login.html',
controller: 'ModalInstanceCtrl',
size:$scope.size ,
resolve: {
cart: function () {
return $scope.cart;
}
}

});

}

$scope.openSignup = function () {
//modalInstanceLogin.close(true);
var modalInstanceSignup = $modal.open({
scope:$scope,
templateUrl: 'signup.html',
controller: 'ModalInstanceCtrl',
size:$scope.size ,
resolve: {
cart: function () {
return $scope.cart;
}
}

});

}
$scope.randomnumbe="#"+Math.floor(100000 + Math.random() * 900000);
$scope.randomnumberss=function (){
	return "#"+Math.floor(100000 + Math.random() * 900000)
	};
$scope.openContactus = function () {
$scope.showmessagetocustomer=false;
var modalInstanceContactus = $modal.open({
scope:$scope,
templateUrl: 'contactus.html',
controller: 'ModalInstanceCtrl',
size:$scope.size ,
resolve: {
cart: function () {
return $scope.cart;
}
}

});

}

$scope.openSeller = function () {
$scope.showmessagetoseller=false;
var modalInstanceSeller = $modal.open({
scope:$scope,
templateUrl: 'seller.html',
controller: 'ModalInstanceCtrl',
size:$scope.size ,

resolve: {
cart: function () {
return $scope.cart;
}
}

});

}

$scope.changeimage=function(id,postfix)
{
	if(postfix=='0')
	{
		$scope.descriptionimage=id;
		
	}else{
		$scope.descriptionimage=id+postfix;
	}
	
}


$scope.openForgotPassword = function () {

	var modalInstanceSignup = $modal.open({
	scope:$scope,
	templateUrl: 'forgotpassword.html',
	controller: 'ModalInstanceCtrl',
	size:$scope.size ,
	resolve: {
	cart: function () {
	return $scope.cart;
	}
	}

	});

	}

$scope.callService=function(){
$scope.greeting={};
$http({method:'GET',url:'/Delivery2Home/logingoogle'}).success(function(data) {
$scope.greeting = data;
console.log(JSON.stringify(data,null," "));
console.log(data);
$window.location.href =data

}).error(function(data){
console.log("Errorssss");
});;

}

$scope.callProductService=function(){
	$scope.greeting={};
	$http({method:'GET',url:'/Delivery2Home/products/'}).success(function(data) {
	$scope.greeting = data;
	console.log(JSON.stringify(data,null," "));
	console.log(data);
	$window.location.href =data

	}).error(function(data){
	console.log("Errorssss");
	});;

	}
$rootScope.itemsaddedtocart=0;
$scope.forgot={}
$scope.user={}
$scope.cart={}
$scope.cart.products=[];
$scope.cart.subtotal=0;
/*$scope.products=[
{occurred
"productCode": 1001,
"productName": "Atta",
"ProductSubCatagory": "Chaki Fresh",
"productCatagory": "Floor",
"price": 250,
"quantity": 10,
"inStock": true,
"brand": "Ashirwad",
"sale": true,
"percentage": 10,
"productVender": "Ashirwad",
"buyPrice": 250,
"Productline": null,
"Productscale": null,
"url": "http://www.gettyimages.in/gi-resources/images/Homepage/Category-Creative/UK/UK_Creative_462809583.jpg",
"discounts": 10,
"isOrganic": true,
"unit": "Kg",
"minQuantity": "5 kg",
"description":"Made from wheat",
"shortDescription":"Made fobs",
"numberOfItemsIncart":0,
"totalPriceInCart":0,
"isNew":true

},
{
"productCode": 1002,
"productName": "Gemini Sunflower Oil",
"ProductSubCatagory": "Chaki Fresh",
"productCatagory": "Floor",
"price": 250,
"quantity": 10,
"inStock": true,
"brand": "Madhur",
"sale": true,
"percentage": 10,
"productVender": "Madhur",
"buyPrice": 250,
"Productline": null,
"Productscale": null,
"url": "http://www.hdwallpapersimages.com/wp-content/uploads/images/Child-Girl-with-Sunflowers-Images.jpg",
"discounts": 10,
"isOrganic": true,
"unit": "Kg",
"minQuantity": "5 kg",
"description":"Made from wheat",
"shortDescription":"Wheat",
"numberOfItemsIncart":0,
"totalPriceInCart":0,
"isNew":false
},
{
"productCode": 1003,
"productName": "Sugar",
"ProductSubCatagory": "Chaki Fresh",
"productCatagory": "Floor",
"price": 250,
"quantity": 10,
"inStock": true,
"brand": "Delivery2Home",
"sale": true,
"percentage": 10,
"productVender": "Delivery2Home",
"buyPrice": 250,
"Productline": null,
"Productscale": null,
"url": "http://www.gettyimages.in/gi-resources/images/Homepage/Category-Creative/UK/UK_Creative_462809583.jpg",
"discounts": 10,
"isOrganic": true,
"unit": "Kg",
"minQuantity": "5 kg",
"description":"Made from wheat",
"shortDescription":"Made fobs",
"numberOfItemsIncart":0,
"totalPriceInCart":0,
"isNew":true

},
{
"productCode": 1004,
"productName": "dal",
"ProductSubCatagory": "Chaki Fresh",
"productCatagory": "Floor",
"price": 250,
"quantity": 10,in
"inStock": true,
"brand": "HUL",
"sale": true,
"percentage": 10,
"productVender": "HUL",
"buyPrice": 250,
"Productline": null,
"Productscale": null,
"url": "http://www.hdwallpapersimages.com/wp-content/uploads/images/Child-Girl-with-Sunflowers-Images.jpg",
"discounts": 10,
"isOrganic": true,
"unit": "Kg",
"minQuantity": "5 kg",
"description":"Made from wheat",
"shortDescription":"Wheat",
"numberOfItemsIncart":0,
"totalPriceInCart":0,
"isNew":false
}
];*/

$scope.selected = undefined;
$scope.states = ['Alabama', 'Alaska', 'Arizona', 'Arkansas', 'California', 'Colorado', 'Connecticut', 'Delaware', 'Florida', 'Georgia', 'Hawaii', 'Idaho', 'Illinois', 'Indiana', 'Iowa', 'Kansas', 'Kentucky', 'Louisiana', 'Maine', 'Maryland', 'Massachusetts', 'Michigan', 'Minnesota', 'Mississippi', 'Missouri', 'Montana', 'Nebraska', 'Nevada', 'New Hampshire', 'New Jersey', 'New Mexico', 'New York', 'North Dakota', 'North Carolina', 'Ohio', 'Oklahoma', 'Oregon', 'Pennsylvania', 'Rhode Island', 'South Carolina', 'South Dakota', 'Tennessee', 'Texas', 'Utah', 'Vermont', 'Virginia', 'Washington', 'West Virginia', 'Wisconsin', 'Wyoming'];
$scope.area = ['Aundh','Pimple Saudagar','Wakad','Vishal Nagar','Baner'];

$scope.displayproduct=function(product) {
$scope.relatedItems=[];
$scope.relatedItemsBysubcategory=[];
$scope.relatedItemsBybrand=[];

for(i=0;i<$scope.products.length;i++)
{
	if($scope.products[i].productCatagory==product.productCatagory)
	{
		if($scope.products[i].numberOfItemsIncart==0 )
		{
			if($scope.products[i].productId!=product.productId )
			{
		$scope.relatedItems.push($scope.products[i]);
		}
		}
	}
	if($scope.relatedItems.length==3)
	{
		i=$scope.products.length;
	}
}	

for(i=0;i<$scope.products.length;i++)
{
	if($scope.products[i].productSubCatagory==product.productSubCatagory)
	{
		if($scope.products[i].numberOfItemsIncart==0 )
		{
			if($scope.products[i].productId!=product.productId )
			{
		$scope.relatedItemsBysubcategory.push($scope.products[i]);
		}
		}
	}
	if($scope.relatedItemsBysubcategory.length==3)
	{
		i=$scope.products.length;
	}
}	

for(i=0;i<$scope.products.length;i++)
{
	if($scope.products[i].brand==product.brand)
	{
		if($scope.products[i].numberOfItemsIncart==0 )
		{
			if($scope.products[i].productId!=product.productId )
			{
		$scope.relatedItemsBybrand.push($scope.products[i]);
		}
		}
	}
	if($scope.relatedItemsBybrand.length==3)
	{
		i=$scope.products.length;
	}
}	
//getLocation();
$scope.descriptionimage=product.productId;
$scope.productdescription=product;
$scope.items=$scope.relatedItems;
$scope.itemsBySubcategory=$scope.relatedItemsBysubcategory;
$scope.itemsBybrand=$scope.relatedItemsBybrand;
$cookieStore.put('productdescription', JSON.stringify(product,null,4));
cache.put("hello", JSON.stringify(product,null,4));
var a=cache.get("hello");
console.log(a);
var favoriteCookie = $cookieStore.get('productdescription');
console.log('variable'+ JSON.stringify(product,null,4))

$location.path('/modal')

}


$scope.addTOCart=function(product){
var prod={};
var inCart=false;
$scope.cart.maxDiscountAmount=0;
if(typeof $scope.cart.products== 'undefined')
{
	$scope.cart.products=[];
}
if($scope.cart.products.length==0)
{
	$rootScope.itemsaddedtocart=0;
	product.totalPriceInCart=0;
	product.numberOfItemsIncart=0;
	$scope.cart.subtotal=0;
	$scope.cart.maxDiscountAmount=0;
	$scope.cart.shipping=0;
	$scope.cart.Total=0;
	product.totalPriceInCart=parseInt(product.totalPriceInCart);
$scope.cart.products.push(product);
$rootScope.itemsaddedtocart=$rootScope.itemsaddedtocart+1;
}
for(var i=0;i< $scope.cart.products.length;i++) {
if($scope.cart.products[i].productId==product.productId)
{
$scope.cart.subtotal=$scope.cart.subtotal+parseInt(product.salePrice);
$scope.cart.Total=$scope.cart.Total+parseInt(product.salePrice);
$scope.cart.Total=$scope.cart.subtotal;
prod=$scope.cart.products[i];
prod.numberOfItemsIncart=parseInt(prod.numberOfItemsIncart)+1;
prod.totalPriceInCart=parseInt(prod.totalPriceInCart)+parseInt(prod.salePrice);
$scope.cart.products[i]=prod;
inCart=true;

break;

}
}

if(inCart==false)
{
$scope.cart.subtotal=$scope.cart.subtotal+parseInt(product.salePrice);
$scope.cart.Total=$scope.Total+parseInt(product.salePrice);
$scope.cart.Total=$scope.cart.subtotal;
$rootScope.itemsaddedtocart=parseInt($rootScope.itemsaddedtocart)+1;
product.numberOfItemsIncart=parseInt(product.numberOfItemsIncart)+1;
product.totalPriceInCart=parseInt(product.salePrice);
$scope.cart.products.push(product);

}
$scope.addedItem=product.productName;
$scope.added=true;

for(var j=0;j< $scope.products.length;j++) {
		if ($scope.products[j].productId == product.productId) {
		$scope.products[j]=product;
		}
	}

$scope.callAtTimeout = function() {


$scope.added=false;
}
$timeout( function(){ $scope.callAtTimeout(); }, 950);
$rootScope.putIntoLocalStaorage($scope.cart);
}



$scope.addTOCartfromnavbar=function(product){
var prod={};
var inCart=false;
$scope.cart.maxDiscountAmount=0;
if(typeof $scope.cart.products== 'undefined')
{
	$scope.cart.products=[];
}
if($scope.cart.products.length==0)
{
	$rootScope.itemsaddedtocart=0;
	product.totalPriceInCart=0;
	product.numberOfItemsIncart=0;
	$scope.cart.subtotal=0;
	$scope.cart.maxDiscountAmount=0;
	$scope.cart.shipping=0;
	$scope.cart.Total=0;
	product.totalPriceInCart=parseInt(product.totalPriceInCart);
$scope.cart.products.push(product);
$rootScope.itemsaddedtocart=$rootScope.itemsaddedtocart+1;
}
for(var i=0;i< $scope.cart.products.length;i++) {
if($scope.cart.products[i].productId==product.productId)
{
$scope.cart.subtotal=$scope.cart.subtotal+parseInt(product.salePrice);
$scope.cart.Total=$scope.cart.Total+parseInt(product.salePrice);
$scope.cart.Total=$scope.cart.subtotal;
prod=$scope.cart.products[i];
prod.numberOfItemsIncart=parseInt(prod.numberOfItemsIncart)+1;
prod.totalPriceInCart=parseInt(prod.totalPriceInCart)+parseInt(prod.salePrice);
$scope.cart.products[i]=prod;
inCart=true;

break;

}
}

if(inCart==false)
{
$scope.cart.subtotal=$scope.cart.subtotal+parseInt(product.salePrice);
$scope.cart.Total=$scope.Total+parseInt(product.salePrice);
$scope.cart.Total=$scope.cart.subtotal;
$rootScope.itemsaddedtocart=parseInt($rootScope.itemsaddedtocart)+1;
product.numberOfItemsIncart=parseInt(product.numberOfItemsIncart)+1;
product.totalPriceInCart=parseInt(product.salePrice);
$scope.cart.products.push(product);

}


for(var j=0;j< $scope.products.length;j++) {
		if ($scope.products[j].productId == product.productId) {
		$scope.products[j]=product;
		}
	}


$rootScope.putIntoLocalStaorage($scope.cart);
}



$scope.showCategory=function(category){
	$scope.search=category;
}

$scope.selectCategory=function(category){
	$scope.search=category;
	//$scope.ui.searchcriteria.category=category;
	if($location.path()!='/index')
	{
	$location.path('/index');
	}
}




$scope.removeFromCart=function(removeproduct){
	$scope.cart.maxDiscountAmount=0;
var prodremove={};
$scope.removed =false;
for(var i=0;i< $scope.cart.products.length;i++) {
if ($scope.cart.products[i].productId == removeproduct.productId) {
prodremove = $scope.cart.products[i];

if (prodremove.numberOfItemsIncart > 1) {
	$scope.removed = true;
	$scope.cart.subtotal=$scope.cart.subtotal- parseInt(removeproduct.salePrice);
	$scope.cart.Total=$scope.cart.Total- parseInt(removeproduct.salePrice);
	$scope.cart.Total=$scope.cart.subtotal;
prodremove.numberOfItemsIncart = prodremove.numberOfItemsIncart-1;

prodremove.totalPriceInCart = prodremove.totalPriceInCart - parseInt(prodremove.salePrice);
$scope.cart.products[i] = prodremove;

for(var j=0;j< $scope.products.length;j++) {
		if ($scope.products[j].productId == prodremove.productId) {
		$scope.products[j]=prodremove;
		}
	}
break;
} else if (prodremove.numberOfItemsIncart ==1) {
	$scope.removed = true;
$scope.cart.subtotal=$scope.cart.subtotal- parseInt(removeproduct.salePrice);
$scope.cart.Total=$scope.cart.Total- parseInt(removeproduct.salePrice);
$scope.cart.Total=$scope.cart.subtotal;
$rootScope.itemsaddedtocart=$rootScope.itemsaddedtocart-1;
prodremove.numberOfItemsIncart = prodremove.numberOfItemsIncart-1;

prodremove.totalPriceInCart = prodremove.totalPriceInCart - parseInt(prodremove.salePrice);

$scope.cart.products.splice(i,1);

for(var j=0;j< $scope.products.length;j++) {
		if ($scope.products[j].productId == prodremove.productId) {
		$scope.products[j]=prodremove;
		}
	}
break;
}

}
}
if($scope.removed ==true)
{
$scope.removedItem = prodremove.productName;


$scope.callAtTimeout = function () {
console.log("$scope.callAtTimeout - Timeout occurred");
$scope.removed = false;
}

$timeout(function () {
$scope.callAtTimeout();
}, 950);
}

$rootScope.putIntoLocalStaorage($scope.cart);
}


$scope.removeFromCartFromNavbar=function(removeproduct){
	$scope.cart.maxDiscountAmount=0;
var prodremove={};

for(var i=0;i< $scope.cart.products.length;i++) {
if ($scope.cart.products[i].productId == removeproduct.productId) {
prodremove = $scope.cart.products[i];

if (prodremove.numberOfItemsIncart > 1) {
	
	$scope.cart.subtotal=$scope.cart.subtotal- parseInt(removeproduct.salePrice);
	$scope.cart.Total=$scope.cart.Total- parseInt(removeproduct.salePrice);
	$scope.cart.Total=$scope.cart.subtotal;
prodremove.numberOfItemsIncart = prodremove.numberOfItemsIncart-1;

prodremove.totalPriceInCart = prodremove.totalPriceInCart - parseInt(prodremove.salePrice);
$scope.cart.products[i] = prodremove;

for(var j=0;j< $scope.products.length;j++) {
		if ($scope.products[j].productId == prodremove.productId) {
		$scope.products[j]=prodremove;
		}
	}
break;
} else if (prodremove.numberOfItemsIncart ==1) {
	
$scope.cart.subtotal=$scope.cart.subtotal- parseInt(removeproduct.salePrice);
$scope.cart.Total=$scope.cart.Total- parseInt(removeproduct.salePrice);
$scope.cart.Total=$scope.cart.subtotal;
$rootScope.itemsaddedtocart=$rootScope.itemsaddedtocart-1;
prodremove.numberOfItemsIncart = prodremove.numberOfItemsIncart-1;

prodremove.totalPriceInCart = prodremove.totalPriceInCart - parseInt(prodremove.salePrice);

$scope.cart.products.splice(i,1);

for(var j=0;j< $scope.products.length;j++) {
		if ($scope.products[j].productId == prodremove.productId) {
		$scope.products[j]=prodremove;
		}
	}
break;
}

}
}


$rootScope.putIntoLocalStaorage($scope.cart);
}

$scope.clearOrder = function() {
	$scope.cart.maxDiscountAmount=0;
for(var i=0;i< $scope.cart.products.length;i++) {
	for(var j=0;j< $scope.products.length;j++) {
		if ($scope.products[j].productId == $scope.cart.products[i].productId) {
		$scope.products[j].numberOfItemsIncart=0;
		}
	}

}

$scope.productdescription.numberOfItemsIncart=0;
$scope.cart.products = [];
$scope.cart.subtotal = 0;
$scope.cart.Total = 0;
$rootScope.itemsaddedtocart=0;

$rootScope.putIntoLocalStaorage($scope.cart);
}
$scope.nextpage=function(index){
	$scope.greeting={};
/* $http.get('/Delivery2Home/products').
	  then(function(response) {
	
			
			
			
		$scope.products = response.data;
		
	  }, function(response) {
		  console.log("Errorssss");
	  }); */
$location.path('/index')
}

$scope.removeProduct=function(index){
$scope.cart.maxDiscountAmount=0;
var prodremove=$scope.cart.products[index];
prodremove.numberOfItemsIncart=0;
for(var j=0;j< $scope.products.length;j++) {
		if ($scope.products[j].productId == prodremove.productId) {
		$scope.products[j]=prodremove;
		}
	}
$scope.cart.products[index].numberOfItemsIncart=0;
$scope.cart.subtotal=$scope.cart.subtotal -$scope.cart.products[index].totalPriceInCart;
$scope.cart.Total=$scope.cart.Total -$scope.cart.products[index].totalPriceInCart;
$scope.cart.Total=$scope.cart.subtotal;
$scope.cart.products[index].totalPriceInCart=0;
$rootScope.itemsaddedtocart=$rootScope.itemsaddedtocart-1;

$scope.cart.products.splice(index,1)

$rootScope.putIntoLocalStaorage($scope.cart);
}




}])