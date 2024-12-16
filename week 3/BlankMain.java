import java.text.NumberFormat;

public class BlankMain {
    public static void main(String[] args) {
        //This is how to use the numberFormat to format input numbers
        //into strings.
        String price = NumberFormat.getCurrencyInstance().format(100345678.345);
        System.out.println("Your money in Naira is: " + price);

        //Get other formating instances
        String name = NumberFormat.getNumberInstance().format(23456);
        System.out.println("Formated number = " + name); // this outputs 23456 as 23,456

        //Get percent instance
        String percent = NumberFormat.getPercentInstance().format(0.1234);
        System.out.println("Your percentage is: " + percent);
        //Casting
        //implicit casting
        // int -> double is an implicit type casting
        // double -> int is an explicit type casting
        int number = 4;
        double newNumber = 5.0 - number; //here java automatically casts int `number` as double
        System.out.println("After implicit casting: " + newNumber); //prints a double 1.0
        // double -> int is an explicit type casting
        double numberTwo = 4.0;
        int newNumberTwo = (int) numberTwo * 2; //by `(int) numberTwo` we just explicitly cast
        // double to int. This leads to data loss.
        System.out.println("After explicit casting: " + newNumberTwo);
    }
}
