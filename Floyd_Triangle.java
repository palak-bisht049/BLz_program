//FLOYD'S TRIANGLE : It's a right angled triangle where number print in row-wise in increasing order

import java.util.Scanner;

public class Floyd_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        int num = 1;
        for (int i = 1; i <= rows; i++) {     
            for (int j = 1; j <= i; j++) {        
                System.out.print(num + " ");
                num++;
            }
            System.out.println();  
        }
    }
}



//************OUTPUT:

// Enter number of rows: 4
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
