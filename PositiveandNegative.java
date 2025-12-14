import java.util.Arrays;
import java.util.Scanner;

public class PositiveandNegative{
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
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max =arr[i];
            } 
        }
        System.out.println("Maximum Number is: " + max);
        sc.close();
    }
}
