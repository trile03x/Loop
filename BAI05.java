import java.util.Scanner;
public class BAI05 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Ans = 1;
        if(n%2==0)
        {
           for(int i =1;i<=n;i++)
           {
               if(i%2==0){
                   Ans =Ans * i;
               }
           }
        }
        else{
            for(int i =1;i<=n;i++)
           {
               if(i%2!=0){
                   Ans =Ans * i;
               }
           }  
        }
        System.out.println("n!! = "+ Ans);
    }
}
