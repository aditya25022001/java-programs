class os{
    void performance(){
        System.out.println("os class show!");
    }
}
class windows extends os{
    void performance(){
        System.out.println("windows class show");
    }
}
public class A6Q8 {
    public static void main(String args[]){
        os p = new os();
        os q = new windows();
        windows r = new windows();
        System.out.println("os ref and os const");
        p.performance();
        System.out.println("os ref and windows const");
        q.performance();
        System.out.println("windows ref and windows const");
        r.performance();
    }
}
