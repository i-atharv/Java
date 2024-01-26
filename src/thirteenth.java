//14
import java.util.Scanner;
public class thirteenth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        int n1=sc.nextInt();
        int [] arr1=new int[n1];
        for (int i=0;i<n1;i++)
            arr1[i]=sc.nextInt();
        int[] temp=new int[n+n1];
        int c=0;
        for(int i=0;i<n;i++)
        {
            temp[c]=arr[i];
            c++;
        }
        for(int i=0;i<n1;i++)
        {
            temp[c]=arr1[i];
            c++;
        }
        for(int i=0;i<c;i++)
        {
            for(int j=i+1;j<c;j++)
            {
                if(temp[i]>temp[j])
                {
                    int k=temp[i];
                    temp[i]=temp[j];
                    temp[j]=k;
                }
            }
        }
        for(int i=0;i<c;i++)
            System.out.print(temp[i]+" ");
    }
}
