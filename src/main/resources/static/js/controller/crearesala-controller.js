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
        CrearesalaService.update($rootScope.selected, $scope.conferenceroom);
        debugger
        $http.get('/get/newconferenceroom/').success(function(data) {
            $scope.conferenceroomDTO = data;
            $scope.conferenceroomDTO.name = CrearesalaService.conferenceroom.name;
            $scope.conferenceroomDTO.placesNumber = CrearesalaService.conferenceroom.placesNumber;
            $scope.conferenceroomDTO.surface = CrearesalaService.conferenceroom.surface;
//            Features
            $scope.conferenceroomDTO.fkFeatures.climateSystem = CrearesalaService.conferenceroom.fkFeatures.climateSystem;
            $scope.conferenceroomDTO.fkFeatures.naturalLight = CrearesalaService.conferenceroom.fkFeatures.naturalLight;
            $scope.conferenceroomDTO.fkFeatures.darkness = CrearesalaService.conferenceroom.fkFeatures.darkness;
            $scope.conferenceroomDTO.fkFeatures.scene = CrearesalaService.conferenceroom.fkFeatures.scene;
            $scope.conferenceroomDTO.fkFeatures.catering = CrearesalaService.conferenceroom.fkFeatures.catering;
            $scope.conferenceroomDTO.fkFeatures.restaurant = CrearesalaService.conferenceroom.fkFeatures.restaurant;
            $scope.conferenceroomDTO.fkFeatures.parking = CrearesalaService.conferenceroom.fkFeatures.parking;
            $scope.conferenceroomDTO.fkFeatures.elevator = CrearesalaService.conferenceroom.fkFeatures.elevator;
//            Location
            $scope.conferenceroomDTO.fkLocation.name = CrearesalaService.conferenceroom.fkLocation.name;
            $scope.conferenceroomDTO.fkLocation.city = CrearesalaService.conferenceroom.fkLocation.city;
            $scope.conferenceroomDTO.fkLocation.sector = CrearesalaService.conferenceroom.fkLocation.sector;
            $scope.conferenceroomDTO.fkLocation.street = CrearesalaService.conferenceroom.fkLocation.street;
            $scope.conferenceroomDTO.fkLocation.floor = CrearesalaService.conferenceroom.fkLocation.floor;
            $scope.conferenceroomDTO.fkLocation.streetNumber = CrearesalaService.conferenceroom.fkLocation.streetNumber;
            $scope.conferenceroomDTO.fkLocation.indication = CrearesalaService.conferenceroom.fkLocation.indication;
//            Echipments
            $scope.conferenceroomDTO.fkEquipment.wireless = CrearesalaService.conferenceroom.fkEquipment.wireless;
            $scope.conferenceroomDTO.fkEquipment.videoprojector = CrearesalaService.conferenceroom.fkEquipment.videoprojector;
            $scope.conferenceroomDTO.fkEquipment.laserpointer = CrearesalaService.conferenceroom.fkEquipment.laserpointer;
            $scope.conferenceroomDTO.fkEquipment.projectionScreen = CrearesalaService.conferenceroom.fkEquipment.projectionScreen;
            $scope.conferenceroomDTO.fkEquipment.flipchart = CrearesalaService.conferenceroom.fkEquipment.flipchart;
            $scope.conferenceroomDTO.fkEquipment.whiteboard = CrearesalaService.conferenceroom.fkEquipment.whiteboard;
            $scope.conferenceroomDTO.fkEquipment.soundsystem = CrearesalaService.conferenceroom.fkEquipment.soundsystem;
            $scope.conferenceroomDTO.fkEquipment.microphones = CrearesalaService.conferenceroom.fkEquipment.microphones;
            $scope.conferenceroomDTO.fkEquipment.tv = CrearesalaService.conferenceroom.fkEquipment.tv;
            $scope.conferenceroomDTO.fkEquipment.videoconference = CrearesalaService.conferenceroom.fkEquipment.videoconference;
            $scope.conferenceroomDTO.fkEquipment.recordAV = CrearesalaService.conferenceroom.fkEquipment.recordAV;
            $scope.conferenceroomDTO.fkEquipment.laptop = CrearesalaService.conferenceroom.fkEquipment.laptop;
            $scope.conferenceroomDTO.fkEquipment.printer = CrearesalaService.conferenceroom.fkEquipment.printer;
            $scope.conferenceroomDTO.fkEquipment.translator = CrearesalaService.conferenceroom.fkEquipment.translator;

            $http.post('/add/conferenceroom/', $scope.conferenceroomDTO).success(function(data2) {
                console.log(data2);
            }).error(function() {
            });
        });
        //CrearesalaService.copyAndSave()
    }
}]);