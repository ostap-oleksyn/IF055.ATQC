/*
* Copyright (C) 2015 TaskOOP Project by Ihor Dynka
 */

package idyntc.task_oop;

import java.math.BigDecimal;

/**
 * initialized perHourSalary employee and calculates their salary
 */
public class PerHourSalaryEmployee extends Employee {

    private double DAYS_QUANTITY = 20.8;
    private int HOURS_QUANTITY = 8;
    private double perHourSalary;


    public PerHourSalaryEmployee(int id, String name, String surname,double hourlyRate) {
        super(id, name, surname);
        this.perHourSalary = hourlyRate;
        //TODO not used
        hourlyRate = getSalary();
    }

    /**
     * this method calculates the salary of per hour salary employees and rounds it
     *
     * @return salary for these employees
     */
    @Override
    public double getSalary() {
        if (perHourSalary <= 0) {
            System.out.println("Error input for per hourly salary employees");
        }

        return BigDecimal.valueOf(DAYS_QUANTITY * HOURS_QUANTITY * perHourSalary).setScale(2, BigDecimal.ROUND_HALF_DOWN).
                doubleValue();
    }
}
