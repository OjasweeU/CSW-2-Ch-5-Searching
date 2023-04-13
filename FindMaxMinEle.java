package problems;
public class FindMaxMinEle 
{
	 public static void findMinAndMax(int[] nums)
	    {
	        int max=nums[0];
	        int min=nums[0];
	        for (int i = 1; i < nums.length; i++)
	        {
	            // if the current element is greater than the maximum found so far
	            if (nums[i]>max)
	            {
	                max=nums[i];
	            }
	            // if the current element is smaller than the minimum found so far
	            else if (nums[i]<min) 
	            {
	                min=nums[i];
	            }
	        }
	        System.out.println("The minimum array element is " + min);
	        System.out.println("The maximum array element is " + max);
	    }
	 
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 int[] nums = {15,88,76,75,68,93 };
	     findMinAndMax(nums);
	}

}


/*OUTPUT:
 *The minimum array element is 15
The maximum array element is 93 */
 