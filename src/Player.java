public class Player {

    private int wrongGuesses;

    public Player() {
        this.wrongGuesses = 0;
    }


    public int getWrongGuesses() {
        return wrongGuesses;
    }

    public void increaseWrongGuesses() {
        wrongGuesses++;
    }

}
