import java.util.Scanner;

public class fourteenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] temp=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(x(temp,arr[i]))
            {
                temp[c]=arr[i];
                c++;
            }
        }
        for(int i=0;i<c;i++)
        {
            System.out.println("Frequency of "+temp[i]+" is  "+c(arr,temp[i]));
        }
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
