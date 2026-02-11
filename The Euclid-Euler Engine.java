import java.util.Scanner;
public class main{
    static boolean isPrime(int num){
        boolean prime_found=true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                prime_found=false;
                break;
            }
        }
        return prime_found;
    }
    static boolean isPerfect(int num){
        boolean perfect_found=false;
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            perfect_found=true;
        }
        return perfect_found;
    }
    static void special_sum(int num1){
        int sum1=0;
        for(int i=2;i<=num1;i++){
            if(isPrime(i)){
                sum1+=i;
            }
            if(isPerfect(i)){
                sum1+=i;
            }
        }
        System.out.println(sum1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer:");
        int num1=sc.nextInt();
        special_sum(num1);
    }
}
