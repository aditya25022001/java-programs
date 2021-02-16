import java.util.Scanner;
class pattern{
    Scanner scan = new Scanner(System.in);
    private int size;
    int getBase(){
        System.out.println("enter the base size (odd number): ");
        size = scan.nextInt();
        if(size%2!=0){
            return size;
        }
        else{
           return getBase();
        }
    }
    void printPattern(int base){
        System.out.println("printing the pattern : ");
        int space = base-1;
        String stars = "";
        String spaceP= "";
        for(int i=1;i<=2*base-1;i++){
            if(i<=base){
                for(int j=1;j<=space;j++)
                    spaceP=spaceP+" ";
                for(int k=1;k<=i;k++)
                   stars=stars+"* ";
                System.out.println(spaceP+stars);
                space--;
                spaceP="";
                stars="";
            }
            else{
                if(space<0)
                    space=1;
                stars="";
                spaceP="";
                for(int j=1;j<=space;j++)
                    spaceP=spaceP+" ";
                for(int k=2*base-i;k>=1;k--)
                    stars=stars+"* ";
                System.out.println(spaceP+stars);
                space++;
                spaceP="";
                stars="";
            }
        }
    }
}
public class A2Q8{
    public static void main(String args[]){
        int base;
        pattern p = new pattern();
        base = p.getBase();
        p.printPattern(base);
    }
}