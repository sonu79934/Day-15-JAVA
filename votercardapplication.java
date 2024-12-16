import java.util.*;

class votercardapplication {
    static class Applicant {
        String name;
        int age;
        String gender;
        String address;

        public Applicant(String name, int age, String gender, String address) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.address = address;
        }

        public void displayDetails() {
            System.out.println("\n--- Voter Card Details ---");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Gender: " + gender);
            System.out.println("Address: " + address);
            System.out.println("Application Status: Approved");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Voter Card Application ===");

        // Get name
        System.out.print("Enter your full name: ");
        String name = sc.nextLine();

        // Get age
        int age;
        while (true) {
            System.out.print("Enter your age: ");
            age = sc.nextInt();
            if (age >= 18) {
                break;
            } else {
                System.out.println("You must be at least 18 years old to apply for a voter card.");
            }
        }

        // Get gender
        System.out.print("Enter your gender (Male/Female/Other): ");
        String gender = sc.next();

        // Get address
        System.out.print("Enter your address: ");
        String address = sc.next();

        // Create applicant object
        Applicant a = new Applicant(name, age, gender, address);

        // Display applicant details
        a.displayDetails();
        sc.close();
    }
}