'use strict';
var services = angular.module('ngdemoservices', ['ngResource']);

services.config(function($httpProvider) {
  /**
   * make delete type json
   */
  $httpProvider.defaults.headers["delete"] = {
    'Content-Type': 'application/json;charset=utf-8'
  };
})

services.factory('UsersFactory', 
// var savedData = {}
// function set(data) {
//   savedData = data;
// }
// function get() {
//  return savedData;
// }


   
 function ($resource) {
       return $resource('/vf-oubl-webservice/services/customerservice/search', {}, {   
           create: { method: 'POST' }
                 , query: { method: 'GET', isArray: true }
           })
}
);
 services.factory('UserFactory',  
// var savedData = {}
// function set(data) {
//   savedData = data;
// }
// function get() {
//  return savedData;
// }


  function ($resource) {
 return $resource('/vf-oubl-webservice/services/customerservice/search?username=:username&password=:password', {}, {
 show: { method: 'GET', isArray: true }
  ,update: { method: 'PUT' }
    ,delete: { method: 'DELETE', params: {id,itds:'@id,itds'} }
      })
  }
  );

services.factory('CountrysFactory', 
// var savedData = {}
// function set(data) {
//   savedData = data;
// }
// function get() {
//  return savedData;
// }


   
 function ($resource) {
       return $resource('/lookupservice/country/', {}, {   
           create: { method: 'POST' }
                 , query: { method: 'GET', isArray: true }
           })
}
);
 services.factory('CountryFactory',  
// var savedData = {}
// function set(data) {
//   savedData = data;
// }
// function get() {
//  return savedData;
// }


  function ($resource) {
 return $resource('/lookupservice/country/?id=:id', {}, {
 show: { method: 'GET', isArray: true }
  ,update: { method: 'PUT' }
    ,delete: { method: 'DELETE', params: {id:'@id'} }
      })
  }
  );


