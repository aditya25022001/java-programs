class School{
    String name = "Joy Senior Secondary School";
    void show(){
        System.out.println("School name : "+name);
    }
}
class Level extends School{
    String name = "Twelfth";
    void show(){
        System.out.println("Class name : "+name);
        super.show();
    }
}
class Section extends Level{
    String name = "M1";
    void show(){
        System.out.println("Section name : "+name);
        super.show();
    }
}
class Student extends Section{
    String name = "Aditya";
    void show(){
        System.out.println("My name : "+name);
        super.show();
    }
}
public class A6Q3 {
    public static void main(String args[]){
        Student s = new Student(); 
        s.show();
    }
}
