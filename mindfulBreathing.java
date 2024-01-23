import java.util.Scanner;

class MindfulBreathingExercise {
    private int duration; // in seconds

    public MindfulBreathingExercise(int duration) {
        this.duration = duration;
    }

    public void startExercise() {
        System.out.println("Welcome to the Mindful Breathing Exercise!");
        System.out.println("Follow the prompts to guide your mindful breathing.");

        // Perform the exercise
        for (int i = 1; i <= duration; i++) {
            System.out.println("Inhale...");
            sleep(2); // Adjust the duration for inhaling

            System.out.println("Hold your breath...");
            sleep(1); // Adjust the duration for holding

            System.out.println("Exhale...");
            sleep(3); // Adjust the duration for exhaling

            System.out.println("Rest...");
            sleep(2); // Adjust the duration for resting
        }

        System.out.println("Mindful Breathing Exercise complete. Well done!");
    }

    private void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000); // Convert seconds to milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class MindfulBreathingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the duration of the mindful breathing exercise (in seconds): ");
        int exerciseDuration = scanner.nextInt();

        MindfulBreathingExercise breathingExercise = new MindfulBreathingExercise(exerciseDuration);
        breathingExercise.startExercise();
    }
}
