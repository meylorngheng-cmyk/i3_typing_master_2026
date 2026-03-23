import java.util.Scanner;
import java.time.Instant;

public class User_Type_Screen {

    private static Scanner scanner = new Scanner(System.in);
    private static final String[] SAMPLE_TEXTS = {
            "The quick brown fox jumps over the lazy dog.",
            "Java is a powerful and versatile programming language.",
            "Typing speed is essential for productivity in the digital age.",
            "Practice makes perfect when it comes to typing skills.",
            "I3 Typing Master helps you improve your typing speed and accuracy."
    };

    public static void displayTypingTestScreen() {
        boolean testing = true;

        while (testing) {
            System.out.println("\n------------ Typing Test Screen -----------");
            System.out.println("1. Start Typing Test");
            System.out.println("2. View Instructions");
            System.out.println("3. Exit to Main Menu");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    startTypingTest();
                    break;
                case "2":
                    displayInstructions();
                    break;
                case "3":
                    testing = false;
                    System.out.println("Returning to main menu...\n");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.\n");
            }
        }
    }

    private static void startTypingTest() {
        System.out.println("\n--- TYPING TEST ---");
        System.out.println("Select difficulty level:");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");
        System.out.print("Choose difficulty: ");

        String difficulty = scanner.nextLine().trim();
        String sampleText = "";

        switch (difficulty) {
            case "1":
                sampleText = SAMPLE_TEXTS[0];
                break;
            case "2":
                sampleText = SAMPLE_TEXTS[1];
                break;
            case "3":
                sampleText = SAMPLE_TEXTS[2 + (int) (Math.random() * 3)];
                break;
            default:
                System.out.println("Invalid difficulty. Using easy text.\n");
                sampleText = SAMPLE_TEXTS[0];
        }

        performTypingTest(sampleText);
    }

    private static void performTypingTest(String sampleText) {
        System.out.println("\nType the following text as fast and accurately as you can:");
        System.out.println("\"" + sampleText + "\"");
        System.out.println("\nPress Enter when ready to start...");
        scanner.nextLine();
        
        System.out.println("Starting test... GO!\n");
        long startTime = System.currentTimeMillis();
        
        String userTypedText = scanner.nextLine();
        
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        
        calculateAndDisplayResults(sampleText, userTypedText, timeElapsed);
    }
    
    private static void calculateAndDisplayResults(String originalText, String typedText, long timeElapsedMs) {
        double timeElapsedSeconds = timeElapsedMs / 1000.0;
        double timeElapsedMinutes = timeElapsedSeconds / 60.0;

        // Calculate Words Per Minute (WPM)
        int wordCount = typedText.trim().split("\\s+").length;
        double wpm = wordCount / timeElapsedMinutes;

        // Calculate accuracy
        int correctChars = 0;
        int minLength = Math.min(originalText.length(), typedText.length());

        for (int i = 0; i < minLength; i++) {
            if (originalText.charAt(i) == typedText.charAt(i)) {
                correctChars++;
            }
        }

        double accuracy = (correctChars / (double) originalText.length()) * 100;

        // Handle case where user typed more than the original text
        if (typedText.length() > originalText.length()) {
            accuracy = Math.min(accuracy, 100.0);
        }

        // Display results
        System.out.println("\n========== TEST RESULTS ==========");
        System.out.println("Time Elapsed: " + String.format("%.2f", timeElapsedSeconds) + " seconds");
        System.out.println("Words Typed: " + wordCount);
        System.out.println("Typing Speed (WPM): " + String.format("%.2f", wpm) + " WPM");
        System.out.println("Accuracy: " + String.format("%.2f", accuracy) + "%");
        System.out.println("Correct Characters: " + correctChars + " / " + originalText.length());

        // Performance rating
        if (wpm >= 60 && accuracy >= 95) {
            System.out.println("Rating: Excellent!");
        } else if (wpm >= 40 && accuracy >= 90) {
            System.out.println("Rating: Good!");
        } else if (wpm >= 20 && accuracy >= 80) {
            System.out.println("Rating: Average!");
        } else {
            System.out.println("Rating: Keep Practicing!");
        }
        System.out.println("==================================\n");
    }

    private static void displayInstructions() {
        System.out.println("\n========== TYPING TEST INSTRUCTIONS ==========");
        System.out.println("1. Select a difficulty level (Easy, Medium, or Hard)");
        System.out.println("2. You will see a sample text to type");
        System.out.println("3. Read the text carefully and prepare to type");
        System.out.println("4. Press Enter to start the timer");
        System.out.println("5. Type the text as accurately and quickly as possible");
        System.out.println("6. Your typing speed (WPM) and accuracy will be calculated");
        System.out.println("7. WPM = Words Per Minute");
        System.out.println("8. Higher WPM and accuracy = Better performance");
        System.out.println("=============================================\n");
    }
}
