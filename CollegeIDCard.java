import java.util.Scanner;

public class CollegeIDCard {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your roll number: ");
        String rollNumber = scanner.nextLine();

        System.out.print("Enter your college name: ");
        String collegeName = scanner.nextLine();

        System.out.print("Enter your course: ");
        String course = scanner.nextLine();

        System.out.println("\n");
        System.out.println("");
        System.out.println("");
        System.out.println("Name         : " + name);
        System.out.println("Roll Number  : " + rollNumber);
        System.out.println("College Name : " + collegeName);
        System.out.println("Course       : " + course);
        System.out.println("");

    }
}
