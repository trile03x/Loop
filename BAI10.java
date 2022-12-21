import java.util.Scanner;
public class BAI10 {
    static int daonguoc(int n)
    {
        int sum = 0;
        while(n>0)
        {
            sum = sum*10 + n%10;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n>=100&&n<=999&&n>0)
        {
            System.out.println(daonguoc(n));
        }
        else
        {
            System.out.println("N/A");
        }
    }
}
