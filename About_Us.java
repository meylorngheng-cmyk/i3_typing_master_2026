import java.util.Scanner;

public class About_Us {

    private static Scanner scanner = new Scanner(System.in);

    public static void displayAboutUs() {
        boolean viewing = true;

        while (viewing) {
            showAboutInformation();
            System.out.print("Press Enter to continue or type '0' to return to menu: ");
            String input = scanner.nextLine().trim();

            if (input.equals("0")) {
                viewing = false;
                System.out.println("Returning to main menu...\n");
            }
        }
    }

    private static void showAboutInformation() {
        System.out.println("\n========================================");
        System.out.println("       I3 TYPING MASTER - ABOUT US       ");
        System.out.println("========================================\n");

        System.out.println("APPLICATION NAME:");
        System.out.println("I3 Typing Master v2026\n");

        System.out.println("DESCRIPTION:");
        System.out.println("I3 Typing Master is a comprehensive typing speed and accuracy");
        System.out.println("testing application designed to help users improve their typing");
        System.out.println("skills. Whether you're a beginner looking to learn proper typing");
        System.out.println("techniques or an advanced typist aiming for professional speed,");
        System.out.println("I3 Typing Master provides the tools you need.\n");

        System.out.println("VERSION:");
        System.out.println("v2026 (Latest)\n");

        System.out.println("FEATURES:");
        System.out.println("✓ User Registration and Login System");
        System.out.println("✓ Real-time Typing Speed Measurement (WPM)");
        System.out.println("✓ Accuracy Calculation and Performance Rating");
        System.out.println("✓ Multiple Difficulty Levels (Easy, Medium, Hard)");
        System.out.println("✓ Password Reset Functionality");
        System.out.println("✓ Comprehensive Test Results Tracking\n");

        System.out.println("MISSION:");
        System.out.println("Our mission is to revolutionize the way people learn and practice");
        System.out.println("typing skills through an intuitive, interactive, and engaging");
        System.out.println("platform that provides immediate feedback and motivation.\n");

        System.out.println("TARGET AUDIENCE:");
        System.out.println("• Students and Professionals");
        System.out.println("• Typists seeking to improve speed and accuracy");
        System.out.println("• Data entry professionals");
        System.out.println("• Programmers and developers");
        System.out.println("• Anyone interested in enhancing their typing proficiency\n");

        System.out.println("DEVELOPERS:");
        System.out.println("Developed by the I3 Development Team\n");

        System.out.println("SUPPORT:");
        System.out.println("For support, feedback, or inquiries, please contact us at:");
        System.out.println("Email: support@i3typingmaster.com");
        System.out.println("Website: www.i3typingmaster.com\n");

        System.out.println("COPYRIGHT:");
        System.out.println("© 2026 I3 Typing Master. All rights reserved.\n");

        System.out.println("========================================\n");
    }
}
