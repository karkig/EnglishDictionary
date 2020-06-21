import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class DictionaryApp {
    public static TreeSet<String> tree = new TreeSet<String>();

    public static void main(String[] args) throws Exception {
        EnglishDictionary dictionary = new EnglishDictionary();

        boolean hasTrue = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (hasTrue) {
            clearConsole();
            System.out.println("\n\n\n\n *********  Welcome to Paypal Dictionary ************* \n (1) ==> Add word into dictionary \n (2) ==> Delete word from dictionary \n (3) ==> Replace word from dictionary. \n (4) ==> Type word to search .\n (0) Close dictionary  \n");
            System.out.print("Enter your choice here ==>  ");
            switch (br.readLine()) {
                case "1":
                    System.out.print("Enter word ==> ");
                    dictionary.addWord(br.readLine());
                    break;
                case "2":
                    System.out.print("Enter word ==> ");
                    dictionary.deleteWord(br.readLine());
                    break;
                case "3":
                    System.out.print("Enter word you want to edit ==> ");
                    String oldWord = br.readLine();
                    System.out.print("Enter new word ==> ");
                    String newWord = br.readLine();
                    dictionary.updateWord(oldWord, newWord);
                    break;
                case "4":
                    System.out.print("Enter word ==> ");
                    dictionary.search(br.readLine());
                    break;
                case "0":
                    hasTrue = false;
                    break;
                default:
                    System.out.println("Enter the correct choice.");

            }
        }
    }

    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

