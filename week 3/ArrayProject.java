import java.util.*;

public class ArrayProject {
    public static void main(String[] args) {
        int[] removedDuplicates = duplicateRemoval(fetchingArrays());
        System.out.println("The tray Numbers has been sorted: " + Arrays.toString(removedDuplicates));

    }
    public static int[] fetchingArrays(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the size of your array?");
        int sizeArray = scanner.nextInt();
        scanner.nextLine();

        List<Integer> tempList = new ArrayList<>();

        for (int i = 1; i <= sizeArray; i++) {
            System.out.print("Enter the number " + i + " :");
            int addedNumbers = scanner.nextInt();
            scanner.nextLine(); //consumes the new line
            tempList.add(addedNumbers);
        }
        int[] inputArrays = new int[tempList.size()];
        int i = 0;
        for (int nums : tempList){
            inputArrays[i++] = nums;
        }
        Arrays.sort(inputArrays);
        return inputArrays;
    }

    public static int[] duplicateRemoval(int[] num) {
        Set<Integer> numSet = new HashSet<>();
        for (int n : num) {
            numSet.add(n);
        }
        //duplicates would have been removed by now
        //convert back the sets to array
        int[] numArrays = new int[numSet.size()];
        int i = 0; //initialize counter/index
        for (int num2 : numSet) {
            numArrays[i++] = num2;
        }
        Arrays.sort(numArrays); //sort them in ascending order
        return numArrays; //return sorted array
    }
}
