// Fig. 10.9: PayrollSystemTest.java
// Employee hierarchy test program.

public class PayrollSystemTest {
    public static void main(String[] args) {
        // create subclass objects
        SalariedEmployee salariedEmployee =
            new SalariedEmployee("John", "Smith", "111-11-1111",
                new Birthday(1, 1, 2001), 800.00);
        HourlyEmployee hourlyEmployee =
            new HourlyEmployee("Karen", "Price", "222-22-2222",
                new Birthday(2, 2, 2002), 16.75, 40);
        CommissionEmployee commissionEmployee =
            new CommissionEmployee("Sue", "Jones", "333-33-3333",
                new Birthday(3, 3, 2003), 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee =
            new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444",
                new Birthday(4, 4, 2004), 5000, .04, 300);
        PieceWorker pieceWorker =
                new PieceWorker("George", "Miller", "555-55-5555",
                    new Birthday(5, 5, 2005), 500, 10);

        System.out.println("Employees processed individually:");

        System.out.printf("%n%s%n%s: $%,.2f%n%n",
            salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",
            hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",
            commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",
            basePlusCommissionEmployee,
            "earned", basePlusCommissionEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                pieceWorker, "earned", pieceWorker.earnings());

        // create five-element Employee array
        Employee[] employees = new Employee[5];

        // initialize array with Employees
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = pieceWorker;

        System.out.printf("Employees processed polymorphically:%n%n");

        // generically process each element in array employees
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee); // invokes toString

            // determine whether element is a BasePlusCommissionEmployee
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                // downcast Employee reference to
                // BaseCommissionEmployee reference
                BasePlusCommissionEmployee employee =
                    (BasePlusCommissionEmployee) currentEmployee;

                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf(
                    "new base salary with 10%% increase is: $%,.2f%n",
                    employee.getBaseSalary());
            }

            System.out.printf(
                "earned $%,.2f%n%n", currentEmployee.earnings());

            // get type name of each object in employees array
            for (int j = 0; j < employees.length; j++) {
                System.out.printf("Employee %d is a %s%n", j,
                    employees[j].getClass().getName());
            }
        }
    }
}
