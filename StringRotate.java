import java.util.*;
public class StringRotate {  
    public static boolean checkRotation(String str1, String str2) {  
        if (str1.length() != str2.length()) {  
            return false;  
        }  
        String str3 = str1 + str2;  
        if (str3.contains(str2))  
            return true;  
        else  
            return false;  
    }  
   
    public static void main(String[] args) {  
        String st1 = "Accucia"; 
        String reverseStr = "";		
		for(int i = st1.length()-1; i >= 0;i--)
			{
				reverseStr = reverseStr + st1.charAt(i);
			}
               String st2 = "aicuccA";  
               System.out.println("Checking if a string is rotation of another");  
               if (reverseStr.equals(st2)) {  
                   System.out.println("Yes " + st2 + " is rotation of " + st1);  
                } else {  
                   System.out.println("No " + st2 + " is not rotation of " + st1);  
        }  
    }  
}  