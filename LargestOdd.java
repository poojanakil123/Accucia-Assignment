import java.util.*;
public class LargestOdd{
	
	public void odd(){
		int[] arr = {1,10,3,5,2,8,20,15,16};
		int max = arr[0];
		
		for (int i=0;i<arr.length; i++){
			if(arr[i] % 2 !=0 && arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println(max);

	}
public static void main(String[] args){
	LargestOdd rt = new LargestOdd();
	rt.odd();
	
}
}