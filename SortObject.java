import java.util.*;
public class SortObject{

	public static void main(String[] args)
	{
		requestInput();
			
	}
	
	public static void requestInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of entries:");
		int size = sc.nextInt();
		
		do
		{
			if(size ==0)
			{
				System.out.println("Size should be greater than 0");
			}
			
			addData(size);
		}
		while(size<=0);	
	}
	
	public static void addData(int size)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<User> arr = new ArrayList<User>();
		
		
		for(int i=1;i<=size;i++)
		{
			User obj = new User();
			String name ="";
			do
			{
				System.out.println("Enter Name of Person "+i);
				name = sc.nextLine();
			
				if(name.length()==0)
				{
					System.out.println("Enter valid name");
				}
				
				obj.setName(name);
			}
			while(name.length()<=0);
			
			
			String email="";
			do
			{
				System.out.println("Enter Email of Person "+i);
				email = sc.nextLine();
			
				if(email.length()==0)
				{
					System.out.println("Enter valid email");
				}
				
				obj.setEmail(email);
				
			}
			while(email.length()<=0);
			
			int age=0;
			do
			{
				System.out.println("Enter Age of Person "+i);
				age = sc.nextInt();
			
				if(age<=0)
				{
					System.out.println("Enter valid age");
				}
				
				obj.setAge(age);
				
			}
			while(age<=0);
			
			arr.add(obj);
			
		}
		
		System.out.println("Size == "+arr.size());
		Collections.sort(arr);
		 for (User str : arr) {
            System.out.println(str.toString());
        }
		
	}
	
	public static class User implements Comparable<User>{
		
		String name;
		String email;
		int age;
		
		public void setName(String nm)
		{
			this.name = nm;
		}
		
		public String getName()
		{
			return this.name;
		}
		
		public void setEmail(String em)
		{
			this.email = em;	
		}
		
		public void setAge(int ag)
		{
			this.age = ag;
		}
		
		@Override
		public String toString()
		{
			return this.name+","+this.email+","+this.age;
		}
		
		// overriding the compareTo method of Comparable class
		@Override public int compareTo(User commpare)
		{
			
			//  For Ascending order
			return this.name.compareTo(commpare.getName());
	  
			// For Descending order do like this
			// return compareage-this.studentage;
		}
	}
}
