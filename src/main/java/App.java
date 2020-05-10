package Calculator;
import java.util.Scanner; 

//Version 1.0.0

public class App {
    public static void main(String []args) {
        double result1,result2,result3,result4;
        int x;
        Scanner sc= new Scanner(System.in);
        System.out.println("**************** Calculator ****************\n");
        System.out.println("              Select a option:                  "); 
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("********************************************\n"); 
        System.out.print("Enter a option: ");
        x = sc.nextInt();
        System.out.print("\n");

        if(x == 1){
            System.out.print("Enter the first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter the second number: ");
            double b = sc.nextDouble();
            result1 = a + b;
            System.out.println("Result: "+result1);
            //System.out.println("Not yet built, what for next version.");
        }

        else if(x == 2){
            // System.out.print("Enter the first number: ");
            // double c = sc.nextDouble();
            // System.out.print("Enter the second number: ");
            // double d = sc.nextDouble();
            // result2 = c - d;
            // System.out.println("Result: "+result2);
            System.out.println("Not yet built, what for next version.");
        }

        else if(x == 3){
            // System.out.print("Enter the first number: ");
            // double e = sc.nextDouble();
            // System.out.print("Enter the second number: ");
            // double f = sc.nextDouble();
            // result3 = e * f;
            // System.out.println("Result: "+result3);
            System.out.println("Not yet built, what for next version.");
        }

        else if(x == 4){
            // System.out.print("Enter the first number: ");
            // double g = sc.nextDouble();
            // System.out.print("Enter the second number: ");
            // double h = sc.nextDouble();
            // result4 = g / h;
            // System.out.println("Result: "+result4);
            System.out.println("Not yet built, what for next version.");
        }

        else{
            System.out.println("Wrong input!");
        }

        System.out.println("********************************************\n");
    }    
}
