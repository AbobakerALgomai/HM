package HomeWork5;
import java.util.Scanner;
public class Q2 {
      private int limited_Num_Peop=0;
    private int counter=0;

    public void setlimit(int maximum){
        counter++;
        limited_Num_Peop=maximum;
    }
    public void click(){
        if (counter<=limited_Num_Peop)
            counter++;
        else
            counter+=0;
    }
    public int getcounter(){
        return counter;
    }

}
