public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        Basic obj1 = new Basic(1,5);

        Basic obj2 = new Basic(6,2);

        mobile ob1= new mobile();
        ob1.brand= "Apple";
        ob1.price= 12000;
        ob1.network= "ultra";
        ob1.name= "smartphone";
        System.out.println();
        ob1.show();

    }
}

class mobile
{
    static String brand;
    static Integer price;
    static String network;
    static String name;
    public void show(){
        System.out.println(brand+  " :"+ price+":"+network+":"+name);
    }

}

