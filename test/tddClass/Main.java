package tddClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FairTaxException {
        FairTaxCalculator fairTaxCalculator = new FairTaxCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("number of products?");
        int numberOfProducts = scanner.nextInt();

        if(numberOfProducts < 1) throw new FairTaxException("product number cannot be" +numberOfProducts);

        for (int index = 1; index <= numberOfProducts ; index++) {
            System.out.printf("enter product %d 's name\n", index);
            String productName = scanner.next();
            System.out.printf("enter price of %s\n", productName);
            double productPrice = scanner.nextDouble();
            Product product = new Product(productName, productPrice);
            var currentTotal = fairTaxCalculator.TotalPrice(product.getPrice());

        }

        double grandTotal = fairTaxCalculator.getTotalPrice();
        double tax = fairTaxCalculator.calculateTax(grandTotal);
        System.out.printf("God go punish you, pay N%.2f now!!!", tax);

    }
}
