import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter the pizza price: ");
        double price = scan.nextDouble();

        System.out.print("Enter the tax rate: ");
        double taxRate = scan.nextDouble();


        double tax = price * taxRate;
        double total = price + tax;


        System.out.printf("Pizza price: $%.2f | Tax: $%.2f | Final price: $%.2f\n",
                price, tax, total);

        scan.close();
    }
}


