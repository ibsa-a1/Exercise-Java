
//Random number Generation
import java.util.Random;

public class Rand {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int x = r.nextInt(10, 30);
            System.out.println(x);
        }
    }
}
