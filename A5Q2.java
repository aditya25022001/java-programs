import java.util.Scanner;
public class A5Q2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String sentence = scan.nextLine();
        int index=0;
        String toReverse="";
        String finalString="";
        while(index<sentence.length()){
            if(sentence.charAt(index)!=' ')
                toReverse+=sentence.charAt(index);
            else{
                for(int i=toReverse.length()-1;i>=0;--i){
                    finalString+=toReverse.charAt(i);
                }
                toReverse="";
                finalString+=" ";
            }
            index++;
        }
        for(int i=toReverse.length()-1;i>=0;--i){
            finalString+=toReverse.charAt(i);
        }
        System.out.println("Reversed string : "+finalString);
        scan.close();
    }    
}
