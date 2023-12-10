package GameMemory;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Сonsole {

    Game game = new Game();

    public void consoleInterface(int score) {
        cleaner();
        System.out.println("Постарайся запомнить эти цифры");
        System.out.println(Arrays.toString(game.getIntRandom()));

    }

    private void cleaner() {
        System.out.println("\033[H\033[2J");
    }

    private void timeout(int timeout) {
        try {
            TimeUnit.SECONDS.sleep(timeout);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
