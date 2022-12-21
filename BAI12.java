import java.util.Scanner;
public class BAI12 {
    static int UCLN(int a, int b)
    {
        if(a==0||b==0)
        {
            return a+b;
        }
        while(a!=b)
        {
            if(a>b)
            {
                a= a -b;
            }
            else
            {
                b = b - a;
            }
         }
        return a;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a va b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Highest Common Factor of "+a+" & "+b+" = "+UCLN(a,b));
        System.out.println("Least Common Multiple of "+a+" & "+b+" = "+(a*b)/UCLN(a,b));
    }
}
