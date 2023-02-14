package hangman;

public class Hangman {
    private String playerName;
    String wordToGuess;

    Hangman() {
        
    }

    Hangman(String name) {
        this.playerName = name;
    }

    public String getPlayerName() {
        return this.playerName;
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

}
