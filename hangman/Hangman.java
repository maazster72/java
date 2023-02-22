import java.util.Arrays;

public class Hangman {
    private String playerName;
    String wordToGuess;
    final int MAX_INCORRECT_GUESSES = 10;
    char[] guesses = new char[MAX_INCORRECT_GUESSES];

    Hangman() {
        
    }

    Hangman(String name) {
        this.playerName = name;
    }

    public String getCurrentState() {
        String currentState = "";
        char[] charsInWord = this.getWord().toCharArray();
        for (char c : charsInWord) {
            if (Arrays.asList(guesses).contains(c)) {
                currentState += c;
            } else {
                currentState += "_";
            }
        }
        return currentState;
    }

    public char[] getGuesses() {
        return guesses;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public int getRemainingGuesses() {
        int non_empty_elements = 0;
        for (int i = 0; i < guesses.length; i++ ) {
            if(Arrays.asList(this.getWord().toCharArray()).contains(guesses[i])) {
                non_empty_elements++;
            }
        }
        return MAX_INCORRECT_GUESSES - non_empty_elements;
    }

    public void setPlayerName(String newName) {
        this.playerName = newName;
    }

    public String getWord() {
        return this.wordToGuess;
    }

    public void setWord(String word) {
        this.wordToGuess = word;
    }

    public boolean tryChar(char c) {
        boolean inWord = false;
        char[] charsInWord = this.getWord().toCharArray();
        if(Arrays.asList(guesses).contains(c) == false) {
            for (int i = 0; i < guesses.length; i++) {
                if(guesses[i] == 0) {
                    guesses[i] = c;
                    break;
                }
            }
        }
        for (int i = 0; i < charsInWord.length; i++) {
            if(charsInWord[i] == c) {
                inWord = true;
                break;
            }
        }
        return inWord;
    }

}
