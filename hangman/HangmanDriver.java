package hangman;

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
        System.out.println("The game word is " + game.getWord());

    }
}
