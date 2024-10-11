package Arrays;

public class Pentachgpt {

        public static void main(String[] args) {
            final int NUMBERS_PER_LINE = 10;
            final int TOTAL_PENTAGONAL_NUMBERS = 100;

            for (int i = 1; i <= TOTAL_PENTAGONAL_NUMBERS; i++) {
                int pen = getPentagonalNumber(i);

                // Print the pentagonal number
                System.out.printf("%-6d", pen);

                // Move to the next line after printing NUMBERS_PER_LINE numbers
                if (i % NUMBERS_PER_LINE == 0) {
                    System.out.println();
                }
            }
        }

        private static int getPentagonalNumber(int n) {
            return n * (3 * n - 1) / 2;
        }
    }


