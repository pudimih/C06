package aula05.ProjBanco;

public class Main {
    public static void main(String[] args){
        Account account = new Account();

        account.balance = 700;
        account.accountNumber = 1234;
        account.agency = 1;
        account.limit = 400;

        account.deposit(600);

        System.out.println("in your account you have " + account.balance);

        account.withdraw(400);
    }
}
