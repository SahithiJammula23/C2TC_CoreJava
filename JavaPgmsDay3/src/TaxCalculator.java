import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Take input from the user
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        
        System.out.print("Enter your gender (M/F): ");
        char gender = input.next().charAt(0);
        
        System.out.print("Enter your salary: ");
        double salary = input.nextDouble();
        
        // Calculate tax based on salary
        double tax;
        if (salary <= 250000) {
            tax = 0;
        } else if (salary > 250000 && salary <= 500000) {
            tax = 0.05 * (salary - 250000);
        } else if (salary > 500000 && salary <= 1000000) {
            tax = 12500 + 0.2 * (salary - 500000);
        } else {
            tax = 112500 + 0.3 * (salary - 1000000);
        }
        
        // Print tax information
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Salary: " + salary);
        System.out.println("Tax: " + tax);
        
    }

}
