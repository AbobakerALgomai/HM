package HomeWork6;
import java.util.Scanner;
public class Q4 {
     public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    System.out.println("Enter the word : ");
    String word;
    word=in.next();
    for (int i = word.length(); i >-1 ; i--) {
        System.out.println(word.charAt(i));

    }
}

}
