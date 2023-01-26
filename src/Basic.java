import java.util.Scanner;

public class Basic {

    int i;

    Basic()
    {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the input: ");
//
//        int i = sc.nextInt();
       i = 10;
    }

    public Basic(int a, int b)
    {
        System.out.println("Sum is :" + (a+b));
        System.out.println("Multiplication is :" + (a*b));
        System.out.println("Division is :" + (a/b));
        System.out.println("Subtraction is :" + (a-b));


    }

    public static int getValue()
    {
        return 9;
    }
    public static void main(String args[])
    {
       Basic e1 = new Basic();
        Basic   e2 = new Basic(8,6);
        Basic   e3 = new Basic(3,4);






           System.out.println(e1.i+" "+e2.i+ " "+e3.i);
            System.out.println(" Print the shape  "+ e1.getValue());



    }
}


