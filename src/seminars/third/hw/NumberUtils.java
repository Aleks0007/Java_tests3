package seminars.third.hw;

public class NumberUtils {

    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean numberInInterval(int n) {
        return n > 25 && n < 100;
    }
}