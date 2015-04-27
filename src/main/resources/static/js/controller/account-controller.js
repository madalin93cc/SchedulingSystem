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
                $("#content").css("background-color", "#FFBABA");
                $("#content").css("color", "#D8000C");
            }
            else{
                $scope.createMessage = "Contul a fost creat cu succes."
                $("#successPopup").modal('show');
                $("#content").css("background-color", "#DFF2BF");
                $("#content").css("color", "#4F8A10");
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