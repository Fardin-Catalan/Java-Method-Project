import java.util.Scanner;
public class lab_08_cw_3{
    static boolean isTriangle(int a,int b,int c){
        return (a+b)>c && (b+c)>a && (a+c)>b;
}
static void triArea(int side1,int side2,int side3){
    if(isTriangle(side1,side2,side3)){
        double s=(side1+side2+side3)/2;
        double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.println(area);
    }
    else{
        System.out.println("Can't form triangle");
    }
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the length of first side:");
    int side1=sc.nextInt();
    System.out.print("Enter the length of second side:");
    int side2=sc.nextInt();
    System.out.print("Enter the length of third side:");
    int side3=sc.nextInt();
    triArea(side1,side2,side3);
}
}
