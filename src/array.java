class Student
{

    int rollno; // instant vaiables
    int marks;
    String name;
}

public class array {
    public static void main(String args[]) {




        //***** array loop with objective
        Student s1= new Student();
        s1.rollno=1;
        s1.marks=78;
        s1.name="Gayamma";
        Student s2= new Student();
        s2.rollno=2;
        s2.marks=86;
        s2.name="Krishna";
        Student s3= new Student();
        s3.rollno=3;
        s3.marks=72;
        s3.name="Mohan";


        Student students[]= new Student[3];
        students[0]= s1;
        students[1]=s2;
        students[2]=s3;

       // calling method  one ;;;;

        for (Student stud: students)

        {
           System.out.println(stud.rollno +" : "+stud.marks +" :"+stud.name);
        }

        // calling method  two ;;;;

//        for (int i=0;i<students.length;i++)
//        {
//            System.out.println(students[i].rollno +" : "+students[i].marks +" :"+students[i].name);
//        }




// Enhanced for loop array..,multi dimention//jagged array


//     int nums[][]= new int [4][4];
//
//     nums[0]= new int[4];//jagged array
//     nums[1]= new int[2];
//     nums[2]= new int[3];
//     nums[3]= new int[4];
//
//        for (int i=0;i<nums.length;i++)//nested loop
//        {
//            for (int j=0;j<nums[i].length;j++) {
//                nums[i][j] = (int) (Math.random() * 10);
//            }
//        }
//        for (int n[]: nums)// Enhanced for loop
//        {
//            for (int m:n)
//        {
//            System.out.print(m+ " ");
//        }
//            System.out.println();
//        }
//
//        // nested loop and multi dimention array..,


//        int num1[][]= new int [3][4];
//        for (int i=0;i<3;i++)
//        {
//            for (int j=0;j<4;j++) {
//                num1[i][j] = (int) (Math.random() * 10);
//            }
//         }
//
//         for (int i=0;i<3;i++)
//         {
//             for (int j=0;j<4;j++)
//             {
//
//                 System.out.print(num1[i][j] + " ");
//             }
//             System.out.println();
//     }
//
//         // Basic array...
//
//    int num [] = {3,4,5,6,7};
//      num [1]=8;
//        System.out.println(num[1]);
//
//        // Basic array by passing Index values
//    int b[] = new int[3];
//       b[0]=1;
//       b[1]=2;
//       b[2]=4;
//     for(int k=0;k<=2;k++)
//     {
//         System.out.println(b[k]);
//     }
//
//    }
//}


// enhance for loop....
//for (int n[]: nums)
//        {
//            for (int m:n)
//        {
//            System.out.print(m+ " ");
//        }
//            System.out.println();
//        }

       // example 2;;; enhance array....
//        int no[] = new int[4];
//        no[0] = 4;
//        no[1] = 3;
//        no[2] = 5;
//        no[3] = 2;
//
//        for (int n : no) {
//            System.out.println(n);
//        }
}
}