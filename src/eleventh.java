//12
import java.util.Scanner;
public class eleventh {
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

        int l= Math.min(n,n1);
        int [] temp=new int[l];
        int c=0;

        for (int i=0;i<l;i++)
        {
            if (n<n1) {
                for(int j=0;j<n1;j++)
                {
                    if(x(temp,arr1[j])) {
                        if (arr[i] == arr1[j]) {
                            temp[c] = arr[i];
                            c++;
                        }
                    }
                }
            }
            else
            {
                for(int j=0;j<n;j++)
                {
                    if(x(temp,arr[j])) {
                        if (arr1[i] == arr[j]) {
                            temp[c] = arr[j];
                            c++;
                        }
                    }
                }
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
