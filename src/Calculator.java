import java.util.Scanner;

public class Calculator {
    void run(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter Number a:");
            int a = sc.nextInt();
            System.out.print("Enter Number b:");
            int b = sc.nextInt();
            System.out.println("Enter Operation (+, -, *, /, %, ^) or type 'exit' to quit:");
            String op = sc.next();
            if (op.equalsIgnoreCase("exit")) {
                System.out.println("Exiting Calculator...");
                break;
            }
            switch (op) {
                case "+":
                    System.out.println("Result: " + add(a, b));
                    break;
                case "-":
                    System.out.println("Result: " + sub(a, b));
                    break;
                case "*":
                    System.out.println("Result: " + mul(a, b));
                    break;
                case "/":
                    System.out.println("Result: " + div(a, b));
                    break;
                case "%":
                    System.out.println("Result: " + mod(a, b));
                    break;
                case "^":
                    System.out.println("Result: " + pow(a, b));
                    break;
                default:
                    System.out.println("Invalid Operation!");
            }}
        }
    int add(int a,int b){
        return a+b;
    }
    int sub(int a,int b){
        return a-b;
    }
    int mul(int a,int b){
        return a*b;
    }
    int div(int a,int b){
        return a/b;
    }
    int mod(int a,int b){
        return a%b;
    }
    int pow(double a,double b){
        return (int)Math.pow(a,b);
    }
}
