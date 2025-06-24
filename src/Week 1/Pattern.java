import java.util.Scanner;

public class Pattern {
    static boolean palimdrom(int n){
        if(n<10){
            return true;
        }
        int a=n;
        int b=0;
        while(n>0){
            b=b*10+n%10;
            n/=10;
        }
        return a==b;
    }
    static void lowerTriangle(int n){
        for (int i = 0; i <n; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("x");
            }
            System.out.println();
        }
    }

    static void upperTriangle(int n){
        for (int i = n; i >0; i--){
            for(int j=0;j<i;j++){
                System.out.print("x");
            }
            System.out.println();
        }
    }

    static void triangle(int n){
        for (int i=0;i<n;i++) {
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        lowerTriangle(5);
        System.out.println("");
        upperTriangle(5);
        System.out.println("");
        triangle(5);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to check palindrom for Int");
        int n = sc.nextInt();
        System.out.println("Checking palidrom for enterned value "+palimdrom(n));
    }
}
