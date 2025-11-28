import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Static conversion rates (example)
        double usdRate = 83.50;   // 1 USD = 83.50 INR
        double eurRate = 90.20;   // 1 EUR = 90.20 INR
        double gbpRate = 105.75;  // 1 GBP = 105.75 INR

        System.out.println("=== Currency Converter ===");
        System.out.println("1. INR to USD");
        System.out.println("2. INR to EUR");
        System.out.println("3. INR to GBP");
        System.out.println("4. USD to INR");
        System.out.println("5. EUR to INR");
        System.out.println("6. GBP to INR");

        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        double result = 0;

        switch (choice) {
            case 1:
                result = amount / usdRate;
                System.out.println(amount + " INR = " + result + " USD");
                break;

            case 2:
                result = amount / eurRate;
                System.out.println(amount + " INR = "
