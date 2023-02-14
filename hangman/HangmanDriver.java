package hangman;
import java.io.Console;


public class HangmanDriver {
    
    public static void main(String[] args) {

    Console keyboardConsole = System.console();
    String inputStr;
    inputStr = keyboardConsole.readLine("What is your name? ");
    System.out.println("Welcome " + inputStr + "!");

        
    }
}
