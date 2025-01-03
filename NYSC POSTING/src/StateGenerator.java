import com.sun.jdi.InvalidTypeException;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StateGenerator {
    String selectedState;
    String regionOfOrigin;
    String stateOfOrigin;
    String[] SOUTH_SOUTH;
    String[] SOUTH_WEST;
    String[] NORTH_CENTRAL;
    String[] NORTH;
    String[] SOUTH_EAST;

    public StateGenerator() throws InvalidTypeException {
        SOUTH_SOUTH = new String[]{"NIGER-DELTA", "AKWA-IBOM", "CROSS RIVER", "BAYELSA"};
        SOUTH_WEST = new String[]{"LAGOS", "OGUN", "ONDO", "EKITI", "OYO"};
        NORTH_CENTRAL = new String[]{"KWARA", "NIGER", "ABUJA", "PLATEAU"};
        NORTH = new String[]{"SOKOTO", "TARABA", "MAIDUGURI", "KEBBI", "JIGAWA", "NASSARAWA", "KADUNA"};
        SOUTH_EAST = new String[]{"BENUE", "ABIA", "IMO", "ENUGU", "ANAMBRA"};
        Bio bio = new Bio();
        this.stateOfOrigin = bio.getStateOfOrigin();
        this.regionOfOrigin = identifyStateOfOrigin();
    }
    private String identifyStateOfOrigin(){
        while (true){
            for (String i : SOUTH_SOUTH) {
                if (stateOfOrigin.equals(i)) {
                    return "SOUTH-SOUTH";
                }
            }
            for (String i : SOUTH_WEST) {
                if (stateOfOrigin.equals(i)) {
                    return "SOUTH-WEST";
                }
            }
            for (String i : NORTH_CENTRAL) {
                if (stateOfOrigin.equals(i)) {
                    return "NORTH-CENTRAL";
                }
            }
            for (String i : NORTH) {
                if (stateOfOrigin.equals(i)) {
                    return "NORTH";
                }
            }
            for (String i : SOUTH_EAST) {
                if (stateOfOrigin.equals(i)) {
                    return "SOUTH-EAST";
                }
            }
        }
    }

    public void stateGenerator(){

    }

}
