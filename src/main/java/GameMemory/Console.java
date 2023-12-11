package GameMemory;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Console {

    Game game = new Game();

    public void play() {
        cleaner();
        System.out.println("Постарайся запомнить эти цифры");
        timeout(1);

        System.out.println(Arrays.toString(game.setAnArray()));
        timeout(7);
        cleaner();
        System.out.println("Введите запомненные цифры");
        game.setIntInputMassiive(game.numberToArrayConverter(input()));
        if (game.comparison()) {
            game.increasingTheScore();
            System.out.println("Верно");
            System.out.println("Ваш счет: " + game.getScore());
            play();
        } else {
            System.out.println("Ошибка");
            System.out.println("Ваш счет: " + game.getScore());
        }
        cleaner();

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

    private int input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
