import java.util.*;
class CommonInArrays
  {
    public static void main(String args[] )
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array ");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter the array Elements");
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      int arr2[]=new int[n];
      System.out.println("Enter another array Elements");
      for(int j=0;j<n;j++)
        {
          arr2[j]=sc.nextInt();
        
        }
      System.out.println("Common elements in both arrys are :");
       for(int i=0;i<n;i++)
        {
          for(int j=0;j<n;j++){
          if(arr[i]==arr2[j])
           System.out.println(arr2[j]); 
        }
        }  
    }
  }