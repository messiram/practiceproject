package practiceproject;

public class LIS 
{
public static void outLis(int[] n1)
{
	String[] p = new String[n1.length];
	int[] s1 = new int[n1.length];

	for(int i=0; i<n1.length; i++)
	{
		s1[i] = 1;
		p[i] = n1[i] + " ";
	}
	int maximumLength = 1;
	for(int i=1; i<n1.length; i++)
	{ 
	for(int j=0; j<n1.length; j++)
	{
		if(n1[i]>n1[j] && s1[i] < s1[j] + 1)
		{
			s1[i] = s1[j] + 1;
			p[i] = p[j] + n1[i] + " "; 
			if(maximumLength < s1[i])
			maximumLength = s1[i];
		}
	}
}
		
for(int i=1; i<n1.length; i++)
{
	if(s1[i] == maximumLength)
System.out.println("The Longest Increasing Subsequences are : " + p[i]);
	}
}
	public static void main(String[] args)
	{
	int[] numbers = {1,4,2,19,6,10,35,99};
	outLis(numbers);
	}
}
