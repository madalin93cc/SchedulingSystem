app.controller('navigation', function($rootScope, $scope, $http, $location) {

    var authenticate = function(credentials, callback) {

        var headers = credentials ? {authorization : "Basic "
            + btoa(credentials.username + ":" + credentials.password)
        } : {};

        $http.get('user', {headers : headers}).success(function(data) {
            if (data.name) {
                $rootScope.authenticated = true;
            } else {
                $rootScope.authenticated = false;
            }
            callback && callback();
        }).error(function() {
            $rootScope.authenticated = false;
            callback && callback();
        });

    }

    authenticate();
    $scope.credentials = {};
    $scope.login = function() {
        debugger
        $http.get('/get/newcredentials').success(function(data) {
            data.username = $scope.credentialsDTO.username;
            data.password = $scope.credentialsDTO.password;
            $http.post('/loginUser', data).success(function(data2) {
                console.log(data2);
                if (data2 == ""){
                    $scope.error = true;
                    $rootScope.authenticated = false;
                }
                else {
                    $scope.error = false;
                    $rootScope.authenticated = true;
                    $location.path("/");
                }
            }).error(function() {
            });
        });
//        authenticate($scope.credentials, function() {
//            if ($rootScope.authenticated) {
//                $location.path("/");
//                $scope.error = false;
//            } else {
//                $location.path("/login");
//                $scope.error = true;
//            }
//        });
    };
    $scope.logout = function() {
        $http.get('/logout', {}).success(function() {
            $rootScope.authenticated = false;
            $location.path("/");
        }).error(function(data) {
            $rootScope.authenticated = false;
        });
    };
    $scope.createaccount = function() {
        $location.path("/account");
    }
});