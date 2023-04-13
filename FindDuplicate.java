//Print Duplicates in List
//Problem: Given an array of n numbers, print the duplicate elements in the array
package problems;
import java.util.*;
public class FindDuplicate 
{
    public static int lowerBound(int[] arr, int target)
    {
    	int lo=0, hi=arr.length;
    	int ans=-1;
    	while(lo<=hi)
    	{
    		int mid=lo+(hi-lo)/2;
    		if(arr[mid]>=target)
    		{
    			ans=mid;
    			hi=mid-1;
    		}
    		else
    		{
    			lo=mid+1;
    		}
    	}
    	return ans;
    }
    
    public static int upperBound(int[] arr, int target)
    {
    	int lo=0, hi=arr.length;
    	int ans=-1;
    	while(lo<=hi)
    	{
    		int mid=lo+(hi-lo)/2;
    		if(arr[mid]<=target)
    		{
    			ans=mid;
    			lo=mid+1;
    		}
    		else
    		{
    			hi=mid-1;
    		}
    	}
    	return ans;
    }
    static void printDuplicates(int[] arr, int n)
    {
    	Arrays.sort(arr);
        System.out.print("[");
        for(int i=0;i<n;i++)
        {
        	int firstIndex=lowerBound(arr,arr[i]);
        	int lastIndex=upperBound(arr,arr[i]);
        	int occurTime=lastIndex-firstIndex+1;
        	if(occurTime>1)
        	{
        		i=lastIndex;
        		System.out.print(arr[i]+ " ");
        	}
        }
        System.out.println("]");
	}  
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        int[] arr= {12,11,40,12,5,6,5,12,11};
        int n=arr.length;
        printDuplicates(arr,n);
	}
}

//Output: {5, 11, 12]
