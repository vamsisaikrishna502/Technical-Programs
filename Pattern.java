/* JFM1T4_Assignment4:
   Write a program to print the following pattern:
     1 
     01 
     101 
     0101 
     10101 
*/

public class Pattern {
     
//Add main method here
public static void main(String args[])
{
    int  n=5;
    for(int i=0;i<n;i++)
    {
        for (int j=0;j<=i;j++)
        {
            if((i+j)%2==0)
            {
                System.out.print(1);
            }
            else
            {
                System.out.print(0);
            }
            
        }
        System.out.println();
    }
    
}

//Declare variable n and initialize value as 5

//Check whether the i and j are equal or not using for loop

//If i and j are equal check (i+j)%2==0 or not if zero then print one else print zero


}