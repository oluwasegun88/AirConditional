package payrollSystem;

public class PayableRollSystemTest {

        public static void main(String[] args) {
            SalaryEmployee salariedEmployee = new SalaryEmployee(
                    "Segun", "Olayemi", "1993", 500.00);
            HourlyEmployee hourlyEmployee = new HourlyEmployee(
                    "Lanre", "Peter", "1994", 7.00, 30);
            CommissionEmployee commissionEmployee = new CommissionEmployee(
                    "Chibuzo", "Roland", "1995", 10000, .07);
            BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(
                    "Omolara", "John", "1996", 4500, .05, 400);
            PieceWorker pieceWorker = new PieceWorker("Bade", "Ogunji", "1997", 5.00, 40);

            System.out.println("Employees processed individually:");

            System.out.printf("%n%s%n%s: $%.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
            System.out.printf("%s%n%s: $%.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());
            System.out.printf("%s%n%s: $%.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());
            System.out.printf("%s%n%s: $%.2f%n%n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());
            System.out.printf("%s%n%s: $%.2f%n%n", pieceWorker, "earned", pieceWorker.earnings());

            Employee[] employees = new Employee[5];

            employees[0] = salariedEmployee;
            employees[1] = hourlyEmployee;
            employees[2] = commissionEmployee;
            employees[3] = basePlusCommissionEmployee;
            employees[4] = pieceWorker;


            System.out.printf("Employees processed polymorphically:%n%n");

            for (Employee currentEmployee : employees) {
                System.out.println(currentEmployee);

                if (currentEmployee instanceof BasePlusCommissionEmployee) {
                    BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                    employee.setBaseSalary(1.10 * employee.getBaseSalary());
                    System.out.printf("new base salary with 10%% increase is: $%.2f%n", employee.getBaseSalary());
                    // System.out.printf("earned $%.2f%n%n", currentEmployee.earnings());
                }

//            for (int i = 0; i < employees.length; i++)
//                System.out.printf("Employee %d is a %s%n", i,
//                        employees[i].getClass());
            }


        }
    }

