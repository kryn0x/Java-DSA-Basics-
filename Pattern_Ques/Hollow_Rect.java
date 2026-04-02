public class Hollow_Rect {
    public static void main(String[] args) {
        int n = 5;
        int m = 4;
        //outer loop for rows
        for(int i = 1; i<=n; i++){
            // Inner loop for coloumns
            for(int j = 1; j<=m; j++){
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
