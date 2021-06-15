class NoOfUniqueChar
{
     
         static int countDistinct(int arr[], int n)
         {
         int res = 1;
 
 
         for (int i = 1; i < n; i++)
         {
           int j = 0;
           for (j = 0; j < i; j++)
             if (arr[i] == arr[j])
                break;
 
       
               if (i == j)
               res++;
         }
           return res;
  }
 

public static void main(String[] args)
{
    int arr[] = { 1,2,1,4,1,2,10 };
    int n = arr.length;
    System.out.println(countDistinct(arr, n));
}
}