public class InvertedHalfPyramid {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) { 

            for (int space = 1; space <= 5 - i; space++) {
                System.out.print(" ");
            }

            // Print stars
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Right-Aligned Alphabet Decreasing Pattern

        for (int i = 5; i >= 1; i--) { 

            for (int space = 1; space <= 5 - i; space++) {
                System.out.print(" ");
            }

            char ch = 'A';

            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }

            System.out.println();
        }
    }

}
