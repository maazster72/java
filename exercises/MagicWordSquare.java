package exercises;

import java.util.Scanner;

public class MagicWordSquare {
    public static void printRow(String[] wordSqaure, int row) {
        System.out.println(wordSqaure[row]);
    }

    public static void printColumn(String[] wordSquare, int col) {
        String word = "";
        for (int i = 0; i < wordSquare.length; i++) {
            word += wordSquare[i].charAt(col - 1);
        }
        System.out.println(word);
    }

    public static void printDiagonal(String[] wordSquare, boolean b) {
        String word = "";
        if (b) {
            for (int i = 0; i < wordSquare.length; i++) {
                word += wordSquare[i].charAt(i);
            }
        } else {
            for (int i = wordSquare.length - 1, j = 0; i >= 0; i--, j++) {
                word += wordSquare[j].charAt(i);
            }
        }
        System.out.println(word);
    }

    public static String[] createWordSquare(int size) {
        try (Scanner input = new Scanner(System.in)) {
            String[] wordSquare = new String[size];
            for (int i = 0; i < size; i++) {
                System.out.println("Enter next word: ");
                wordSquare[i] = input.nextLine();
            }
            return wordSquare;
        }
    }

    public static void wordsRepeated(String[] wordsquare) {
        
    }

    public static void main(String[] args) {
        String[] stepTwoSquare = new String[4];
        stepTwoSquare[0] = "LIMB";
        stepTwoSquare[1] = "AREA";
        stepTwoSquare[2] = "CORK";
        stepTwoSquare[3] = "KNEE";

        String[] stepFourSquare = new String[3];
        stepFourSquare[0] = "TOO";
        stepFourSquare[1] = "URN";
        stepFourSquare[2] = "BEE";

        String[] stepFiveSquare = new String[4];
        stepFiveSquare[0] = "BARN";
        stepFiveSquare[1] = "AREA";
        stepFiveSquare[2] = "LIAR";
        stepFiveSquare[3] = "LADY";

        String[] wordSqaure = createWordSquare(8);

        printRow(wordSqaure, 2);
        printColumn(wordSqaure, 2);
        printDiagonal(wordSqaure, false);

    }
}
