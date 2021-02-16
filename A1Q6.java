import java.util.Properties;
public class A1Q6{
    public static void main(String args[]){
        Properties prop = System.getProperties();
        System.out.println("Java Version : " + prop.getProperty("java.version") );
        System.out.println("Java Runtime Version : " + Runtime.version());
        System.out.println("Java Home : " + prop.getProperty("java.home") );
        System.out.println("Java Vendor : " + prop.getProperty("java.vendor") );
        System.out.println("Java Vendor URL : " + prop.getProperty("java.vendor.url") );
        System.out.println("Java class path : " + prop.getProperty("java.class.path") );
    }
}
