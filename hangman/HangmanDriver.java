import java.io.Console;

public class HangmanDriver {

    public static void main(String[] args) {

        Console keyboardConsole = System.console();
        Hangman game = new Hangman();
        String inputStr = keyboardConsole.readLine("Player name: ");
        game.setPlayerName(inputStr);
        System.out.println("Welcome " + game.getPlayerName() + "!");
        HangmanDictionary dictionary = new HangmanDictionary();
        game.setWord(dictionary.getWord());
        do {
          String userGuess = keyboardConsole.readLine("Guess a letter: ");
          game.tryChar(userGuess.charAt(0));
          System.out.println(game.getCurrentState()+", you have "+game.getRemainingGuesses()+" guesses remaining");
        } while (game.getRemainingGuesses() != 0 || game.getCurrentState() != game.getWord());
        System.out.println("The game word is " + game.getWord());

    }
}
