package Code;

public class randomPickUpName {
    public static void main(String[] args) {

        int countOfNumber = 100000000;
        int numberOfYu = 0;
        int numberOfPeng = 0;
        for (int i = 0; i < countOfNumber; i++) {
            int randomN = (int) (Math.random() * 6);

            if (randomN > 2) {

                numberOfYu++;

            }
            if (randomN < 3) {

                numberOfPeng++;

            }


        }
        System.out.println("Total number of 钟瑀 is " + numberOfYu);
        System.out.println("Total number of 钟彭 is " + numberOfPeng);
    }
}
