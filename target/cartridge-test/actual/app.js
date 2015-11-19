
// Declare app level module which depends on filters, and services
var app = angular.module('ngdemo', ['ui.router','ngdemocontrollers','ngdemoservices']);
app.config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider) {
    $urlRouterProvider.otherwise('/');
     $stateProvider
        .state('app', {
            url:'/',
            views: {
              'header': {
                templateUrl:'components/Header.html',
                controller: 'HomeCtrl'
              },
              'content': {
                templateUrl:'components/Content.html',
                controller: 'HomeCtrl'
              },
           
            }
        })
.state('app.UserCreationPage', {
    url:'UserCreationPage',
    views: {
      'content@': {
        templateUrl:'components/UserCreationPage/UserCreationPage.html',
        controller: 'UserCreationPageCtrl'
      },
    }
}).state('app.UserList.UserEditPagedetail', {
    url:'/UserEditPage/:id',
    views: {
      'UserEditPagedetail@app.UserList': {
        templateUrl:'components/UserEditPage/UserEditPage.html',
        controller: 'UserEditPageCtrl'
      },
    }
}).state('app.UserList', {
  url: 'UserList',
  views: {
    'content@':{
      templateUrl:'components/UserList/UserList.html',
      controller: 'UserListCtrl'
    }
  }
}).state('app.UserList.countryPagedetail', {
    url:'/countryPage/:id',
    views: {
      'countryPagedetail@app.UserList': {
        templateUrl:'components/countryPage/countryPage.html',
        controller: 'countryPageCtrl'
      },
    }
}).state('app.loginpage', {
    url:'loginpage',
    views: {
      'content@': {
        templateUrl:'components/loginpage/loginpage.html',
        controller: 'loginpageCtrl'
      },
    }
}).state('app.LandingPage', {
  url: 'LandingPage',
  views: {
    'content@':{
      templateUrl:'components/LandingPage/LandingPage.html',
      controller: 'LandingPageCtrl'
    }
  }
}).state('app.nomaster.statepartdetail', {
    url:'/statepart/:id',
    views: {
      'statepartdetail@app.nomaster': {
        templateUrl:'components/statepart/statepart.html',
        controller: 'statepartCtrl'
      },
    }
})}]);  
app.controller('HomeCtrl', [function(){
}]);