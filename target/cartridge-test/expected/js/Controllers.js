'use strict';

/* Controllers */
var app = angular.module('ngdemo.controllers', []);
app.controller(${cnameq}, ['$scope', userFactory , '$location',
      function ($scope, 'userFactory' , $location) {
                                                                                                                  // callback for ng-click 'goToUserEdit':
        $scope.goToEditPage= function () {
                                  $location.path('/UserEditPage');
                   };
 
                                                    // callback for ng-click '${state.incomings.get(0).trigger.name}':
        $scope.queryUser= function () {
          			    userFactory.queryUser($scope.user);
                                      $location.path('/userlistpage');
                   };
 
                                                    // callback for ng-click 'goToUserCreation':
        $scope.goToCreationPage= function () {
                                  $location.path('/UserCreationPage');
                   };
 
                                                    // callback for ng-click 'gotohome':
        $scope.deleteUser= function () {
                                 
           $location.path('/userlistpage');
                   };
 
                                                    // callback for ng-click '${state.incomings.get(0).trigger.name}':
        $scope.createUser= function () {
          			    userFactory.createUser($scope.gotohome);
                                     
           $location.path('/userlistpage');
                   };
 
                                                    // callback for ng-click '${state.incomings.get(0).trigger.name}':
        $scope.editUser= function () {
          			    userFactory.editUser($scope.gotohome);
                                     
           $location.path('/userlistpage');
                   };
 
            }]);
app.controller(${cnameq}, ['$scope', userFactory , '$location',
      function ($scope, 'userFactory' , $location) {
     }]);
