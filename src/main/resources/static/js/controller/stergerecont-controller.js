/**
 * Created by VladC on 5/17/2015.
 */
app.controller('stergerecont', function($scope, $http, $rootScope, $location) {
    $scope.deleteAccount = function(){
        bootbox.confirm("Sunteti sigur?", function(result) {
            if (result == true) {
                $http.get('/deleteAccount', {}).success(function (data) {
                    if (data != "") {
                        $rootScope.authenticated = false;
                        $rootScope.userType = null;
                        $scope.createMessage = "Contul a fost sters cu succes."
                        $scope.confMessage = "Confirmare"
                        $("#successPopup").modal('show');
                        $("#content").css("background-color", "#DFF2BF");
                        $("#content").css("color", "#4F8A10");
                    }
                    else {
                        $scope.createMessage = "Contul nu poate fi sters."
                        $scope.confMessage = "A aparut o eroare"
                        $("#successPopup").modal('show');
                        $("#content").css("background-color", "#FFBABA");
                        $("#content").css("color", "#D8000C");
                    }
                }).error(function () {

                });
            }
        });
    }
    $scope.goHome = function(){
        $location.path("/");
    }
});