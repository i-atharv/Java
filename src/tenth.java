//11
import java.util.Scanner;
public class tenth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[i]) {
                    int x=arr[i];
                    arr[i] = arr[j];
                    arr[j]=x;
                }
            }
        }
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
