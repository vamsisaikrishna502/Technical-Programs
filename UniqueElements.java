import java.util.*;
class UniqueElements
  {
    public static void main(String args[] )
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array ");
      int n=sc.nextInt();
      int arr[]=new int[n];  
      int count;
      System.out.println("Enter the array Elements");
      
       for(int i=0;i<n;i++)
         {
          
          arr[i]=sc.nextInt();
         }
     
     System.out.println("Unique Elements are");
        for(int i=0;i<n;i++)
         {
           count=0;
           for(int j=0;j<n;j++)
           {
             if(arr[i]==arr[j])
               count++;
             }
                if(count==1)
                   
           System.out.println(arr[i]+" ");
           }
          
             
     }
    
     
    }
  