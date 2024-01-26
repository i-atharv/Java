//10-b
import java.util.Scanner;
public class ninth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println("Enter the position from which you want to rotate the array in right ");
        int y = sc.nextInt();
        for(int i=0;i<y;i++)
        {
            int l,j;
            l=arr[n-1];
            for(j=n-1;j>0;j--)
                arr[j]=arr[j-1];
            arr[0]=l;
        }
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
