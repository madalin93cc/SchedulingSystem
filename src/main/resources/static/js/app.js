var app = angular.module('scheduling-system', ['ngRoute']);

//app.module('scheduling-system', [ 'ngRoute' ])
//app.config(function($routeProvider, $httpProvider) {
//
//        $routeProvider.when('/', {
//            templateUrl : 'home.html',
//            controller : 'home'
//        }).when('/login', {
//            templateUrl : 'login.html',
//            controller : 'navigation'
//        }).when('/account', {
//            templateUrl: 'account.html',
//            controller: 'account'
//        }).otherwise('/');
//
//        $httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';
//
//    })
//    app.controller('home', function($scope, $http) {
//        $http.get('/resource/').success(function(data) {
//            $scope.greeting = data;
//        })
//    })
//    app.controller('account', function($scope, $http, $location) {
//        $location.path("/");
//        var create = function(credentials, callback) {
//            var headers = credentials ? {authorization : "Basic "
//                + btoa(credentials.prenume + ":" + credentials.nume
//                    + ":" + credentials.user  + ":" + credentials.parola)
//            } : {};
//        }
//    })
//    .controller('navigation', function($rootScope, $scope, $http, $location) {
//
//        var authenticate = function(credentials, callback) {
//
//            var headers = credentials ? {authorization : "Basic "
//                + btoa(credentials.username + ":" + credentials.password)
//            } : {};
//
//            $http.get('user', {headers : headers}).success(function(data) {
//                if (data.name) {
//                    $rootScope.authenticated = true;
//                } else {
//                    $rootScope.authenticated = false;
//                }
//                callback && callback();
//            }).error(function() {
//                $rootScope.authenticated = false;
//                callback && callback();
//            });
//
//        }
//
//        authenticate();
//        $scope.credentials = {};
//        $scope.login = function() {
//            authenticate($scope.credentials, function() {
//                if ($rootScope.authenticated) {
//                    $location.path("/");
//                    $scope.error = false;
//                } else {
//                    $location.path("/login");
//                    $scope.error = true;
//                }
//            });
//        };
//        $scope.logout = function() {
//            $http.post('logout', {}).success(function() {
//                $rootScope.authenticated = false;
//                $location.path("/");
//            }).error(function(data) {
//                $rootScope.authenticated = false;
//            });
//        };
//        $scope.createaccount = function() {
//            $location.path("/account");
//        }
//    });