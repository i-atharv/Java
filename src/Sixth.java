//8
import java.util.Scanner;
public class Sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the position from which you want to remove the element");
        int p=sc.nextInt();
        int f=0;
        for(int i=0;i<n;i++)
        {
            if(i==p)
                f=1;
            if(f==1)
                arr[i-1]=arr[i];
        }
        arr[n-1]=0;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
