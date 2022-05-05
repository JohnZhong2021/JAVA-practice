import java.util.Random;
public class randomNumber {
    public void generateRandomint(int n) {
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int r1 = r.nextInt(20) + 1;
            System.out.println(r1);
        }
    }

    public static void main(String[] args) {
        randomNumber rn = new randomNumber();
        rn.generateRandomint(10);
        System.out.println("Hi. JAVA");

    }
}
