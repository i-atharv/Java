//19
import java.util.Scanner;
public class eighteenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int p=1;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            p*=arr[i];
        }
        System.out.println(p);
    }
}
