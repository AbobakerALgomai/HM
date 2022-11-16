package HomeWork6;
public class Q1 {
     private double balance=1000;
    private double rate;
    private int year=1;

    public Q1(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }
    public int getYear() {
        while (balance<=1000000){
            double interest=balance*rate/100;
            balance+=interest;
            year++;
        }
        return year;
    }
}
