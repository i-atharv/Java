//10-a
import java.util.Scanner;
public class eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        System.out.print("Enter the position from which you want to rotate the array in left ");
        int x= sc.nextInt();
        for (int i=0;i<x;i++)
        {
            int f,j;
            f=arr[0];
            for(j=0;j<n-1;j++)
                arr[j]=arr[j+1];
            arr[j]=f;
        }
        for (int i = 0; i < n; i++)
            System.out.print(arr[i]+" ");

    }
}
