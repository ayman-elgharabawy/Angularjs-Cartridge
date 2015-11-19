'use strict';

/* Controllers */
var app = angular.module('ngdemocontrollers', []);
app.run(function ($rootScope, $templateCache) {
    $rootScope.$on('$viewContentLoaded', function () {
        $templateCache.removeAll();
    });
});


/*************************Controller  UserCreationPageCtrl *******************************************/
app.controller('UserCreationPageCtrl', ['$scope', '$state', '$stateParams', 'CountryFactory','CountrysFactory','UserFactory','UsersFactory'  , '$location','$rootScope',
    function ($scope, $state, $stateParams,  CountryFactory,CountrysFactory,UserFactory,UsersFactory, $location,$rootScope) {
//////////Preparing reading input parameter to pass it to next state
//////////////End Reading input Parameter
$scope.createUser= function(user) {
			  $rootScope.user=user;			
UsersFactory.create($scope.user);



//$location.path('/UserList}/'+user);
//$state.go('app.UserList',+{user:user});


};



//////////Preparing reading input parameter to pass it to next state
//////////////End Reading input Parameter

             }]);
/*************************Controller  UserEditPageCtrl *******************************************/
app.controller('UserEditPageCtrl', ['$scope', '$state', '$stateParams', 'CountryFactory','CountrysFactory','UserFactory','UsersFactory'  , '$location','$rootScope',
    function ($scope, $state, $stateParams,  CountryFactory,CountrysFactory,UserFactory,UsersFactory, $location,$rootScope) {
//////////Preparing reading input parameter to pass it to next state
//////////////End Reading input Parameter
$scope.editUser= function(user) {
			  $rootScope.user=user;			
UserFactory.update($scope.user);



//$location.path('/UserList}/'+user);
//$state.go('app.UserList',+{user:user});


};



//////////Preparing reading input parameter to pass it to next state
//////////////End Reading input Parameter

             }]);
/*************************Controller  UserListCtrl *******************************************/
app.controller('UserListCtrl', ['$scope', '$state', '$stateParams', 'CountryFactory','CountrysFactory','UserFactory','UsersFactory'  , '$location','$rootScope',
    function ($scope, $state, $stateParams,  CountryFactory,CountrysFactory,UserFactory,UsersFactory, $location,$rootScope) {
//////////Preparing reading input parameter to pass it to next state
//////////////End Reading input Parameter
$scope.deleteUser= function(id) {
			  $rootScope.id=id;			
UserFactory.delete({ id:id});


//$location.path('/UserList/'+id);
//$state.go('app.UserList.detail'+{id:id});


};
//////////Preparing reading input parameter to pass it to next state
$scope.goToCreationPage= function() {


//$location.path('/UserCreationPage/');
//$state.go('app.UserCreationPage');


};
//////////Preparing reading input parameter to pass it to next state
//////////////End Reading input Parameter
$scope.goToEditPage= function(id) {
			  $rootScope.id=id;			
UserFactory.delete({ id:id});


//$location.path('/UserEditPage/'+id);
//$state.go('app.UserEditPage.detail'+{id:id});


};
//////////Preparing reading input parameter to pass it to next state
$scope.queryCountry= function() {


//$location.path('/countryPage/');
//$state.go('app.countryPage');


};



//////////Preparing reading input parameter to pass it to next state
//////////////End Reading input Parameter

   $scope.users = UsersFactory.query();
          }]);
/*************************Controller  countryPageCtrl *******************************************/
app.controller('countryPageCtrl', ['$scope', '$state', '$stateParams', 'CountryFactory','CountrysFactory','UserFactory','UsersFactory'  , '$location','$rootScope',
    function ($scope, $state, $stateParams,  CountryFactory,CountrysFactory,UserFactory,UsersFactory, $location,$rootScope) {



//////////Preparing reading input parameter to pass it to next state
//////////////End Reading input Parameter

       $scope.countrys = CountrysFactory.query();
      }]);
/*************************Controller  loginpageCtrl *******************************************/
app.controller('loginpageCtrl', ['$scope', '$state', '$stateParams', 'UserFactory','UsersFactory'  , '$location','$rootScope',
    function ($scope, $state, $stateParams,  UserFactory,UsersFactory, $location,$rootScope) {
//////////Preparing reading input parameter to pass it to next state
//////////////End Reading input Parameter
$scope.login= function(username,password) {
			  $rootScope.username=username;			
			  $rootScope.password=password;			
$scope.user = UserFactory.show({username:username,password:password});

$scope.user.$promise.then(function(data){
console.log(data[0]);
//==============>>>id==1
//////////Preparing reading input parameter to pass it to next state
//////////////End Reading input Parameter

if(data[0].id==1)
//$location.path('/LandingPage/');
$state.go('app.LandingPage');
end
//=================================
//==============>>>result==null
//////////Preparing reading input parameter to pass it to next state
//////////////End Reading input Parameter

if(data[0].result==null)
//$location.path('/loginpage/');
$state.go('app.loginpage');
end
//=================================
});



//$location.path('/LandingPage}/'+username/password);
//$state.go('app.LandingPage',+{username:username,password:password});


};



//////////Preparing reading input parameter to pass it to next state
//////////////End Reading input Parameter

         }]);
/*************************Controller  LandingPageCtrl *******************************************/
app.controller('LandingPageCtrl', ['$scope', '$state', '$stateParams', 'UserFactory','UsersFactory'  , '$location','$rootScope',
    function ($scope, $state, $stateParams,  UserFactory,UsersFactory, $location,$rootScope) {



//////////Preparing reading input parameter to pass it to next state
//////////////End Reading input Parameter
    }]);
/*************************Controller  statepartCtrl *******************************************/
app.controller('statepartCtrl', ['$scope', '$state', '$stateParams', 'UserFactory','UsersFactory'  , '$location','$rootScope',
    function ($scope, $state, $stateParams,  UserFactory,UsersFactory, $location,$rootScope) {



//////////Preparing reading input parameter to pass it to next state
//////////////End Reading input Parameter
    }]);
