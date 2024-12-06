class MyClasses {
    public static void main(String arg[]) {
        int a = 5;
        int b = a++; //post increament
        System.out.println(".....Post Increment Stage.....");
        System.out.println(a);
        System.out.println(b);
        
        //pre increament
        System.out.println(".....Pre Increment Stage.....");
        b = +a; //note how a +a is a+1 while ++a is a+2
        System.out.println(a);
        System.out.println(b);
        
        System.out.println(".....Pre Decrement Stage.....");
        b = --a; //note how a +a is a+1 while ++a is a+2
        System.out.println(a);
        System.out.println(b);
        
        System.out.println(".....Post Decrement Stage.....");
        b = a--; //note how a +a is a+1 while ++a is a+2
        System.out.println(a);
        System.out.println(b);
        
        
        /**
        * while a++, a becomes 6 while storing initial
        * values on b.
        * whereas, ++a is a pre-increment that increments and
        * stores up the incremented value in b
        **/
        //print out
    }
}
