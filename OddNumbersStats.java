public class OddNumbersStats {
        public static void main(String[] args) {

        System.out.println("=========== SET-A (1 to 100) ===========");

        int minA = 999;
        int maxA = 0;
        int sumA = 0;

        System.out.println("Odd Numbers between 1 to 100:");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {

                System.out.print(i + " ");
                sumA += i;

                if (i < minA) {
                    minA = i;
                }

                if (i > maxA) {
                    maxA = i;
                }
            }
        }

        System.out.println("\nMinimum Odd Number: " + minA);
        System.out.println("Maximum Odd Number: " + maxA);
        System.out.println("Total Sum of Odd Numbers: " + sumA);

        // Odd numbers between 1 to 50 and determine:

        System.out.println("\n=========== SET-B (1 to 50) ===========");

        int sumB = 0;
        int countB = 0;

        System.out.println("Odd Numbers between 1 to 50:");

        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sumB += i;
                countB++;
            }
        }

        int sumMinThree = 1 + 3 + 5;

        int sumMaxThree = 45 + 47 + 49;

        double average = (double) sumB / countB;

        System.out.println("\nTotal of First Three Minimum Odd Numbers: " + sumMinThree);
        System.out.println("Total of Last Three Maximum Odd Numbers: " + sumMaxThree);
        System.out.println("Average of Odd Numbers: " + average);
    }
}


