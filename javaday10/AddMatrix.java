public class AddMatrix{
    public static void main(String args[]){
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{1,4,5},{14,16,1},{19,17,1}};
        int c[][]=new int[3][3];

        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                c[i][j] = (a[i][j]+b[i][j]);
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}