import java.util.Scanner;
public class A3Q10 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two strings : ");
        System.out.println("first string : ");
        String s1 = scan.nextLine();
        System.out.println("second string : ");
        String s2 = scan.nextLine();
        String s3="";
        if(s1.length()!=0 && s2.length()!=0){
            s3+=s1.charAt(0);
            s3+=s2.charAt(s2.length()-1);
        }
        if(s1.length()==0 && s2.length()!=0){
            s3+='#';
            s3+=s2.charAt(s2.length()-1);
        }
        if(s1.length()!=0 && s2.length()==0){
            s3+=s1.charAt(0);
            s3+='#';
        }
        if(s1.length()==0 && s2.length()==0)
            s3+="##";
        System.out.println("Third string is : "+s3);
    }    
}
