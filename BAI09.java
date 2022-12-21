import java.util.Scanner;
public class BAI09 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum =0;
        while(n%10>=1)
        {
            sum= sum+(n%10);
            n=n/10;
        }
        System.out.println("Tong = "+ sum);
        
    }
}
