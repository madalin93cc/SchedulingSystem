app.controller('rezervaresala', function($scope, $http) {

    $scope.cityes = [];
    $scope.capacityes = [];

    $http({
        method: 'GET',
        url: '/rezervasala/cityes',
        data: {}
    }).success(function (result) {
        $scope.cityes = result;
    });

    $http({
        method: 'GET',
        url: '/rezervasala/capacityes',
        data: {}
    }).success(function (result) {
        $scope.capacityes = result;
    });

    $scope.reserveRoom = function(){
        console.log($scope.searchRoom);
        debugger
    }

});