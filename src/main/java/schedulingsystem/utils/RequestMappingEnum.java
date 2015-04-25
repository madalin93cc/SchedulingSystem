package schedulingsystem.utils;

/**
 * Created by Colezea on 26/04/2015.
 */
public enum RequestMappingEnum {
    CREATE_ACCOUNT ("/add/{firstName}/{lastName}/{username}/{password}/{type}");

    private String value;

    RequestMappingEnum(String value){
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
