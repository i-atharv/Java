//sorting with second maximum and second minimum.
import java.util.Scanner;
public class sorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        int x=2;
        while(arr[n-1]==arr[n-x])
            x++;
        System.out.println(arr[n-x]);
        int y=1;
        while(arr[0]==arr[y])
            y++;
        System.out.println(arr[y]);
    }
}
