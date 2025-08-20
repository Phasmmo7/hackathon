package hackathon;
import java.util.Scanner;
public class project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to DOGS BREED GYAN");
        System.out.println("Get all information about different types of dog breed");

        System.out.println("=== Dog Breed Information ===");
        System.out.println("1. Labrador Retriever");
        System.out.println("2. German Shepherd");
        System.out.println("3. Golden Retriever");
        System.out.println("4. Bulldog");
        System.out.println("5. Beagle");
        System.out.print("Choose a breed (1-5): ");

        int choice = sc.nextInt();
        System.out.println();

        switch (choice) {
            case 1:
                System.out.println("Labrador Retriever:");
                System.out.println("- Friendly, outgoing, high-spirited");
                System.out.println("- Great family dogs and very intelligent");
                System.out.println("- Life span: 10–12 years");
                System.out.println("- Height: 21–24 inches");
                break;
            case 2:
                System.out.println("German Shepherd:");
                System.out.println("- Intelligent, courageous, confident");
                System.out.println("- Excellent working and guard dogs");
                System.out.println("- Life span: 9–13 years");
                System.out.println("- Height: 22–26 inches");
                break;
            case 3:
                System.out.println("Golden Retriever:");
                System.out.println("- Gentle, friendly, trustworthy");
                System.out.println("- Great with kids, loves playing fetch");
                System.out.println("- Life span: 10–12 years");
                System.out.println("- Height: 21–24 inches");
                break;
            case 4:
                System.out.println("Bulldog:");
                System.out.println("- Calm, courageous, loving");
                System.out.println("- Known for their wrinkled face and stocky build");
                System.out.println("- Life span: 8–10 years");
                System.out.println("- Height: 14–15 inches");
                break;
            case 5:
                System.out.println("Beagle:");
                System.out.println("- Curious, friendly, merry");
                System.out.println("- Great sense of smell, used as hunting dogs");
                System.out.println("- Life span: 12–15 years");
                System.out.println("- Height: 13–15 inches");
                break;
            default:
                System.out.println("Invalid choice. Please run again.");
        }

        sc.close();
        
    }

    
}