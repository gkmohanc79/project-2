package Abstract;


// abstract class
abstract class A
{
    // we can't create an object due it was abstract class and abstract method
   abstract void display();
   // an abstract class can have abstract method and normal method also. but abstract method must..
    void disp()
    {
        System.out.println("Show Method ");
    }
}

// abstract class with extedns of abstract method
 abstract class B extends A

{
    // abstract method
    // we can't create an object
    void display() {
        System.out.println("Abstract method in Class A");

    }
    abstract void show();

}

// class with extends of abstract method
class C extends B
{

    // concrete method
    void show()
    {
        System.out.println("Abstract method in Class B");
    }
}



public class Abstract {
    public static void main(String[] args) {
        // create an object calling abstrct methods to declaring the defination
        C obj = new C();
        obj.display();
        obj.disp();
        obj.show();
        // result will be class A and class B

    }
}
