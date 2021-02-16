public class A4Q2 {
    
}
class calltest{
    public static void main (String a[]){
        String s=new String("English");
        fun(s);
        System.out.println(s);
    }
    static String fun(String s){
        System.out.println(s);
        s="Hindi";
        System.out.println(s);
        return s;
    }
}
class intc{
    int x;
} 
class reftest{
    public static void main (String a[]){
        intc o=new intc();
        fun(o);
        System.out.println(o.x);
    }
    static void fun(intc s){
        System.out.println(s.x);
        s.x=10;
        System.out.println(s);
    }
}
        