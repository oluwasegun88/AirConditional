package tddClass;

public class FairTaxCalculator {

    private final double FAIR_TAX_RATE = 23.00;
    private double totalPrice = 0.00;

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double TotalPrice) {
        this.totalPrice = TotalPrice;
    }

    public double calculateTax(double price) {
        return (FAIR_TAX_RATE/100) * price;
    }

    public double TotalPrice(double price) {
        totalPrice += price;
        return totalPrice;
    }
}
