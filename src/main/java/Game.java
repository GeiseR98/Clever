import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {

    Random random = new Random();

    public Boolean game(int score) {
        System.out.print("\033[H\033[2J");
        int[] intRandom = hiddenArray(score);
        System.out.println("Постарайся запомнить эти цифры");

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Arrays.toString(intRandom));
        Scanner scanner = new Scanner(System.in);
        try {
            TimeUnit.SECONDS.sleep(7);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.print("\033[H\033[2J");
        System.out.println("Введите запомненные цифры");

    int intInput = scanner.nextInt();
    int[] intInputMassiive = numberToArrayConverter(intInput);

        System.out.println(Arrays.toString(intInputMassiive));

        if(Arrays.equals(intRandom,intInputMassiive)) {
        System.out.println("ВЕРНО");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print("\033[H\033[2J");
        return true;
    } else {
        System.out.println("ОШИБКА");

        return false;
        }
    }
    private int[] numberToArrayConverter(int input) {
        int one = input / (100);
        int two = (input - one * 100) / 10;
        int three = (input - one * 100) - two * 10;
        return new int[] {one, two, three};
    }

    private int[] hiddenArray(int complexity) {
        if (complexity <= 3) {
            return new int[]{random.nextInt(3), random.nextInt(3), random.nextInt(3)};
        }
        if (complexity <= 5) {
            return new int[]{random.nextInt(5), random.nextInt(5), random.nextInt(5)};
        }
        if (complexity <= 7) {
            return new int[]{random.nextInt(7), random.nextInt(7), random.nextInt(7)};
        }
        if (complexity > 7) {
            return new int[]{random.nextInt(9), random.nextInt(9), random.nextInt(9)};
        }
        return null;
    }
}

