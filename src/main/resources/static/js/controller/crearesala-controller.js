app.controller('creearesala', function($rootScope, $scope, $location) {
    $scope.changeSelected = function(sel){
        $rootScope.selected = sel;
        switch(sel){
            case 1:{
                $location.path("/creearesala/#date");
            }
            case 2:{
                $location.path("/creearesala#locatie");
            }
            case 3:{
                $location.path("/creearesala#facilitati");
            }
            case 4:{
                $location.path("/creearesala#echipamente");
            }
        }
    }
});