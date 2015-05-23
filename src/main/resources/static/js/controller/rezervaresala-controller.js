app.controller('rezervaresala', function($scope, $http, $location) {

    $scope.cityes = [];
    $scope.capacityes = [];

    $scope.companies = [
        { 'name':'Infosys Technologies',
            'employees': 125000,
            'headoffice': 'Bangalore'},
        { 'name':'Cognizant Technologies',
            'employees': 100000,
            'headoffice': 'Bangalore'},
        { 'name':'Wipro',
            'employees': 115000,
            'headoffice': 'Bangalore'},
        { 'name':'Tata Consultancy Services (TCS)',
            'employees': 150000,
            'headoffice': 'Bangalore'},
        { 'name':'HCL Technologies',
            'employees': 90000,
            'headoffice': 'Noida'},
    ];

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

    $scope.reserveRoom = function() {
        debugger
        $http.get('/get/newsearchconferenceroom/').success(function(data) {
            $scope.searchConferenceRoomDTO = data;
            $scope.searchConferenceRoomDTO.location = $scope.searchRoom.city;
            if($scope.searchRoom.capacity == '< 50')
                $scope.searchConferenceRoomDTO.capacity = 1;
            else if($scope.searchRoom.capacity == '50 - 100')
                $scope.searchConferenceRoomDTO.capacity = 2;
            else if($scope.searchRoom.capacity == '101 - 150')
                $scope.searchConferenceRoomDTO.capacity = 3;
            else if($scope.searchRoom.capacity == '151 - 250')
                $scope.searchConferenceRoomDTO.capacity = 4;
            else if($scope.searchRoom.capacity == '251 - 500')
                $scope.searchConferenceRoomDTO.capacity = 5;
            else if($scope.searchRoom.capacity == '> 500')
                $scope.searchConferenceRoomDTO.capacity = 6;
//            $scope.searchConferenceRoomDTO.capacity = $scope.searchRoom.capacity;
            $scope.searchConferenceRoomDTO.date = $scope.searchRoom.date;
            // Features
            $scope.searchConferenceRoomDTO.featuresDTO.climateSystem = $scope.searchRoom.climateSystem;
            $scope.searchConferenceRoomDTO.featuresDTO.naturalLight = $scope.searchRoom.naturalLight;
            $scope.searchConferenceRoomDTO.featuresDTO.darkness = $scope.searchRoom.darkness;
            $scope.searchConferenceRoomDTO.featuresDTO.scene = $scope.searchRoom.scene;
            $scope.searchConferenceRoomDTO.featuresDTO.catering = $scope.searchRoom.catering;
            $scope.searchConferenceRoomDTO.featuresDTO.restaurant = $scope.searchRoom.restaurant;
            $scope.searchConferenceRoomDTO.featuresDTO.parking = $scope.searchRoom.parkings;
            $scope.searchConferenceRoomDTO.featuresDTO.elevator = $scope.searchRoom.elevator;
            // Equipments
            $scope.searchConferenceRoomDTO.equipmentDTO.wireless = $scope.searchRoom.wireless;
            $scope.searchConferenceRoomDTO.equipmentDTO.videoprojector = $scope.searchRoom.videoprojector;
            $scope.searchConferenceRoomDTO.equipmentDTO.laserpointer = $scope.searchRoom.laserpointer;
            $scope.searchConferenceRoomDTO.equipmentDTO.projectionScreen = $scope.searchRoom.projectionScreen;
            $scope.searchConferenceRoomDTO.equipmentDTO.flipchart = $scope.searchRoom.flipchart;
            $scope.searchConferenceRoomDTO.equipmentDTO.whiteboard = $scope.searchRoom.whiteboard;
            $scope.searchConferenceRoomDTO.equipmentDTO.soundsystem = $scope.searchRoom.soundsystem;
            $scope.searchConferenceRoomDTO.equipmentDTO.microphones = $scope.searchRoom.microphones;
            $scope.searchConferenceRoomDTO.equipmentDTO.tv = $scope.searchRoom.tv;
            $scope.searchConferenceRoomDTO.equipmentDTO.videoconference = $scope.searchRoom.videoconference;
            $scope.searchConferenceRoomDTO.equipmentDTO.recordAV = $scope.searchRoom.recordAV;
            $scope.searchConferenceRoomDTO.equipmentDTO.laptop = $scope.searchRoom.laptop;
            $scope.searchConferenceRoomDTO.equipmentDTO.printer = $scope.searchRoom.printer;
            $scope.searchConferenceRoomDTO.equipmentDTO.translator = $scope.searchRoom.translator;

            $http.post('/add/searchconferenceroom', $scope.searchConferenceRoomDTO).success(function(data2) {
                console.log(data2);
                $scope.searchResult = data2;
            }).error(function() {
            });

        });
    }

    $scope.idSelectedItem = null;
    $scope.setSelected = function (idSelectedItem) {
        $scope.idSelectedItem = idSelectedItem;
    };

    $scope.submitRezervation = function(){
        debugger
        $http.post('/reserveroom', $scope.idSelectedItem).success(function(data) {
            debugger
            if (data == true){
                $scope.createMessage = "Sala a fost rezervata cu succes."
                $scope.confMessage = "Confirmare"
                $("#successPopup").modal('show');
                $("#content").css("background-color", "#DFF2BF");
                $("#content").css("color", "#4F8A10");
            }
            else{
                $scope.createMessage = "Sala nu a putut fi rezervata."
                $scope.confMessage = "A aparut o eroare"
                $("#successPopup").modal('show');
                $("#content").css("background-color", "#FFBABA");
                $("#content").css("color", "#D8000C");
            }
        }).error(function() {
        });

        $scope.goHome = function(){
            $location.path("/");
        }
    }
});