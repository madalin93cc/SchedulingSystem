app.service('CrearesalaService', function($http) {

    this.conferenceroom = new Object();
    this.conferenceroom.fkLocation = new Object();
    this.conferenceroom.fkFeatures = new Object();
    this.conferenceroom.fkEquipment = new Object();
    this.conferenceroomDTO = undefined;

    this.update = function(oldSelect, oldConferenceRoom){
        switch(oldSelect){
            case 1:{
                for (var key in oldConferenceRoom){
                    if (["location", "features", "equipments"].indexOf(key) <0 )
                        this.conferenceroom[key] = oldConferenceRoom[key];
                }
                break;
            }
            case 2:{
                this.conferenceroom.fkLocation = jQuery.extend({}, oldConferenceRoom);
                break;
            }
            case 3:{
                this.conferenceroom.fkFeatures = jQuery.extend({}, oldConferenceRoom);
                break;
            }
            case 4:{
                this.conferenceroom.fkEquipment = jQuery.extend({}, oldConferenceRoom);
                break;
            }
        }
    }

    this.load = function(sel){
        var ret = new Object();
        switch (sel){
            case 1:{
                for (var key in this.conferenceroom){
                    if (["location", "features", "equipments"].indexOf(key) < 0 ){
                        ret[key] = this.conferenceroom[key];
                    }
                }
                break;
            }
            case 2:{
                ret = jQuery.extend({}, this.conferenceroom.fkLocation);
                break;
            }
            case 3:{
                ret = jQuery.extend({}, this.conferenceroom.fkFeatures);
                break;
            }
            case 4:{
                ret = jQuery.extend({}, this.conferenceroom.fkEquipment);
                break;
            }
        }
        return ret;
    }

    this.copyAndSave = function(){
        debugger

    }
});