class Shapes{
    double getArea(String shape, double ... dimensions){
        switch (shape){
            case "square":
                return dimensions[0]*dimensions[0];
            case "circle":
                return Math.PI*dimensions[0]*dimensions[0];
            case "cube":
                return 6*dimensions[0]*dimensions[0]*dimensions[0];
            case "sphere":
                return 4*Math.PI*dimensions[0]*dimensions[0];
            default : 
                return 1.0;
        }
    }
    double getVolume(String shape, double ... dimensions){
        switch (shape){
            case "square":
                return 0.0;
            case "circle":
                return 0.0;
            case "cube":
                return dimensions[0]*dimensions[0]*dimensions[0]*1.0;
            case "sphere":
                return 4*Math.PI*dimensions[0]*dimensions[0]*dimensions[0]/3;
            default : 
                return 1.0;
        }
    }
}
class calculate extends Shapes{
    void area(){
        int x=1;
        while(x<=4){
            switch (x){
                case 1:
                    System.out.println("Area of square : "+getArea("square", 5));
                    ++x;
                    break;
                case 2:
                    System.out.println("Area of circle : "+getArea("circle", 5));
                    ++x;
                    break;
                case 3:
                    System.out.println("Area of cube : "+getArea("cube", 5));
                    ++x;
                    break;
                case 4:
                    System.out.println("Area of sphere : "+getArea("sphere", 5));
                    ++x;
                    break;
            }
        }
    }   
    void volume(){
        int x=1;
        while(x<=4){
            switch (x){
                case 1:
                    System.out.println("Volume of square : "+getVolume("square", 5));
                    ++x;
                    break;
                case 2:
                    System.out.println("Volume of circle : "+getVolume("circle", 5));
                    ++x;
                    break;
                case 3:
                    System.out.println("Volume of cube : "+getVolume("cube", 5));
                    ++x;
                    break;
                case 4:
                    System.out.println("Volume of sphere : "+getVolume("sphere", 5));
                    ++x;
                    break;
            }
        }
    } 
}
public class A6Q4 {
    public static void main(String args[]){
        calculate a = new calculate();
        a.area();
        a.volume(); 
    }    
}
