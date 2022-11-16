package HomeWork4;
public class Q3 {
     public static void main(String[] args) {
        String word="Mississippi",new_word;
        System.out.println("the word : "+word);
        System.out.println("______________________");
        new_word=word.replaceAll("i","!");
        System.out.println("the encrypted word : "+new_word.replace("s","$"));
        System.out.println("______________________");
        System.out.println("the expected answer is : M!$$!$$!pp!");
        System.out.println("______________________");
    }
}
