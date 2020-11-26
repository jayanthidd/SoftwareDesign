package com.acme.Uebungsbeispiel;

public class Employee {
    private String name;
    protected double sales;
    protected double profit;
    protected Strategy strategy;

    public Employee(String name, double sales, double profit, Strategy strategy) {
        this.name = name;
        this.sales = sales;
        this.profit = profit;
        this.strategy = strategy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }
}
