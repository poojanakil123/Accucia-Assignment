public class ReverseString{

	public static void main(String[] args){

	String str = "Accucia Software";
	
	String[] myData = str.split(" ");
	String result = "";
		for (String s: myData) 
		{
			String reverseStr = "";
			for(int i = s.length()-1; i >= 0;i--)
			{
				reverseStr = reverseStr + s.charAt(i);
			}
			result = result+" "+reverseStr; 
		}
		
		System.out.println("Reverse String:"+result);
	}
}

