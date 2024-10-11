package AllNum;

public class Asum {
    public static void main(String[] args) {
        int sum = 0;
        // Create a Java program to calculate the sum of elements in an integer array.
        int a[] = {1, 23, 5, 9, 6, 8, 5};
        int b[] = {1, 8, 6, 9};

        // Ensure both arrays have the same length
        int minLength = Math.min(a.length, b.length);

        // Calculate the sum of corresponding elements
        for (int i = 0; i < minLength; i++) {
            sum += a[i] + b[i];
        }

        System.out.println(sum);
    }
}