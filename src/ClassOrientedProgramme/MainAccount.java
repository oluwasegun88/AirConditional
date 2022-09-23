package ClassOrientedProgramme;

public class MainAccount {
    public static void main(String[] args) {

        Account segunsAccount = new Account("1234",0.0,"Segun","ty@gmail.com","08028091950");
        System.out.println(segunsAccount.getNumber());
        System.out.println(segunsAccount.getBalance());
        
        segunsAccount.withdrawal(100.0);


        segunsAccount.deposit(50.0);
        segunsAccount.withdrawal(100.0);

        segunsAccount.deposit(51.0);
        segunsAccount.withdrawal(100.0);

    }
}