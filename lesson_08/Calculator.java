package lesson_08;

import java.util.Scanner;

public class Calculator {
    int firstArgument;
    int secondArgument;
    char operators;

    int getAdd(int firstArgument,int secondArgument){
         int sum = firstArgument + secondArgument;
         return sum;
    }
    double getDivide(double firstArgument,double secondArgument){
        double sum = firstArgument / secondArgument;
        return sum;
    }

    int getMultiply(int firstArgument,int secondArgument){
        int sum = firstArgument * secondArgument;
        return sum;
    }

    int getSubtraction(int firstArgument,int secondArgument){
        int sum = firstArgument - secondArgument;
        return sum;
    }
    public static void main(String[] args) {

        System.out.print("Enter first argument : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter second argument : ");
        int b = sc.nextInt();
        System.out.print("Enter the operators : ");
        char c = sc.next().charAt(0);


        Calculator calculator = new Calculator();

        if(c == '+'){
            int d = calculator.getAdd(a,b);
            System.out.println("Total : " + d);
        }
        else if (c == '/'){
            double e = calculator.getDivide(a,b);
            System.out.println("Total : " + e);
        }
        else if (c == '*')
        {
            int f = calculator.getMultiply(a,b);
            System.out.println("Total : " + f);
        }
        else if(c == '-'){
            int g = calculator.getSubtraction(a,b);
            System.out.println("Total : " + g);
        }

    }
}
