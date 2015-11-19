
// Declare app level module which depends on filters, and services
angular.module('ngdemo', ['ngdemo.filters', 'ngdemo.services', 'ngdemo.directives', 'ngdemo.controllers']).
    config(['\$routeProvider', function (\$routeProvider) {
       $routeProvider.when('/userlistpage/:id', {templateUrl: 'partials/userlistpage.html', controller: 'UserController'});
        $routeProvider.when('/UserCreationPage/:id', {templateUrl: 'partials/UserCreationPage.html', controller: 'UserController'});
        $routeProvider.when('/UserEditPage/:id', {templateUrl: 'partials/UserEditPage.html', controller: 'UserController'});
                                    }]);     