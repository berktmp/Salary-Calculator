/*
Class Attributes:
name: Name and surname of the employee
salary: Salary of the employee
workHours: Weekly working hours of the employee
hireYear: Year when the employee started working
*/
public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    double bonus;
    double tax;
    double raiseSalary;

    // Employee(name, salary, workHours, hireYear): Constructor method that takes 4 parameters.
    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    /*
    Calculates the bonus amount if the employee worked more than 40 hours per week.
    The bonus amount will be 30 TL per hour for each extra hour worked.
    */
    void calculateBonus() {
        if (this.workHours > 40) {
            this.bonus = (this.workHours - 40) * 30;
        } else {
            this.bonus = 0;
        }
    }

    /*
    Calculates the tax applied to the salary.
    If the employee's salary is less than 1000 TL, no tax will be applied.
    If the employee's salary is greater than 1000 TL, a tax of 3% of the salary will be applied.
    */
    void calculateTax() {
        if (this.salary > 0 && this.salary < 1000) {
            this.tax = this.salary * 0;
        } else {
            this.tax = this.salary * 0.03;
        }
    }

    /*
    Calculates the salary increase based on the employee's hire year. The current year is assumed to be 2021.
    If the employee has been working for less than 10 years, a 5% raise will be applied to their salary.
    If the employee has been working for more than 9 years and less than 20 years, a 10% raise will be applied.
    If the employee has been working for more than 19 years, a 15% raise will be applied.
    */
    void calculateRaiseSalary() {
        if (2021 - this.hireYear < 10) {
            this.raiseSalary = this.salary * 0.05;
        } else if (2021 - this.hireYear < 20) {
            this.raiseSalary = this.salary * 0.10;
        } else {
            this.raiseSalary = this.salary * 0.15;
        }
    }

    // toString(): Prints the employee's information to the screen.
    void printInfo() {
        System.out.println("--------------------------------");
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hours: " + this.workHours);
        System.out.println("Hire Year: " + this.hireYear);
        System.out.println("Tax: " + this.tax);
        System.out.println("Bonus: " + this.bonus);
        System.out.println("Salary Increase: " + this.raiseSalary);
        System.out.println("Salary with Tax and Bonus: " + (this.salary + this.bonus - this.tax));
        System.out.println("Total Salary: " + (this.salary + this.bonus + this.raiseSalary - this.tax));
    }
}
