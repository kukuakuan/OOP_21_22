import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryManagement {
    private Dictionary dict = new Dictionary();
    Scanner sc = new Scanner(System.in);

    ArrayList<Word> wordlist = new ArrayList<>();
    DictionaryManagement(){}

    public void insertFromCommandline() {
        int numberOfWord= sc.nextInt();
        Scanner input = new Scanner(System.in);
        for(int i=0;i<numberOfWord;i++) {
            String newWord = input.nextLine();
            String newExplain = input.nextLine();
            Word word = new Word(newWord, newExplain);
//            dict.addWord(word);
        }
    }
}
