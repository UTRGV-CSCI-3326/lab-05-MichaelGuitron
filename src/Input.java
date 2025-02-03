import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get and store user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Get and store user's age
        System.out.print("Enter your age (whole number): ");
        int age = scanner.nextInt();

        // Get and store user's weight
        System.out.print("Enter your weight (real number): ");
        float weight = scanner.nextFloat();

        // Get and store if the user is a smoker
        System.out.print("Are you a smoker? (true/false): ");
        boolean isSmoker = scanner.nextBoolean();

        // Output all collected information
        System.out.println("\nMedical Form Summary:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Smoker: " + isSmoker);

        // Close the scanner
        scanner.close();
    }
}
