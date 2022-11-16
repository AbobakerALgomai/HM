package HomeWork5;
public class Q3 {
    private double balance;
public Q3()
    {balance=0;}
    public Q3(double initBalance)
    {balance=initBalance;}
    public void deposit(double amount){
        balance=balance+amount;
    }
    public void withdraw(double amount) {

        balance=balance-amount;
    }
    public double getBalance(){return balance;}

}
