app.config(function($routeProvider, $httpProvider) {

    $routeProvider.when('/', {
        templateUrl : 'views/home.html',
        controller : 'home'
    }).when('/login', {
        templateUrl : 'views/login.html',
        controller : 'navigation'
    }).when('/account', {
        templateUrl: 'views/account.html',
        controller: 'account'
    }).otherwise('/');

    $httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';

});