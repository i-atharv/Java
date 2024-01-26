//13
import java.util.Scanner;
public class twelth {
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
        int [] temp=new int[n+n1];
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(x(temp,arr[i])){
                temp[c]=arr[i];
                c++;
            }
        }
        for(int i=0;i<n1;i++)
        {
            if(x(temp,arr1[i])){
                temp[c]=arr1[i];
                c++;
            }
        }
        for (int i=0;i<c;i++)
            System.out.print(temp[i]+" ");

    }
    public static boolean x(int[] arr,int a)
    {
        int f=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==a){
                f=1;
                break;
            }
        }
        return f != 1;
    }
}
