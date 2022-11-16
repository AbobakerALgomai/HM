package HomeWork5;
public class Q6 {
     private double balance;
    public Q6()
    {balance=0;}
    public Q6(double initBalance)
    {balance=initBalance;}
    public void addInterst(){

        balance=balance+balance*0.1;
    }
    public void deposit(double amount){

        balance=(balance+amount);
    }
    public void withdraw(double amount) {

        balance=balance-amount;
    }
    public double getBalance(){return balance;}

}
