import java.util.Scanner;
public class BAI04 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Ans = 1;
            while(n>=1)
            {
                Ans = Ans*n;
                n--;
            }
        System.out.println("N! = "+Ans);
    }
}
