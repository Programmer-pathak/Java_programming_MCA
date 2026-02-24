import java.util.Scanner;
public class electric_bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units consumed:- ");
        int unitsConsumed = sc.nextInt();
        double billAmount = calculateElectricBill(unitsConsumed);
        System.out.println("Total Electric Bill for " + unitsConsumed + " units: $" + billAmount);
    }

    public static double calculateElectricBill(int units) {
        double bill = 0;

        if (units <= 100) {
            bill = units * 0.5;
        } else if (units <= 200) {
            bill = (100 * 0.5) + ((units - 100) * 0.75);
        } else if (units <= 300) {
            bill = (100 * 0.5) + (100 * 0.75) + ((units - 200) * 2.75);
        } else {
            bill = (100 * 0.5) + (100 * 0.75) + (100 * 2.75) + ((units - 300) * 3.12);
        }

        bill += 50;

        return bill;
    }
}
