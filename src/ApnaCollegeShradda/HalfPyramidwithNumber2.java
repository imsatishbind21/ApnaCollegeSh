package ApnaCollegeShradda;

public class HalfPyramidwithNumber2 {
    public static void main(String[] args) {
        int n=5;
        //Outer Loops
        for(int i=1; i<=n;i++){
            //Inner loops
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println( );
        }

    }
}
