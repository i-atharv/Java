//16
import java.util.Scanner;
public class fifteenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int n1=sc.nextInt();
        int [] sub=new int[n1];
        for (int i=0;i<n1;i++)
            sub[i]=sc.nextInt();
        int c=0;
        for(int i=0;i<n1;i++)
        {
            if(x(arr,sub[i]))
                c++;
        }
        if(c==n1)
            System.out.println("Yes Its A Subset");
        else
            System.out.println("No Its Not A Subset");
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
        return f == 1;
    }
}
