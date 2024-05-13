package Code;

public class randomPickUpName {
    public static void main(String[] args) {

        int countOfNumber = 100000000;
        int numberOfName1 = 0;
        int numberOfName2 = 0;
        for (int i = 0; i < countOfNumber; i++) {
            int randomN = (int) (Math.random() * 6);

            if (randomN > 2) {

                numberOfName1++;

            }
            if (randomN < 3) {

                numberOfName2++;

            }


        }
        System.out.println("Total number of name1 is " + numberOfName1);
        System.out.println("Total number of name2 is " + numberOfName2);
    }
}
