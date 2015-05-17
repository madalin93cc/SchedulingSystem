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
    }).when('/rezervaresala', {
        templateUrl : 'rezervaresala.html',
        controller: 'rezervaresala'
    }).when('/confirmarecereri', {
        templateUrl : 'confirmarecereri.html',
        controller: 'confirmarecereri'
    }).when('/statuscereri', {
        templateUrl : 'statuscereri.html',
        controller: 'statuscereri'
    }).otherwise('/');

    $httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';

});