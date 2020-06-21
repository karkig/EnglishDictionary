import java.util.ArrayList;
import java.util.TreeSet;

public class EnglishDictionary {
    private static final TreeSet DICTIONARY = new TreeSet();

    public void addWord(String word) {
        DICTIONARY.add(word);
    }

    public void deleteWord(String word) {
        DICTIONARY.remove(word);
    }

    public void updateWord(String oldWord, String newWord) {
        if (DICTIONARY.contains(oldWord)) {
            DICTIONARY.remove(oldWord);
            addWord(newWord);
        }
    }

    public void search(String word) {
        ArrayList<String> wordList = new ArrayList<>();
        for (Object o : DICTIONARY) {
            String s = (String) o;
            if (s.startsWith(word)) {
                wordList.add(s);
            }
        }

        System.out.println(wordList);
    }

}
