package hackathon;
import java.util.Scanner;
public class project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to DOGS BREED GYAN");
        System.out.println("Get all information about different types of dog breed");

        
        System.out.println("1. Labrador Retriever");
        System.out.println("2. German Shepherd");
        System.out.println("3. Golden Retriever");
        System.out.println("4. Bulldog");
        System.out.println("5. Poodle");
        System.out.println("Enter button number according to breed");
        int button = sc.nextInt();
        switch (button){
            case 1:
            System.out.println("******Labrador Retriever******");
            System.out.println("FOOD TO GIVE:- Choose premium dry kibble with real meat (chicken, lamb, fish) as the first ingredient.\n" + //
                                "\n" + //
                                "Look for 26–30% protein and 12–18% fat.\n" + //
                                "\n" + //
                                "Avoid fillers like corn, soy, artificial colors, and by-products.");

            System.out.println("\nAVERAGE AGE :-The average lifespan of a Labrador Retriever is 10 to 12 years.");
            
            System.out.println("\nGROOMING :- Brush a Labrador 2–3 times a week (daily during shedding) and bathe once every 1–2 months using mild dog shampoo. Clean ears weekly, trim nails monthly, and brush teeth regularly to keep them healthy.");
             String website = "https://www.akc.org/dog-breeds/labrador-retriever/";

        // Print the website link
        System.out.println("\nFor more details about Labrador Retriever, visit: " + website);
        System.out.println("pramod");
        }
        
    }

    
}