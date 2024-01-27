//18
import java.util.Scanner;
public class seventeenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int c=c(arr,arr[i]);
            if(c==1)
                System.out.print(arr[i]+" ");

        }
    }
    public static int c(int[] arr,int a)
    {
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==a)
                c++;
        }
        return c;
    }
}

