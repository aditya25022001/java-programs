public class A7Q3 {
    public static void main(String arsg[]){
        int z;
        try{
            z=10/0;
        }
        catch(Exception e){
            System.out.println("caught" + e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println("caught" + e.getMessage());
        }
    }
}
