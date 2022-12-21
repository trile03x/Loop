import java.util.Scanner;
public class BAI08 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n : ");
        int n = sc.nextInt();
        long sum1 = 0;
        long mul =1;
        int value =1;
        int count =1;
        while(value<=n){
            while(count<=value)
            {
                mul = mul *count;
                count ++;
            }
            sum1 = sum1 +mul;
            value++;
        }
        System.out.println("P  = 1!+ 2!+ 3!+… + "+n+"! = "+ sum1);
        long sum2=0;
        int value2 =1;
        while(value2<=n){
            sum2=(long) (sum2+Math.pow(value2,2));
            value2++;
        }
        System.out.println("S1= 1^2 + 2^2 +…+ "+n+"^2 = "+ sum2);
        double sum3=0;
        double value3= 2;
        while(value3<=n)
        {
            sum3= sum3+(value3-1)/value3;
            value3++;
        }
        System.out.println("S2= 1/2+ 2/3+ …+ ("+n+"-1)/"+n +" = "+sum3);
        long sum4=1;
        double value4=1;
        while(value4<=n)
        {
            sum4=(long) (sum4+Math.pow(2, 2*value4-1));
            value4++;
        }
        System.out.println("S3= 1+ 2+ 2^3 +…+ 2^(2*"+n+"-1) = "+sum4);
    }
}
