/**
 * Created by VladC on 5/17/2015.
 */
app.controller('stergerecont', function($scope, $http) {
    $scope.deleteAccount = function(){
        $http.get('/deleteAccount', {}).success(function(data) {

            $rootScope.authenticated = false;
            $rootScope.userType = null;
        }).error(function() {

        });
    }
});