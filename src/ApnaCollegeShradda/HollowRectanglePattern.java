package ApnaCollegeShradda;

public class HollowRectanglePattern {
    public static void main(String[] args) {
        int n=5;
        int m=5;

        //Outer loops
        for(int i=1;i<=n;i++){
            //Inner loops
            for(int j=1;j<=m;j++){
                //Cell -> (i,j)
                if(i==1 || j==1|| i==n|| j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
