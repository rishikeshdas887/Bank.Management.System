public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Rishi", 3000, 101);

        BankAccount account2=new BankAccount("Rishi"); 
        // creating new object in memory a heap memory an calling constructor
        System.out.println(account1.accountName);
        System.out.println(account1.balance);
        System.out.println(account1.accountNumber);


        account1.deposit(1000); //calling account1 object with deposit method and depositing 1000rupees
        System.out.println(account1.balance);


        account1.withdraw(1000);

             System.out.println("WithDrawal Amt is :"+ account1.balance);


             //testing no argument constructor 
             BankAccount account3=new BankAccount();
             System.out.println(account3.accountName);
    }
}
