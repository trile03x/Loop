import java.util.Scanner;
public class BAI11 {
    public static int check(int n )
    {
        if(n==2){
            return 1;
        }
        else{
           for (int i = 2; i < n; i++) 
           {
              if (n % i == 0) {
              return 0;
              }
              else
              {
                return 1;
              }
           }
        }
        return 0;
    }
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int m =  sc.nextInt();
        System.out.print(m+" = ");
        for(int i =2;i<=m;i++)
        {
            int Ans = check(i);
            while(Ans==1&&m%i==0)
            {
                System.out.print(i+" *");
                m=m/i;
            }
        }
        
    }
}