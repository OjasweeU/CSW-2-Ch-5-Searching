//First Repeated element in the array
/*Problem: Given an unsorted list of n elements, find the first element, which is
repeated.*/

package problems;
import java.util.*;
public class RepeatedElements 
{
    public static int firstRepeat(int[] arr, int n)
    {
    	for(int i=0;i<n;i++)
    	{
    		for(int j=i+1;j<n;j++)
    		{
    			if(arr[i]==arr[j])
    			{
    				return i;
    			}
    		}
    	}
    	return -1;
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        int [] arr= { 34, 56, 77, 1, 5, 6, 6, 6, 7, 8, 10, 34, 20, 30 };
        int n=arr.length;
        int index=firstRepeat(arr,n);
        
        if(index==1)
        {
        	System.out.println("No repeating element is formed");
        }
        else
        {
        	System.out.println("First repeating element is: " + arr[index]);
        }
	}

}

/*Output
 * First repeating element is: 34*/
