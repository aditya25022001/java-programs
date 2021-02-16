import java.util.Scanner;
class matrix{
    int m,n;
    int mat1[][], mat2[][];
    void setSize(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of matrices(enter once other will be same) : ");
        System.out.println("row and coloumn : ");
        m = scan.nextInt();
        n = scan.nextInt();
        mat1 = new int[m][n];
        mat2 = new int[m][n];
    }
    void setMatrix(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first matrix ");
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                mat1[i][j]=scan.nextInt();
            }
        }
        System.out.println("enter second matrix ");
        for(int i=0;i<mat2.length;i++){
            for(int j=0;j<mat2[i].length;j++){
                mat2[i][j]=scan.nextInt();
            }
        }
    }
    void sum(){
        int sum[][] = new int[mat1.length][mat1[0].length];
        for(int i=0;i<mat1.length;i++)
            for(int j=0;j<mat1[0].length;j++)
                sum[i][j]=mat1[i][j]+mat2[i][j]; 
        System.out.println("Displaying the sum of matrix : ");
        for (int []i : sum){
            for (int j :i )
                System.out.print(j+" ");
            System.out.println("");
        }
    }
}
public class A2Q15{
    public static void main(String args[]){
        matrix m = new matrix();
        m.setSize();
        m.setMatrix();
        m.sum();       
    }
}