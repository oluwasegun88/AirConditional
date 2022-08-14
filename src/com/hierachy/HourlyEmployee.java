package com.hierachy;

public class HourlyEmployee extends Employee{
    private double hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double wage) {
        super(firstName, lastName, socialSecurityNumber);
        this.hours = hours;
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours < 0 || hours > 168){
            throw new IllegalArgumentException("hours must be < 0 and > 168");
        }
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if(wage > 0.0)
        this.wage = wage;
    }

    public double earning(){
       double earning;
        earning= getWage() * getHours();
          return earning;
    }

    @Override
    public String toString() {
        return String.format("%s%nHours:%s%nWage:%s%n",super.toString(),getHours(),getWage());
    }
}
