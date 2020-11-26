package com.acme.Uebungsbeispiel;

public class Main {
    public static void main(String[] args) {

        EmployeeManager em = new EmployeeManager();

        em.addEmployee(new Employee("A", 5000, 200, new ProfitStrategy()));
        em.addEmployee(new Employee("B", 2300, 100, new SalesStrategy()));
        em.addEmployee(new Employee("C", 7000, 250, new ProfitStrategy()));

        for(Employee e : em.employees) {
            em.calculateCommission(e);
        }
    }
}
