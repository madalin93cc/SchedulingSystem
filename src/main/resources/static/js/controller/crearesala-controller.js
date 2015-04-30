app.controller('creearesala', ['$rootScope', '$scope', '$location', '$http', 'CrearesalaService',
    function($rootScope, $scope, $location, $http, CrearesalaService) {

    if ($location.$$url == "/creearesala"){
        $rootScope.selected = 1;
    }
    $scope.conferenceroom = CrearesalaService.load($rootScope.selected);

    $scope.changeSelected = function(sel){

        CrearesalaService.update($rootScope.selected, $scope.conferenceroom);
        $rootScope.selected = sel;
        switch(sel){
            case 1:{
                $location.path("/creearesala/#date");
                break;
            }
            case 2:{
                $location.path("/creearesala#locatie");
                break;
            }
            case 3:{
                $location.path("/creearesala#facilitati");
                break;
            }
            case 4:{
                $location.path("/creearesala#echipamente");
                break;
            }
        }
    }
    
    $scope.saveConferenceRoom = function () {
        var body = {
            firstName: "a",
            lastName: "a",
            username: "a",
            password: "a"
        };
        debugger
        $http.post('/add/conferenceroom/', CrearesalaService.conferenceroom);
    }
}]);