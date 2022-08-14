package payrollSystem;

class PayableInterfaceTest {
        public static void main(String[] args) {
                Payable[] payableObjects = new Payable[7];



                        payableObjects[0] = new Invoice("1111", "chair", 4, 750.00);
                        payableObjects[1] = new Invoice("2222", "gear", 1, 856.00);
                        payableObjects[2] = new SalaryEmployee("Itunu", "Olayemi", "1988", 1000.00);
                        payableObjects[3] = new PieceWorker("Joshua", "Obar", "1989", 5.0, 40);
                        payableObjects[4] = new HourlyEmployee("Bamidele", "Ezekiel", "1990",  7.0, 4.6);
                        payableObjects[5] = new CommissionEmployee("Samuel", "Ayinla", "1991",  67.9, 0.5);
                        payableObjects[6] = new BasePlusCommissionEmployee("Samson", "Faderera", "1992",  54.7, 0.5,3);


                        System.out.println("Invoices and Employees processed polymorphically:");

                        for (Payable currentPayable : payableObjects) {
                                if(currentPayable instanceof BasePlusCommissionEmployee) {
                                        BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentPayable;
                                        employee.setBaseSalary(1.10 * employee.getBaseSalary());
                                        System.out.printf("new base salary with 10%% increase is: $%.2f%n", employee.getBaseSalary());
                                }
                                System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString(), "payment due", currentPayable.getPaymentAmount());
                        }
                }

        }
