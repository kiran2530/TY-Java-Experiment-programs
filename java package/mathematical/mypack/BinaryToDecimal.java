package mathematical.mypack;
public class BinaryToDecimal
{
   public int binaryToDecimal(String s)
   {
      int n = Integer.parseInt(s);
      int number = 0,i=0;
      while(n != 0)
      {
         int r = n%10;
	 if(r==1)
	    number += Math.pow(2,i);
	 n = n/10;
	 i++;
      }
      return number;
   }

}