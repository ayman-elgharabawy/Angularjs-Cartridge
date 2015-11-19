'use strict';
var services = angular.module('ngdemo.services', ['ngResource']);


  services.factory(${factname}, function (\$resource) {
    return $resource('gggggg', {}, {
           create: { method: 'POST' }
                             query: { method: 'GET', params: {}, isArray: false }
                 
    })
});


