import java.util.*;
class Sample {
    static {
     System.out.println("**This is STATIC BLOCK.");
    }
    public Sample() {
    System.out.println("##This is CONSTRUCTOR.");
    }
	
    public void showMessage() {
    System.out.println("Hello World.");
    }
   }
   
    public class StaticAndConstructor {
    public static void main(String s[]) {
    Sample S1 = new Sample(); Sample 
    S2 = new Sample(); Sample S3 =
    new Sample();
    S1.showMessage();
    S2.showMessage();
    S3.showMessage();
    }
}