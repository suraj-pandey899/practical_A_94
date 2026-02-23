public class FullPyramid {
        public static void main(String[] args) {

            int num = 1;
            for (int i = 1; i <= 5; i++) { // Rows
                for (int j = 1; j <= i; j++) { // Columns
                    System.out.print(num + " ");
                    num++;
                    // Reset number after 9
                    if (num == 10) {
                        num = 1;
                    }
                }
                System.out.println();
            }

            // 2. Inverted Half Pyramid (Stars)

            for (int i = 6; i >= 1; i--) {
                for (int j = 1; j <= i; j++) { 
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    

}
