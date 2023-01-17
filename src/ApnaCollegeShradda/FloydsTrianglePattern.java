package ApnaCollegeShradda;

public class FloydsTrianglePattern {
    public static void main(String[] args) {
        int n=5;
        int number=1;
        //Outer Loops
        for(int i=1; i<=n; i++){
            //Inner loops
            for(int j=1; j<=i; j++){
                System.out.print(number+ " ");
                number++; //number=number+1
            }
            System.out.println();
        }
    }
}
