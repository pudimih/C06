package aula05.ProjBanco;

public class Account {
    public double balance;
    public double limit;
    public int agency;
    public int accountNumber;
    public String name;

    //metodos
    public void deposit(double value){
        this.balance = this.balance + value;
    }

    public void withdraw(double value){
        this.balance -= value;
    }

    public void tranfer(Account destinationAccount, double value){
        this.balance -= value;
        destinationAccount.balance += value;
    }
}
