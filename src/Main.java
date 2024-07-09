public class Main {
    public static void main(String[] args) {
       // BankAccount  bankAccount = new BankAccount("01108719338700",1450,"KIPNGENO","kipngenokevin517@gmail.com","0702922235");
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.getAccountBalance());
        System.out.println(bankAccount.getCustomerName());

        bankAccount.withdrawFunds(2000);
        bankAccount.depositFunds(850);
        bankAccount.withdrawFunds(150);



        System.out.println("Account number is:"+bankAccount.getAccountNumber());
        System.out.println("Customer Phone Number is:"+bankAccount.getPhoneNumber());
        BankAccount kevinAcc = new BankAccount("Kevin",1500,"JOE","joe@gmail.com","0722187329");
        System.out.println("Account Number :"+kevinAcc.getPhoneNumber() + "Account Email : " +kevinAcc.getEmail());
    }
}