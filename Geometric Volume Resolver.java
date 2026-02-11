import java.util.Scanner;
public class main{
    static double circleArea(double num1){
        return 3.1416*(num1/2)*(num1/2);
    }
    static double sphereVolume(double num1){
        return (4*3.1416*(num1/2)*(num1/2)*(num1/2))/3;
    }
    static boolean circleFound(String str){
        return str.equals("circle") || str.equals("Circle");
    }
    static boolean sphereFound(String str){
        return str.equals("sphere")|| str.equals("Sphere");
    }
    static void findSpace(int num2,String str2){
        if(circleFound(str2)){
            System.out.println(circleArea(num2));
        }
        else if(sphereFound(str2)){
            System.out.println(sphereVolume(num2));
        }
        else{
            System.out.println("Wrong Parameter");
        }
    }
         public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the diameter:");
        int num2=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the object name:");
        String str2=sc.nextLine();
        findSpace(num2,str2);
         }
    }
