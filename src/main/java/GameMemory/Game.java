package GameMemory;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Game {

    private int score = 0;
    private int[] intRandom;
    private int[] intInputMassiive;

    public void setIntRandom(int[] intRandom) {
        this.intRandom = intRandom;
    }

    public void setIntInputMassiive(int[] intInputMassiive) {
        this.intInputMassiive = intInputMassiive;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public int[] getIntRandom() {
        return intRandom;
    }

    public int[] getIntInputMassiive() {
        return intInputMassiive;
    }

    public int[] setAnArray() {
        setIntRandom(hiddenArray(getScore()));
        return getIntRandom();
    }

    public boolean comparison() {
        if(Arrays.equals(getIntRandom(),getIntInputMassiive())) {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print("\033[H\033[2J");
            return true;
        } else {
            return false;
        }
    }

    public void increasingTheScore() {
        setScore(getScore() + 1);
    }

    public int[] numberToArrayConverter(int input) {
        int one = input / (100);
        int two = (input - one * 100) / 10;
        int three = (input - one * 100) - two * 10;
        return new int[] {one, two, three};
    }

    private int[] hiddenArray(int complexity) {
        Random random = new Random();

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

