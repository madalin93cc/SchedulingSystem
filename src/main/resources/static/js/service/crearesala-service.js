app.service('CrearesalaService', function() {
    this.conferenceroom = new Object();
    this.conferenceroom.location = new Object();
    this.conferenceroom.features = new Object();
    this.conferenceroom.equipments = new Object();

    this.update = function(oldSelect, oldConferenceRoom){
        debugger
        switch(oldSelect){
            case 1:{
                for (var key in oldConferenceRoom){
                    if (["location", "features", "equipments"].indexOf(key) <0 )
                        this.conferenceroom[key] = oldConferenceRoom[key];
                }
                break;
            }
            case 2:{
                this.conferenceroom.location = jQuery.extend({}, oldConferenceRoom);
                break;
            }
            case 3:{
                this.conferenceroom.features = jQuery.extend({}, oldConferenceRoom);
                break;
            }
            case 4:{
                this.conferenceroom.equipments = jQuery.extend({}, oldConferenceRoom);
                break;
            }
        }
    }

    this.load = function(sel){
        debugger;
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
                ret = jQuery.extend({}, this.conferenceroom.location);
                break;
            }
            case 3:{
                ret = jQuery.extend({}, this.conferenceroom.features);
                break;
            }
            case 4:{
                ret = jQuery.extend({}, this.conferenceroom.equipments);
                break;
            }
        }
        return ret;
    }
});