package HomeWork6;
public class Q2 {
    private  int num1;
    private  int num2;
    private int sumEven=0,sumOod=0;
    public Q2(){}
    public Q2(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(int num1,int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    @SuppressWarnings("empty-statement")
    public int getSumEven(){
        for (int i = num1; i <=num2 ;i++ ) {
            if (i%2==0){
                // sumEven=0;
                sumEven+=i;
            };
                }
        return sumEven;
    }
    @SuppressWarnings("empty-statement")
    public int getSumOod(){
        for (int i = num1; i <=num2 ;i++ ) {
            if (i%2==1){
                sumOod+=i;
            };
        }
        return sumOod;
    } 
}
