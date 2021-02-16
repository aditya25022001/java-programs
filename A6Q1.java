class Area{
    double area(double ... dimensions){
        int arguments = dimensions.length;
        switch (arguments){
            case 1:
                return Math.PI*dimensions[0]*dimensions[0];
            case 2:
                double are=1.0;
                for(double a:dimensions){
                    are*=a;
                }
                return are;
            default :
                return 0.0;
        }
    }
}
class Volume extends Area{
    double volume(double ... dimensions){
        int arguments = dimensions.length;
        switch (arguments){
            case 2:
                return dimensions[1]*area(dimensions[0]);
            case 3:
                return dimensions[2]*area(dimensions[0], dimensions[1]);
            default :
                return 0.0;
        }
    }
}
public class A6Q1{
    public static void main(String args[]){
        Volume v = new Volume();
        System.out.println("Using volume property by volume class");
        System.out.println("");
        System.out.println("volume of cylinder with r=2 and h=3 :  "+v.volume(2,3));
        System.out.println("");
        System.out.println("volume of cube edge=6 : "+v.volume(6,6,6));
        System.out.println("");
        System.out.println("volume of cuboid with l=3 b=4 h=5 : "+v.volume(3,4,5));
        System.out.println("");
        System.out.println("Using area property by volume class");
        System.out.println("");
        System.out.println("Area of circle with r=5 : "+v.area(5));
        System.out.println("");
        System.out.println("Area of quadilateral with l=5 b=6 : "+v.area(5,6));
    }
}