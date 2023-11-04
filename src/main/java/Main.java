public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        int score = 0;
        while (true) {
            if (game.game(score)) {
                score++;
            } else {
                System.out.println("Ваш счёт : " + score);
                break;
            }
        }
    }
}

