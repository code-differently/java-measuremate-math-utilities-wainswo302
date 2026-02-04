public class TipTaxCalculator {
    static double amountBilled;
    static double tax;
    static double tipRate;
    static double tipTotal;
    static double totalBill;
    static double roundedTotal;
    static double calculatedTax;


    public static double calcTax(double billAmount, double tax) {
        calculatedTax = billAmount * (tax/100);
        return calculatedTax;
    }
    public static double calcTip(double billAmount, double tipRate) {
        tipTotal = billAmount * (tipRate/100);
        return tipTotal;
    }
    public static double getTotalBill(double tipTotal, double calculatedTax, double amountBilled){
        totalBill = tipTotal + calculatedTax + amountBilled;
        return totalBill;
    }
    public static double getRoundTotal(double totalBill) {
        roundedTotal = Math.round(totalBill);
        return roundedTotal;
    }
}