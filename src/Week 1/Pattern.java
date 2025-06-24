public class Pattern {
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
//        lowerTriangle(5);
//        upperTriangle(5);
          triangle(5);
    }
}
