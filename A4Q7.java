public class A4Q7{
    static int j;
    static{
        j=10;
        method1();
    }
    static void method1(){
        System.out.println("static block 1 called !"+'\n'+"value of j is : "+j);
    }
    static void method2(){
        System.out.println("static block 2 called !"+'\n'+"value of j is : "+j);
    }
    void method3(){
        System.out.println("called from main method !");
    }
    public static void main(String args[]){
        A4Q7 a = new A4Q7();
        a.method3(); 
    }
    static{
        j=30;
        method2();
    } 
}
