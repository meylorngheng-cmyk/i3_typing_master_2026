import java.util.Scanner;
public class welcomescreen {
private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean running = true;
        
        while (running) {
            displayMenu();
            String choice = scanner.nextLine().trim();
            
            switch (choice) {
                case "1":
                    login();
                    break;
                case "2":
                    register();
                    break;
                case "3":
                    exit();
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.\n");
            }
        }
    }
    
    private static void displayMenu() {
        System.out.println("------------ Welcome to I3 Typing Master v2026 -----------");
        System.out.println("To begin, please select one of the following options:");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
    }
    
    private static void login() {
        System.out.println("\n--- LOGIN ---");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.println("Login successful! Welcome, " + username + "!\n");
    }
    
    private static void register() {
        System.out.println("\n--- REGISTER ---");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.print("Confirm password: ");
        String confirmPassword = scanner.nextLine();
        
        if (password.equals(confirmPassword)) {
            System.out.println("Registration successful for " + username + "!\n");
        } else {
            System.out.println("Passwords do not match. Registration failed.\n");
        }
    }
    
    private static void exit() {
        System.out.println("\nThank you for using I3 Typing Master. Goodbye!");
    }
}
