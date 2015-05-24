/**
 * Created by VladC on 5/15/2015.
 */

app.controller('statuscereri', function($scope, $http) {

    $scope.cereri = [];

    $http({
        method: 'GET',
        url: '/getallrequests',
        data: {}
    }).success(function (result) {
        debugger
        $scope.cereri = result;
    });

});

