package mathematical.mypack;
public class DecimalToBinary
{
	public StringBuilder decimalToBinary(int n)
	{
		String s = "";
		
		while(n>0)
		{
			int a = n%2;
			if(a==1)
				s += "1";
			else
				s += "0";

			n = n/2;
		}
		StringBuilder str = new StringBuilder();
		str.append(s);
		str.reverse();
		return str;
	}
}