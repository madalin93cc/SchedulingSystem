app.config(function($routeProvider, $httpProvider) {

    $routeProvider.when('/', {
        templateUrl : 'home.html',
        controller : 'home'
    }).when('/login', {
        templateUrl : 'login.html',
        controller : 'navigation'
    }).when('/account', {
        templateUrl : 'account.html',
        controller: 'account'
    }).when('/creearesala', {
        templateUrl : 'creearesala.html',
        controller: 'creearesala'
    }).otherwise('/');

    $httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';

});