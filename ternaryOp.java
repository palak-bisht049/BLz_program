import java.util.Scanner;

public class ternaryOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        System.out.print("Enter fourth number: ");
        int d = sc.nextInt();
        
        ////////for 2 numbers the ternanry oepration would be;
        // int max = (a > b) ? a : b;

        ////////for 3 numbers the ternary operation would be;
        // int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        //////// for 4 numbers the ternary operation would be;
        int max = (a > b) ? (a > c ? (a > d ? a : d) : (c > d ? c : d)) : (b > c ? (b > d ? b : d) : (c > d ? c : d));

        System.out.println("Largest number is: " + max);
    }
}
