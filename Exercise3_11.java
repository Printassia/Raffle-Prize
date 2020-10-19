package CH03;

/*
You have three identical prizes to give away and a pool of 30 finalists.
The finalists are assigned numbers from 1 to 30. Write a program to
randomly select the numbers of three finalists to receive a prize.
Make sure not to pick the same number twice.
For example, picking finalists 3, 15, 29 would be valid but picking 3, 3, 31
would be invalid because finalist number 3 is listed twice and 31 is not a valid
finalist number.
 */

import java.util.Random;

public class Exercise3_11 {
    public static void main(String[] args) {

        int finalist1 = 0, finalist2 = 0, finalist3 = 0;
        Random random = new Random();

        for (int count = 1; count <= 3; count++){

            finalist1 = random.nextInt(30) + 1;
            finalist2 = random.nextInt(30) + 1;
            finalist3 = random.nextInt(30) + 1;

            if (finalist1 == finalist2 || finalist1 == finalist3
                    || finalist2 == finalist3) {
                System.out.println("Matching Numbers, roll again please");
                System.exit(0);
            }
        }

        System.out.println("Prize 1 Finalist: " + finalist1);
        System.out.println("Prize 2 Finalist: " + finalist2);
        System.out.println("Prize 3 Finalist: " + finalist3);

    }
}
