public class A4Q4 {
    
}
class ParameterPass{
    public static void main(String[] args) {
        int i = 0;
        addTwo(i++);
        System.out.println(i);
    }
    static void addTwo(int i) {
        i += 2;
    }
}
    