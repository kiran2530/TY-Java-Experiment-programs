package mathematical;

public class Mean
{
	public double mean(int[] a, int n)
	{
		int sum =0;
		for(int i =0; i<n; i++)
		{
			sum = sum + a[i];
		}
		
		return sum/n;
	}
}