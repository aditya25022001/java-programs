class Parent{
    void show(){
        System.out.println("Parent class show!");
    }
    void parentMethod(String name){
        System.out.println("My classname is : "+name);
    }
    void parentMethod(String name, int value){
        System.out.println("My classname is : "+name+" and value is "+value);
    }
}
class Child extends Parent{
    void show(){
        System.out.println("Child class show");
    }
    void childMethod(String name){
        System.out.println("My classname is : "+name);
    }
    void childMethod(String name, int value){
        System.out.println("My classname is : "+name+" and value is "+value);
    }
}
public class A6Q5{
    public static void main(String args[]){
        Parent p = new Parent();
        System.out.println("Overloading in parent :");
        p.parentMethod("Parent");
        p.parentMethod("Parent", 10);
        Parent q = new Child();
        Child r = new Child();
        System.out.println("Overloading in child :");
        r.childMethod("Child");
        r.childMethod("Child", 20);
        System.out.println("Overriding : ");
        System.out.println("parent ref and parent const");
        p.show();
        System.out.println("parent ref and child const");
        q.show();
        System.out.println("child ref and child const");
        r.show();

    }
}
