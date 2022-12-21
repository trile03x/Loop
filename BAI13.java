import java.util.Scanner;
public class BAI13 {
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
        System.out.println("Nhap a, b va c : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // ước chung lớn nhất của 3 số = ucln của 2 số nhỏ nhất trong 3 số)
        // sap xep a,b,c
        int temp; // 4 3 1
        if(a>=b)
        {
            temp = a;
            a = b;
            b = temp;   // 3 4 1
        }
        if(a>=c)
        {
            temp = a;
            a = c;
            c= temp;// 1 4 3
        }
        if(b>=c)
        {
            temp= b;
            b = c;
            c= temp; // 1 3 4
        }
        System.out.println("Highest Common Factor of "+a+" & "+b+" & "+c+" = "+UCLN(a,b));
    }
        
}
