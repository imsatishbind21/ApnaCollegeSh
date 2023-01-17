package ApnaCollegeShradda;

public class InvertedHalfPyramidPattern {
    public static void main(String[] args) {
        int n=4;
        //Outer Lopps
        for(int i=n; i>=1;i--){
            //Inner Loops
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
                System.out.println();
        }
    }
}
