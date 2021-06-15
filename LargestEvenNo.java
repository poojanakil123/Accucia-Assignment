

import java.util.*;
public class LargestEvenNo{
	
	public void even(){
		int[] arr = {1,10,3, 5, 2, 8, 20, 25, 16};
		int max = arr[0];
		
		for (int i=0;i<arr.length; i++){
			if(arr[i]%2==0 && arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println(max);

	}
public static void main(String[] args){
	LargestEvenNo rt = new LargestEvenNo();
	rt.even();
	
}
}














/*package array;

import java.util.*;
public class maxofoddeven 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int size,i,even=1,odd=0;
        System.out.println("enter size::");
        size=s.nextInt();
        int a[]=new int[size];
        System.out.println("enter array elements..");
        for(i=0;i<size;i++)
        {
            a[i]=s.nextInt();
        }
         for(i=0;i<size;i++)
        {
            if(a[i]%2==0)
            {
               if(even==1)
               {
                   even=a[i];
               }
               if(even<a[i])
                {
                   even=a[i];
                }
            }
            else
            {
                if(a[i]%2!=0)
                {
                    if(odd==0)
                    {
                        odd=a[i];
                    }
                
                   if(odd<a[i])
                   {
                       odd=a[i];
                   }
                }          
            }
        
        }
         System.out.println("max of even is::"+even);  
         System.out.println("max of odd is::"+odd);
    }     
         
    }
	*/