import mathematical.*;
import mathematical.mypack.*;
import java.util.*;
class TestPackage
{
	public static void main(String[] args)
	{
		int[] a = {7,8,9,5,6};
		int n = a.length;
		int k;
		Scanner sc = new Scanner(System.in);
		
		Mean M = new Mean();
		double M1 = M.mean(a,n);
		System.out.println("-----------------------------------------------");
		System.out.println("MEAN : " + M1);
		System.out.println("-----------------------------------------------");
		Median Me = new Median();
		M1 = Me.median(a,n);
		System.out.println("MEDIAN : " + M1);
		System.out.println("-----------------------------------------------");
		DecimalToBinary d = new DecimalToBinary();
		System.out.print("ENTER DECIMAL NUMBER : ");
		StringBuilder b = d.decimalToBinary(sc.nextInt());
		System.out.println("BINARY : " + b);
		System.out.println("-----------------------------------------------");
		BinaryToDecimal B = new BinaryToDecimal();
		System.out.print("ENTER BINARY NUMBER : ");
		int number = B.binaryToDecimal(sc.next());
		System.out.print("DECIMAL : " + number);
	}
}