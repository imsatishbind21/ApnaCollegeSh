package ApnaCollegeShradda;

public class HalfPyramidPattern {
    public static void main(String[] args) {
        int n=4;
        //Outer Loops
        for(int i=1; i<=n;i++){
            //Inner Loops
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
