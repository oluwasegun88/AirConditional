package com.hierachy;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be >= 0.0 ");
        }
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        if (commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double earnings() {
        return commissionRate * grossSales;
    }

    @Override
    public  String toString(){
        return String.format( "%s %n%s: %s %n%s: %s", super.toString(),"commission rate", getCommissionRate(),"gross sales", getGrossSales());
    }


}
