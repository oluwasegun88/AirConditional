package chapter18;

import chapter17.SalaryCompensationModel;

    class PayableTest {
        public static void main(String[] args) {
            Payable[] payables = new Payable[]{
                    new Invoice("1234","bucket",3,300.0),
                    new Invoice("1988","shoe", 7, 8000.0),
                    new Employee("Sodji","Adesanya","1789",new SalaryCompensationModel(5000.0)),
            };

            System.out.println("invoices are processed polymorphically");

            for (Payable objectPayable : payables){
                System.out.printf("%n%s %n payment due: $%,.2f%n", objectPayable.toString(), objectPayable.getPaymentAmount());
            }
        }

    }

