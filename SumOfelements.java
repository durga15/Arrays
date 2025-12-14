import java.util.Arrays;
import java.util.Scanner;

public class SumOfelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();            
        }
        System.out.println("The array elements are: " + Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of array elements: " + sum);
       sc.close();
    }
}
