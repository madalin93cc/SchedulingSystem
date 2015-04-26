app.controller('account', function($scope, $http, $location) {
    $scope.createaccount = function(user) {
        $scope.url = "/add/" + user.firstname + "/"
            + user.lastname + "/"
            + user.username + "/"
            + user.password + "/"
            + user.type;

        $http.post($scope.url, {}).success(function() {
            $location.path("/");
        }).error(function() {
//            TODO mesaj creare cont
        });
    }
});