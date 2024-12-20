import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class manipulateArrays {
    public static int[] collection() {
        System.out.print("What is the size of the array?: ");
        Scanner scanner = new Scanner(System.in);
        int askSize = scanner.nextInt(); scanner.nextLine(); //consumes next line;

        int[] arr = new int[askSize];
        //for loops
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number " + (i+1) + ":");
            int response = scanner.nextInt(); scanner.nextLine();
            arr[i] = response;
        }
        return arr;
    }
    public static int[] duplicateNumbers(int[] array) {
        Set<Integer> temp = new HashSet<>();
        for (int arr : array)
            temp.add(arr);

        int[] mainArray = new int[temp.size()]; // Create the array with the size of the Set.
        int i = 0;
        for (int temArray : temp) {
            mainArray[i++] = temArray;
        }
        Arrays.sort(mainArray);
        return mainArray;
    }
    /*
    * Here, I include a binary search method even though
    * it is not meant to be here.
    * I hope to move it to a different method soon.
    * */
    public static int binarySearch(int[] array, int start, int end, int target) {
        //base case because I intend to use recursion
        if (start == end){
            return -1;
        }
        //define the mid-value. Note that mid is an index value of the array
        //target is the element but mid is an index of an array
        int mid = (start + end) / 2;
        //what if the target == array[mid]
        if (target == array[mid])
            return mid;

        if (target < array[mid]) {
            return binarySearch(array, start, mid - 1, target); //recursive call
        }
        return binarySearch(array, mid + 1, end, target); //recursive call
    }
}
