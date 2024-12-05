public class GameDisplay {

    public void displayWordMask(String word, boolean[] foundLetters) {
        System.out.print("Слово: ");
        for (int i = 0; i < word.length(); i++) {
            if (foundLetters[i]) {
                System.out.print(word.charAt(i));
            } else {
                System.out.print("_");
            }
        }
        System.out.println();
    }


}
