package ApnaCollegeShradda;

public class HalfPyramidPattern5 {
    public static void main(String[] args) {
        int n=4;

        //Outer Loops
        for(int i=1; i<=4;i++){
            //Inner Loops -> space print
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //inner Loops -> star print
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
