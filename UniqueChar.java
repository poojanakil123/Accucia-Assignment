import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniqueChar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string");
    String s1 = sc.nextLine();
    getvalues(s1);
  }

  public static void getvalues(String s1) {
    String s2 = s1.toLowerCase();
    StringBuffer sb = new StringBuffer(s2);
    int l = sb.length();
    int count = 0;
    for (int i = 0; i < l; i++) {
      count = 0;
      for (int j = i + 1; j < l; j++) {
        if (sb.charAt(i) == sb.charAt(j)) {
          sb.deleteCharAt(j);
          count++;
          j--;
          l--;

        }
      }
      if (count > 0) {
        sb.deleteCharAt(i);
        i--;
        l--;
      }
    }
    if (sb.length() == 0) {
      System.out.println(-1);
    } else
      System.out.println("Number of unique characters are "+sb.length());
  }
}