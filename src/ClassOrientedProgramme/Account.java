 package ClassOrientedProgramme;

public class Account {
    private String number;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;


    public Account(String number, double balance, String name, String email, String phoneNumber) {
        System.out.println("Account");
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(){
    }



    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of" + depositAmount + "mode.New balance is" + this.balance);
    }

    public void withdrawal(double withdrawalAmount){
       if(balance-withdrawalAmount <=0){
           System.out.println("Only" + this.balance + "available.withdrawal not processed");
       }   else{
           balance-=withdrawalAmount;
           System.out.println("withdrawal of" + withdrawalAmount + "processed.Remaining balance = " + this.balance);
       }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
