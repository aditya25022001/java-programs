public class A7Q4{
    static void demo(){
        try {
            throw new NullPointerException();
        } 
        catch (NullPointerException e) {
            System.out.println("caught "+e);
            System.out.println("caught first time");
            throw new ArithmeticException();
        }
    }
    public static void main(String args[]){
        try{
            demo();
        }
        catch(ArithmeticException e){
            System.out.println("caught "+e);
            System.out.println("caught second time");
        }
    }
}