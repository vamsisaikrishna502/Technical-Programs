/*  
    JFM1T5_Assignment 1:
    Write a program to store 10 numbers in an array and display the sum of all the elements.
    Prompt the user for the 10 numbers to be input from the terminal.
    Sample Input:
    Enter the 10  elements:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
    Expected Output:
    Sum of array elements is : 55

*/
import java.util.*;
public class ArraySum {

//Define the main method
public static void main(String args[]){
 int n,sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Array Size");
  n=sc.nextInt();
  int ar[] =new int [n];
 System.out.println("Enter Array elements"); 
  for(int i=0;i<n;i++){
    ar[i]=sc.nextInt();
  }
  for(int i=0;i<n;i++){
    sum=sum+ar[i];
  }
  System.out.println("Sum of Array elements is : "+sum);
}
//Declare the variables and initialize

//Take input from user

//Check user input values using for loop and add all values
 
//Print the result

}
