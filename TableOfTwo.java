import java.util.Scanner;


            // USING FOR LOOP :

// public class Table{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         for (int i = 1; i < 11; i++) {
//             System.out.println(num + " x " + i + " = " + (num * i));
//         }

//     }
// }





            // USING WHILE LOOP :

// public class TableOfTwo {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();    
//         int i = 1;        //iteration number      
//         while (i <= 10) { //while loop
//             System.out.println(num + " x " + i + " = " + (num * i));
//             i++;
//         }
//     }
// }





            //DO-WHILE LOOP :

public class TableOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int i = 1;        
        do {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }
        while (i <= 10);   
    }    
       
}         