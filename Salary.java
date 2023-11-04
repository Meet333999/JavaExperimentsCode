import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee number:");
        int emp_no = scanner.nextInt();

        System.out.print("Enter employee name:");
        scanner.nextLine();
        String emp_name = scanner.nextLine();

        System.out.print("Enter the basic salary:");
        double bas_sal = scanner.nextDouble();

        double DA = 0.7 * bas_sal;
        double HRA = 0.3 * bas_sal;
        double CCA = 240;
        double PF = 0.1 * bas_sal;
        double prof_tax = 100;
        double gross_sal = bas_sal + DA + HRA + CCA;
        double net_sal = gross_sal - PF - prof_tax;

        System.out.println("\nEmployee number: " + emp_no);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Basic Salary: " + bas_sal);
        System.out.println("Gross salary: " + gross_sal);
        System.out.println("Net Salary: " + net_sal);

        scanner.close();
    }
}
