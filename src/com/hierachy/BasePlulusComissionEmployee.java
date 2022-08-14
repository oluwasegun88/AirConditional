package com.hierachy;

public class BasePlulusComissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlulusComissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baeSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baeSalary;
    }

}
