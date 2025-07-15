import java.util.Scanner;

public class University {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your roll number: ");
        String rollNumber = sc.nextLine();

        System.out.print("Enter your college name: ");
        String collegeName = sc.nextLine();

        System.out.print("Enter your course: ");
        String course = sc.nextLine();

        System.out.println("Enter your address: ");
        String address = sc.nextLine(); 

        System.out.println("\n");

        System.out.println("Name         : " + name);
        System.out.println("Roll Number  : " + rollNumber);
        System.out.println("College Name : " + collegeName);
        System.out.println("Course       : " + course);
        System.out.println("address      : " + address);
    }
}
