/**
 * Created by VladC on 5/1/2015.
 */
app.controller('confirmarecereri', function($scope, $http, $location) {

    $scope.cereri = [];

    $http({
        method: 'GET',
        url: '/getrequestforconfirmation',
        data: {}
    }).success(function (result) {
        debugger
        $scope.cereri = result;
    });

    $scope.confirm = function(){
        debugger
        $http.post('/confirmrequest', $scope.cerereselectata).success(function(data2) {
            debugger
            if (data2 == false){
                $scope.createMessage = "Cererea nu a putut fi confirmata"
                $scope.confMessage = "A aparut o eroare"
                $("#successPopup").modal('show');
                $("#content").css("background-color", "#FFBABA");
                $("#content").css("color", "#D8000C");
            }
            else{
                $scope.createMessage = "Cererea a fost confirmata."
                $scope.confMessage = "Confirmare"
                $("#successPopup").modal('show');
                $("#content").css("background-color", "#DFF2BF");
                $("#content").css("color", "#4F8A10");
            }
        }).error(function() {
        });
    }

    $scope.reject = function(){
        $http.post('/rejectrequest', $scope.cerereselectata).success(function(data2) {
            if (data2 == false){
                $scope.createMessage = "Cererea nu a putut fi respinsa"
                $scope.confMessage = "A aparut o eroare"
                $("#successPopup").modal('show');
                $("#content").css("background-color", "#FFBABA");
                $("#content").css("color", "#D8000C");
            }
            else{
                $scope.createMessage = "Cererea a fost respinsa."
                $scope.confMessage = "Confirmare"
                $("#successPopup").modal('show');
                $("#content").css("background-color", "#DFF2BF");
                $("#content").css("color", "#4F8A10");
            }
        }).error(function() {
        });
    }

    $scope.goHome = function(){
        $location.path("/");
    }
});
