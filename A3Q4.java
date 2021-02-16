public class A3Q4 {
    public static void main(String args[]){
        int count=0;
        System.out.println("Displaying unique three digit numbers using 1,2,3,4 : ");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                for(int k=1;k<=4;k++){
                    if(k!=i && k!=j && i!=j){
                        count++;
                        System.out.println(count+".) "+i+""+j+""+k);
                    }
                }
            }
        }
        System.out.println("Total number of unique numbers is : "+count);
    }
}
