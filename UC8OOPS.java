import java.util.HashMap;
import java.util.Map;

public class UC8OOPS{

  
    private static Map<Character, String[]> characterPatterns = new HashMap<>();

    public static void main(String[] args) {

        
        initializePatterns();

        
        renderBanner("OOPS");
    }

    
    private static void initializePatterns() {

        characterPatterns.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        characterPatterns.put('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        });

        characterPatterns.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });
    }

    
    private static void renderBanner(String word) {

        word = word.toUpperCase();

        int patternHeight = 5; 

        for (int row = 0; row < patternHeight; row++) {

            for (int i = 0; i < word.length(); i++) {

                char currentChar = word.charAt(i);

                String[] pattern = characterPatterns.get(currentChar);

                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                } else {
                    System.out.print("       ");
                }
            }

            System.out.println();
        }
    }
}