
package commandlinecalci;
import java.util.*;

public class clc{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        float a=sc.nextFloat();
        System.out.println("Enter the operation: +,-,*,/,%");
        char b=sc.next().charAt(0);
        System.out.println("Enter the second number:");
        float c=sc.nextFloat();
        

        switch(b){
            case '+':
                float res1=a+c;
                System.out.println("Addition is:" + res1);
                break;
            case '-':
                float res2=a-c;
                System.out.println("Subtraction is:" + res2);
                break;
            case '*':
                float res3=a*c;
                System.out.println("Addition is:" + res3);
                break;
            case '/':
            float res4=a/c;
                
                System.out.println("Addition is:" + res4);
                break;
            case '%':
            float res5=a%c;

                System.out.println("Addition is:" + res5);
                break;
            default:
                System.out.println("Invalid opeartion");
        }

        sc.close();

    }

}
