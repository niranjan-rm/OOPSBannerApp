public class UC7OOPS{
    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
        public char getCharacter() {
            return character;
        }
        public String[] getPattern() {
            return pattern;
        }
    }
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] patterns) {
        for (CharacterPatternMap pattern : patterns) {
            if (pattern.getCharacter() == ch) {
                return pattern.getPattern();
            }
        }
        return new String[7]; // return empty if not found
    }

    public static void printBanner(String word, CharacterPatternMap[] patterns) {

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                String[] charPattern = getCharacterPattern(word.charAt(i), patterns);
                line.append(charPattern[row]).append("  ");
            }

            System.out.println(line);
        }
    }
    public static void main(String[] args) {

       
        String[] oPattern = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        
        String[] pPattern = {
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };

       
        String[] sPattern = {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };

        
        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', oPattern),
                new CharacterPatternMap('P', pPattern),
                new CharacterPatternMap('S', sPattern)
        };

        
        printBanner("OOPS", patterns);
    }
}