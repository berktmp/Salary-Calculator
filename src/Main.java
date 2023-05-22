import java.util.Scanner;

// Salary Calculation
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Employee e1 = new Employee("Zeyneb", 5000, 45, 1990);

        e1.tax();           // Calculate tax for the employee
        e1.bonus();         // Calculate bonus for the employee
        e1.raiseSalary();   // Calculate salary increase for the employee
        e1.printInfo();     // Print employee information

    }
}
