//9
import java.util.Scanner;
public class seventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for(int i=0;i<n/2;i++) {
            int x=arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n-1-i]=x;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
