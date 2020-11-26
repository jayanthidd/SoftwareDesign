package com.acme.Uebungsbeispiel;

public class ProfitStrategy implements Strategy {
    @Override
    public double calculateCommission(Employee employee) {
       return employee.profit * 10/100;
    }
}
