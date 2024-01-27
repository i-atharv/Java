//20
import java.util.Scanner;
public class nineteenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int l=n-1;
        int f=0;
        for (int i=0;i<n;i++)
        {
            if(arr[i]!=arr[l])
            {
                f=1;
                break;
            }
            l--;
        }
        if(f==0)
            System.out.println("Its Symmetric Array");
        else
            System.out.println("Not A Symmetric Array");
    }
}
