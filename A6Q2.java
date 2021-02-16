class parent{
    int x;
    String name;
    parent(){
        x=10;
        name="Parent";
    }
    void show(){
        System.out.println("Parent class show!");
    }
    void parentMethod(){
        System.out.println("My classname is : "+this.name+" my value is : "+this.x);
    }
}
class child extends parent{
    int y;
    String surname;
    child(){
        y=20;
        surname="Child";
    }
    void show(){
        System.out.println("Child class !how");
    }
    void childMethod(){
        System.out.println("My classname is : "+this.surname+" my value is : "+this.y);
        System.out.println("Calling parent class method using super ");
        super.parentMethod();
    }
}
public class A6Q2{
    public static void main(String args[]){
        child c = new child();
        c.show();
        c.childMethod();
    }
}