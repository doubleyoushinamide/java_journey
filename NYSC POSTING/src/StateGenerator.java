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
    //these are states that the candidates has not been to.
    // Candidate can safely be posted to any of the array items here.
    public void safeStates(){
        String[] allSafeStates;
        if (regionOfOrigin.equals("SOUTH-SOUTH")) {
            allSafeStates = combineArray(SOUTH_WEST, SOUTH_EAST, NORTH, NORTH_CENTRAL);
        }
        else if (regionOfOrigin.equals("SOUTH-EAST")) {
            allSafeStates = combineArray(SOUTH_WEST, SOUTH_SOUTH, NORTH, NORTH_CENTRAL);
        }
    }
    //the combined array here was deliberately extended for the sake of ease
    public static String[] combineArray(String[] arr1, String[] arr2, String[] arr3, String[] arr4){
        int arrSize = arr1.length + arr2.length;
        String[] result = new String[arrSize];

        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        System.arraycopy(arr3, 0, result, result.length, arr3.length);
        System.arraycopy(arr4, 0, result, result.length, arr4.length);

        return result;
    }

}
