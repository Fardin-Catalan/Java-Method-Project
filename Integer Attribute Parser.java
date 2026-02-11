import java.util.Scanner;
public class main{
    static void evenChecker(int num1){
        if(num1%2==0){
            System.out.println("Even!!");
        }
        else{
            System.out.println("Odd!!");
        }
    }
    static boolean isEven(int num1){
        return num1%2==0;
    }
    static boolean isPos(int num1){
        return num1>0;
    }
    static void sequence(int num2){
        if(isPos(num2)){
            for(int i=0;i<=num2;i++){
                if(isEven(i)){
                    System.out.print(i+" ");
                }
            }
        }
           else{
               for(int i=num2;i>0;i--){
                   if(isEven(i)){
                       System.out.print(i+" ");
                   }
               }
           }
           }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.print("Enter an integer:");
        int num2=sc.nextInt();
        evenChecker(num2);
        System.out.println(isEven(num2));
        System.out.println(isPos(num2));
        sequence(num2);
    }
}
