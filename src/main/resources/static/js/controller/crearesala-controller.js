app.controller('creearesala', function($rootScope, $scope, $location) {
    $scope.changeSelected = function(sel){
        $rootScope.selected = sel;
        $location.path("/creearesala#create");
    }
});