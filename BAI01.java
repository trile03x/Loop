import java.util.Scanner;
public class BAI01 {
    public static void main ( String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int x =1;
        while(n<=m&&n!=0)
        { 
            for(int i =1;i<=n;i++)
            {
                System.out.print(x+" ");
            }
            System.out.println("");
            x++;
            n--;
        }
    }
}
