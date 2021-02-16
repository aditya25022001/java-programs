import java.util.Scanner;
public class A2Q6 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the other string (name) : ");
        String s2 = scan.nextLine();
        A2Q6 a = new A2Q6();
        a.concatenate(s2);
    }
    void concatenate(String s){
        String main = "Hello";
        System.out.println("given string : "+main);
        for(int i=0;i<s.length();i++){
            main = main + s.charAt(i);
        }
        System.out.println("Displaying concatenated string : "+ main);
    }
}
