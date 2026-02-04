import java.util.Random;
import java.util.Scanner;

public class Main{

    static Scanner sc = new Scanner(System.in);


public static void main(String[] args) {

    System.out.println("Enter bill amount: ");
    double billAmount = sc.nextDouble();
    System.out.println("Enter tax rate(%): ");
    double taxRate = sc.nextDouble();
    System.out.println("Enter tip rate(%): ");
    double tipRate = sc.nextDouble();

    double tipTotal = TipTaxCalculator.calcTip(billAmount, tipRate);
    double taxTotal = TipTaxCalculator.calcTax(billAmount, taxRate);
    double totalBill = TipTaxCalculator.getTotalBill(billAmount,tipTotal,taxTotal);

    System.out.println("Bill amount: " + billAmount);
    System.out.println("Tax amount: " + TipTaxCalculator.calcTax(billAmount, taxRate));
    System.out.println("Tip amount: " + TipTaxCalculator.calcTip(billAmount, tipRate));
    System.out.println("Total (raw): " + totalBill);

    System.out.println("Total (rounded): " + TipTaxCalculator.getRoundTotal(totalBill));

}

}