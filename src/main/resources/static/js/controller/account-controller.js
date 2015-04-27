app.controller('account', function($scope, $http, $location) {
    $scope.createaccount = function(user) {
        $scope.url = "/add/" + user.firstname + "/"
            + user.lastname + "/"
            + user.username + "/"
            + user.password + "/"
            + user.type;

        $http.post($scope.url, {}).success(function(data) {
            if (data == ""){
                $scope.createMessage = "Cont deja existent."
                $("#successPopup").modal('show');
//                $("#successPopup").css("background-color", "yellow");
                $("#successPopup").getModalBody().css('background-color', '#0088cc');
            }
            else{
                $scope.createMessage = "Contul a fost creat cu succes."
                $("#successPopup").modal('show');
            }
        }).error(function() {
        });
    };
    $scope.goHome = function () {
        if ($scope.createMessage == "Contul a fost creat cu succes.") {
            $location.path("/");
        }
    }
});