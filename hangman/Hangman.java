package hangman;

public class Hangman {
    private String playerName;

    Hangman(String name) {
        this.playerName = name;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public void setPlayerName(String newName) {
        this.playerName = newName;
    }
    
}
