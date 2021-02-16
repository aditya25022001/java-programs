import java.util.Scanner;
class numPattern{
    private int base;
    int getBase(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre the base width : ");
        base = scan.nextInt();
        return base;
    }
    void printPattern(int b){
        System.out.println("Printing the pattern : ");
        for(int i=1;i<=base;i++){
            for(int j=base;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
public class A2Q7 {
    public static void main(String args[]){
        numPattern n = new numPattern();
        int base = n.getBase();
        n.printPattern(base);
    }
}
