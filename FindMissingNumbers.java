//Find the missing number in an array
/*In given list of n-1 elements, which are in the range of 1 to n. There
are no duplicates in the array. One of the integer is missing. Find the missing
element.*/


package problems;
import java.io.*;
import java.util.*;
public class FindMissingNumbers 
{
	 public static void findMissing(int arr[], int N)
	  {
	     int i;
	     int temp[] = new int[N+1];
	     for (i=0;i<=N;i++)
	     {
	        temp[i]=0;
	     }
	     for (i=0;i<N;i++) 
	     {
	        temp[arr[i]-1]=1;
	     }
	     int ans=0;
	     for (i=0;i< N;i++)
	     {
	       if (temp[i]==0)
	           ans=i+1;
	     }
	     System.out.println(ans);
	   }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 7, 5, 6, 2 };
        int n = arr.length;
        findMissing(arr, n);
	}

}

//OUTPUT: 4
