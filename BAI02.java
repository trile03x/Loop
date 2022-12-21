import java.util.Scanner;
public class BAI02 {
    public static void main ( String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 1;
        while(m<=n&&n!=0)
        { 
            for(int i =m;i>=1;i--)
            {
                System.out.print(i+" ");
            }
            System.out.println("");
            m++;
        }
    }
}
