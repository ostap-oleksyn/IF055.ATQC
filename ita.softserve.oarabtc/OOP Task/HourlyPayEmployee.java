/**
 * Created by Olia on 26.04.2015.
 */

public class HourlyPayEmployee extends Employees {

    private double hourlyPay;

    public HourlyPayEmployee(int id, String name, String surname, double hourlyPay) {
        super(id, name, surname);
        this.hourlyPay = hourlyPay;
        printInfo();
    }

    public double hourPay;
    final double PAY_DAYS = 20.8;
    final int PAY_HOUR = 8;

    public double payCalc() {
        return hourPay = (PAY_DAYS * PAY_HOUR * hourlyPay);
    }
    //TODO use toString() instead of this and add a separate print method
    public void printInfo() {
        System.out.println("Employee: " + getName() + " " + getSurname() + " - " + payCalc() + " $");

    }
}