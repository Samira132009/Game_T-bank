import java.util.Random;

public class Word {
    private String[] dictionary = {"cat", "dog", "coffee",
            "chocolate", "driver", "phone",
            "flower", "java", "blossom", "star"};
    private String guessedWord;

    public Word() {
        Random random = new Random();
        this.guessedWord = dictionary[random.nextInt(dictionary.length)];
    }

    public String getGuessedWord() {
        return guessedWord;
    }

}
