public class BankAccount {
    // this clas represent a customer's bank account 
String accountName;
double balance;
 int accountNumber;

//every account belongs to the same bank so banname can be static

static String bankName="ABS";



//Constructor A
BankAccount(){
    this("Rishi", 3000,101);//this calls another constructor of same class , and it must be the first statement
}

//object's birthsetup-> constructor
BankAccount(String name,double balance, int accNumber){//this are objects

    this.accountName=name;
    this.balance=balance;
    this.accountNumber=accNumber;
}
BankAccount(String name){
    this.accountName=name;
}

//deposit method

void deposit(double amount){
 balance=balance+amount;
}

//making a withdraw method 
void withdraw(double amount){
    balance=balance-amount;
}

}


