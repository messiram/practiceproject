package practiceproject;

public class LIS 
{
	public static void outLis(int[] nums)
	{
		String[] p = new String[nums.length];
		int[] s1 = new int[nums.length];

		for(int i=0; i<nums.length; i++)
		{
			s1[i] = 1;
			p[i] = nums[i] + " ";
		}
		int maximumLength = 1;
		for(int i=1; i<nums.length; i++)
		{ 
			for(int j=0; j<nums.length; j++)
			{
				if(nums[i]>nums[j] && s1[i] < s1[j] + 1)
				{
					s1[i] = s1[j] + 1;
					p[i] = p[j] + nums[i] + " "; 
					if(maximumLength < s1[i])
						maximumLength = s1[i];
				}
			}
		}
		
		  for(int i=1; i<nums.length; i++)
		  {
		    if(s1[i] == maximumLength)
			System.out.println("The Longest Increasing Subsequences are : " + p[i]);
		  }
}
	public static void main(String[] args)
		{

			int[] numbers = {1,3,2,9,6,10,5,99};
			outLis(numbers);
		}
	
}