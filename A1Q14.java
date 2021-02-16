public class A1Q14 {
    public static void main(String args[]){
        float average;
        int sum=0;
        if(args.length==0){
            System.out.println("No arguments passed");
        }
        else{
            for(String i:args){
                sum+=Integer.parseInt(i);
            }
            average=(float)sum/args.length;
            System.out.println("Average of arguments is : "+average);
        }
    }
    
}
