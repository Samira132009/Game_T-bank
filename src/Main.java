import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру Виселица!");
        System.out.println("(Все слова на английском и с маленькой буквы)");
        Game game = new Game();
        game.start();

    }
}