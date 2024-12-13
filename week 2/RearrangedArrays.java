import java.util.Arrays;

public class RearrangedArrays{
    public static void main(String[] args) {
        int[] numbers = {1,3,5,7,9,2,4,6,8,10};
        //first divide the numbers using numbers.length
        int n = numbers.length / 2;
        //second provide where the first sets and second should be stored via Arrays class
        int[] firstSet = Arrays.copyOfRange(numbers, 0, n);
        int[] secondSet = Arrays.copyOfRange(numbers, n, numbers.length);

        //System.out.println(Arrays.toString(firstSet));
        //System.out.println(Arrays.toString(secondSet));

        //create the newNumberFormat using the int[]
        int[] newNumberFormat = new int[numbers.length];

        //create the index integer for increment while inside the loop
        int index = 0; //index counter

        //loop and arrange the first and second sets into newNumberFormat
        for (int i = 0; i < n; i++) {
            newNumberFormat[index++] = firstSet[i];
            newNumberFormat[index++] = secondSet[i];
        }
        //printout the output using Arrays.toString()
        System.out.println("The arrays are: " + Arrays.toString(newNumberFormat));
    }
}