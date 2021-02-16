class MyException extends Exception{
    private static final long serialVersionUID = 1L;
    MyException(String s) {
        super(s);
    }
}
public class A7Q2 {
    static void validate(String a) throws MyException{
        if(a.equals("Aditya"))
            throw new MyException("match");
        else
            System.out.println("no match");
    }   
    public static void main(String args[]){
        try {
            validate("Aditya");
            System.out.println("Since your name is not aditya yo get 18 marks in all MSTs of data structure");
        } 
        catch (Exception e) {
            System.out.println("since your name is aditya you get 14 marks in all MSTs of data structure");
        }
    }   
}
