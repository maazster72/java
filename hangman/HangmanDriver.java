package hangman;

import java.io.Console;

public class HangmanDriver {

    public static void main(String[] args) {

        Console keyboardConsole = System.console();
        Hangman game = new Hangman();
        String inputStr = keyboardConsole.readLine("Player name: ");
        game.setPlayerName(inputStr);
        System.out.println("Welcome " + game.getPlayerName() + "!");

    }
}
