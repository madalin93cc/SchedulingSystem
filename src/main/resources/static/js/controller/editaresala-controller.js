/**
 * Created by VladC on 5/17/2015.
 */
app.controller('editaresala', ['$rootScope', '$scope', '$location', '$http', 'EditaresalaService',
    function($rootScope, $scope, $location, $http, EditaresalaService) {

        if ($location.$$url == "/editaresala"){
            $rootScope.selected = 1;
        }
        $scope.conferenceroom = EditaresalaService.load($rootScope.selected);
        $scope.selectedroom = EditaresalaService.selectedroom;


        $scope.changeSelected = function(sel){
            EditaresalaService.update($rootScope.selected, $scope.conferenceroom, $scope.selectedroom);
            $rootScope.selected = sel;
            switch(sel){
                case 1:{
                    $location.path("/editaresala/#date");
                    break;
                }
                case 2:{
                    $location.path("/editaresala#locatie");
                    break;
                }
                case 3:{
                    $location.path("/editaresala#facilitati");
                    break;
                }
                case 4:{
                    $location.path("/editaresala#echipamente");
                    break;
                }
            }
        }

        $scope.saveConferenceRoom = function () {
            EditaresalaService.update($rootScope.selected, $scope.conferenceroom);
            $http.get('/get/newconferenceroom/').success(function(data) {
                $scope.conferenceroomDTO = data;
                $scope.conferenceroomDTO.name = EditaresalaService.conferenceroom.name;
                $scope.conferenceroomDTO.placesNumber = EditaresalaService.conferenceroom.placesNumber;
                $scope.conferenceroomDTO.surface = EditaresalaService.conferenceroom.surface;
//            Features
                $scope.conferenceroomDTO.fkFeatures.climateSystem = EditaresalaService.conferenceroom.fkFeatures.climateSystem;
                $scope.conferenceroomDTO.fkFeatures.naturalLight = EditaresalaService.conferenceroom.fkFeatures.naturalLight;
                $scope.conferenceroomDTO.fkFeatures.darkness = EditaresalaService.conferenceroom.fkFeatures.darkness;
                $scope.conferenceroomDTO.fkFeatures.scene = EditaresalaService.conferenceroom.fkFeatures.scene;
                $scope.conferenceroomDTO.fkFeatures.catering = EditaresalaService.conferenceroom.fkFeatures.catering;
                $scope.conferenceroomDTO.fkFeatures.restaurant = EditaresalaService.conferenceroom.fkFeatures.restaurant;
                $scope.conferenceroomDTO.fkFeatures.parking = EditaresalaService.conferenceroom.fkFeatures.parking;
                $scope.conferenceroomDTO.fkFeatures.elevator = EditaresalaService.conferenceroom.fkFeatures.elevator;
//            Location
                $scope.conferenceroomDTO.fkLocation.name = EditaresalaService.conferenceroom.fkLocation.name;
                $scope.conferenceroomDTO.fkLocation.city = EditaresalaService.conferenceroom.fkLocation.city;
                $scope.conferenceroomDTO.fkLocation.sector = EditaresalaService.conferenceroom.fkLocation.sector;
                $scope.conferenceroomDTO.fkLocation.street = EditaresalaService.conferenceroom.fkLocation.street;
                $scope.conferenceroomDTO.fkLocation.floor = EditaresalaService.conferenceroom.fkLocation.floor;
                $scope.conferenceroomDTO.fkLocation.streetNumber = EditaresalaService.conferenceroom.fkLocation.streetNumber;
                $scope.conferenceroomDTO.fkLocation.indication = EditaresalaService.conferenceroom.fkLocation.indication;
//            Equipments
                $scope.conferenceroomDTO.fkEquipment.wireless = EditaresalaService.conferenceroom.fkEquipment.wireless;
                $scope.conferenceroomDTO.fkEquipment.videoprojector = EditaresalaService.conferenceroom.fkEquipment.videoprojector;
                $scope.conferenceroomDTO.fkEquipment.laserpointer = EditaresalaService.conferenceroom.fkEquipment.laserpointer;
                $scope.conferenceroomDTO.fkEquipment.projectionScreen = EditaresalaService.conferenceroom.fkEquipment.projectionScreen;
                $scope.conferenceroomDTO.fkEquipment.flipchart = EditaresalaService.conferenceroom.fkEquipment.flipchart;
                $scope.conferenceroomDTO.fkEquipment.whiteboard = EditaresalaService.conferenceroom.fkEquipment.whiteboard;
                $scope.conferenceroomDTO.fkEquipment.soundsystem = EditaresalaService.conferenceroom.fkEquipment.soundsystem;
                $scope.conferenceroomDTO.fkEquipment.microphones = EditaresalaService.conferenceroom.fkEquipment.microphones;
                $scope.conferenceroomDTO.fkEquipment.tv = EditaresalaService.conferenceroom.fkEquipment.tv;
                $scope.conferenceroomDTO.fkEquipment.videoconference = EditaresalaService.conferenceroom.fkEquipment.videoconference;
                $scope.conferenceroomDTO.fkEquipment.recordAV = EditaresalaService.conferenceroom.fkEquipment.recordAV;
                $scope.conferenceroomDTO.fkEquipment.laptop = EditaresalaService.conferenceroom.fkEquipment.laptop;
                $scope.conferenceroomDTO.fkEquipment.printer = EditaresalaService.conferenceroom.fkEquipment.printer;
                $scope.conferenceroomDTO.fkEquipment.translator = EditaresalaService.conferenceroom.fkEquipment.translator;

                $http.post('/add/conferenceroom/', $scope.conferenceroomDTO).success(function(data2) {
                    EditaresalaService.conferenceroom = null;
                }).error(function() {
                });
            });
        }
    }]);