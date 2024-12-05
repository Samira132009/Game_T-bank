import java.util.Scanner;

public class Game {

    private Word word;


    private Player player;
    private char[] currentWord;
    private boolean[] foundLetters;

    public Game() {
        this.word = new Word();
        this.player = new Player();
        this.currentWord = word.getGuessedWord().toCharArray();
        this.foundLetters = new boolean[currentWord.length];
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        GameDisplay display = new GameDisplay();

        System.out.println("Осталось попыток 6 из 6");
        while (player.getWrongGuesses() < 6 && !isWordGuessed()) {
            display.displayWordMask(word.getGuessedWord(), foundLetters);
            System.out.print("Введите букву или 'exit' для выхода: ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Вы сдались! Загаданное слово было: " + word.getGuessedWord());
                return;
            }

            boolean found;

            if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
                char guess = input.charAt(0);
                found = false;

                for (int i = 0; i < currentWord.length; i++) {
                    if (currentWord[i] == guess) {
                        foundLetters[i] = true;
                        found = true;
                    }
                }

                if (!found) {
                    player.increaseWrongGuesses();
                    System.out.println("Неправильно! Осталось попыток: " + (6 - player.getWrongGuesses()) + " из 6");
                }
                if (found) {
                    System.out.println("Правильно, продолжайте в том же духе!");
                }
                } else {
                System.out.println("Пожалуйста, введите одну бкуву");
                }
        }

        if (isWordGuessed()) {
            System.out.println("Поздравляем! Вы угадали слово: " + word.getGuessedWord());
        } else {
            System.out.println("Вы проиграли! Загаданное слово было: " + word.getGuessedWord());
        }
    }



    private boolean isWordGuessed() {
        for (boolean found : foundLetters) {
            if (!found) {
                return false;
            }
        }
        return true;
    }

}