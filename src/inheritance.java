import org.w3c.dom.ls.LSOutput;

/**Interface.....

// through interface we can access the inheritance properties.
// directly we can't access inheritance properties.
//achieve multiple inheritance
// two keywords (interface and implements)
// we can have only abstract methods ( writing only method declaration but not method defination).
// it should contain only abstract methods
// one can implement multiple interface this should not be in Inheritance
 */


/** Exception handling
 * Avoiding abnormal termination of the program.
 * keywards use for exception handling are Try- Catch- Finally - Throw- Throws
 * TRY it is block of statments ( write code in which we are expecting the exceptions)
 * CATCH it is block of statements handling exception raised in try block.
 * try and catch are interlinked without try no catch block vice versa.
 * checked exceptions -- compile time
 * unchecked exceptions -- run time ( eg arithametic , number format,array bound ,null point exceptions).
 *
 *
 * errors
 */

// using interface instead abstract
interface A
{
    void Adisplay();
    void Ashow();

}
interface B
{
    void Bdisplay();
    void Bshow();

}

//child class can multiple interfaces through multiple methods through definations

class A1 implements A {

    public void Adisplay() {
        System.out.println("A Display");

    }

    public void Ashow() {
        System.out.println("A show");

    }
}
class B1 implements A,B
{

    public void Adisplay()
    {
        System.out.println("A Display");

    }
    public void Ashow()
    {
        System.out.println("A show");

    }
    public void Bdisplay()
    {
        System.out.println("B Display");

    }
    public void Bshow()
    {
        System.out.println("B show");

    }
}

class InterfaceAB
{
    public static void main(String[] args) {
        A1 obj1 = new A1();
        B1 obj = new B1();
        obj1.Adisplay();
        obj1.Ashow();
        obj.Adisplay();
        obj.Bdisplay();
        obj.Ashow();
        obj.Bshow();
    }
}






//public class inheritance {
//    class Data
//    {
//        int s=10;
//        int l=20;
//        int b=30;
//        int s1=25,s2=35,s3=42;
//
//    }
//
//    class   square extends Data
//    {
//        int area;
//        void calarea()
//        {
//            area = s*s;
//            System.out.println(area);
//        }
//
//    }
//   class Rectangle extends Data
//
//   {
//       int p, area;
//       void calrect()
//       {
//           p= 2*(l*b);
//           area= l*b;
//           System.out.println("perimeter = "+p);
//           System.out.println("area= "+area);
//       }
//   }
//}
//
//class inheritance
//{
//    public static void main(String args[]) {
//
//       Square s = new Square();
//        Rectangle r= new Rectangle();
//        s.calarea();
//        r.calrect();
//    }
//}