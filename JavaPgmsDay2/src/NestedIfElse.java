import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult.");
            if (age >= 65) {
                System.out.println("You are a senior citizen.");
            } else {
                System.out.println("You are not a senior citizen.");
            }
        } else {
            System.out.println("You are a minor.");
        }

	}

}
