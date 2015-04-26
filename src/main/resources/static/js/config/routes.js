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
    }).otherwise('/');

    $httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';

});