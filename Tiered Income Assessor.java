import java.util.Scanner;
public class main{
    static double calcTax(int age,int salary){
        double tax=0.0;
        if(age>=18){
            if(salary<10000){
                tax=0.0;
            }
            else if(salary>=10000 && salary<=20000){
                tax=salary*7/100;
            }
            else{
                tax=salary*14/100;
            }
        }
        return tax;
    }
    static void calcYearlyTax(int age1){
        double total_tax=0.0;
        Scanner sc1=new Scanner(System.in);
        for(int i=1;i<=12;i++){
            System.out.print("Enter the salary of month "+i+":");
            int salary1=sc1.nextInt();
            System.out.println("Month "+i+" tax:"+calcTax(age1,salary1));
            total_tax+=calcTax(age1,salary1);
        }
        System.out.println("Total Yearly Tax: "+total_tax);
    }
       public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
           System.out.print("Enter your age:");
           int age1=sc.nextInt();
           calcYearlyTax(age1);
       }
}
