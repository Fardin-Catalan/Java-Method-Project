import java.util.Scanner;
public class main{
    static void showDots(int num,int k){
        for(int i=1;i<=num-k;i++){
            System.out.print(".");
        }
    }
    static void show_palindrome(int num){
        for(int i=1;i<=num;i++){
            System.out.print(i);
        }
        for(int j=num-1;j>=1;j--){
            System.out.print(j);
        }
    }
    static void showDiamond(int num1){
        for(int i=1;i<=num1;i++){
            showDots(num1,i);
            show_palindrome(i);
            showDots(num1,i);
            System.out.println();
        }
        for(int i=num1-1;i>=1;i--){
            showDots(num1,i);
            show_palindrome(i);
            showDots(num1,i);
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer:");
        int num1=sc.nextInt();
        showDiamond(num1);
    }
}
