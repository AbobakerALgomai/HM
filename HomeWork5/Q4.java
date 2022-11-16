package HomeWork5;
public class Q4 {
    private double balance;
     public Q4()
    {balance=0;}
    public Q4(double initBalance)
    {balance=initBalance;}
    public void addInterst(double add){

        balance=balance+balance/add;
    }
    public void deposit(double amount){

        balance=(balance+amount);
    }
    public void withdraw(double amount) {

        balance=balance-amount;
    }
    public double getBalance(){return balance;}

}
