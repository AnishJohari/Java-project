import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Exchange rates (as of today you can update them manually)
        double usdToInr = 83.2;   // 1 USD = 83.2 INR
        double eurToInr = 89.5;   // 1 EUR = 89.5 INR
        double gbpToInr = 104.3;  // 1 GBP = 104.3 INR

        while (true) {
            System.out.println("\n===== Currency Converter =====");
            System.out.println("1. USD to INR");
            System.out.println("2. INR to USD");
            System.out.println("3. EUR to INR");
            System.out.println("4. INR to EUR");
            System.out.println("5. GBP to INR");
            System.out.println("6. INR to GBP");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            
            int choice = sc.nextInt();

            if (choice == 7) {
                System.out.println("Exiting... Thank you!");
                break;
            }

            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();
            double result = 0.0;

            switch (choice) {
                case 1:
                    result = amount * usdToInr;
                    System.out.println(amount + " USD = " + result + " INR");
                    break;
                case 2:
                    result = amount / usdToInr;
                    System.out.println(amount + " INR = " + result + " USD");
                    break;
                case 3:
                    result = amount * eurToInr;
                    System.out.println(amount + " EUR = " + result + " INR");
                    break;
                case 4:
                    result = amount / eurToInr;
                    System.out.println(amount + " INR = " + result + " EUR");
                    break;
                case 5:
                    result = amount * gbpToInr;
                    System.out.println(amount + " GBP = " + result + " INR");
                    break;
                case 6:
                    result = amount / gbpToInr;
                    System.out.println(amount + " INR = " + result + " GBP");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        sc.close();
    }
}
