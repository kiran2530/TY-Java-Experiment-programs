package mathematical;
public class Median
{
	public double median(int[] a, int n)
	{
		if(n%2 != 0)
			return a[n/2];
		else
			return (a[(n-1)/2] + a[n/2])/2;
	}

}