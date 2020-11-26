package com.acme.Uebungsbeispiel;

public class SalesStrategy implements Strategy {

    @Override
    public double calculateCommission(Employee employee) {
        return employee.sales * 10/100;
    }
}
