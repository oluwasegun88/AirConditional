package com.hierachy;

public class MainEmployee {
    public static void main(String[] args) {
//    Employee employee = new Employee("Segun","Olayemi","1988");
//        System.out.println(employee);
//    CommissionEmployee commissionEmployee = new CommissionEmployee("Segun","Olayemi",
//            "1921",23.0,0.5);
//        System.out.println(commissionEmployee);
//
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Segun","Olayemi", "1923",23.03,250.0);
        System.out.println(hourlyEmployee.toString());
    }
}
