public class IntToStr
{
    public static int StringToInt(String num)
    {
        int a=1;
        int number=0 ;
        int length = num.length();
        for(int i=length-1; i>=0; i--)
        {
            char ch = num.charAt(i);
            if(ch == '1')
            {
                number = number + 1 * a;
                a*=10;
            }
            else if(ch == '2')
            {
                number = number + 2 * a;
                a*=10;
            }
            else if(ch == '3')
            {
                number = number + 3 * a;
                a*=10;
            }
            else if(ch == '4')
            {
                number = number + 4 * a;
                a*=10;
            }
            else if(ch == '5')
            {
                number = number + 5 * a;
                a*=10;
            }
            else if(ch == '6')
            {
                number = number + 6 * a;
                a*=10;
            }
            else if(ch == '7')
            {
                number = number + 7 * a;
                a*=10;
            }
            else if(ch == '8')
            {
                number = number + 8 * a;
                a*=10;
            }
            else if(ch == '9')
            {
                number = number + 9 * a;
                a*=10;
            }
            else
            {
                number = number + 0 * a;
                a*=10;
            }
        }
        return number;
    }

    public static StringBuilder intToString(int n)
    {
        StringBuilder str = new StringBuilder("");

        while(n != 0)
        {
           int rem = n % 10 ;
           n = n / 10 ;

           if(rem == 1)
            {
                str.insert(0, '1');
            }
            else if(rem == 2)
            {
                str.insert(0, '2');
            }
            else if(rem == 3)
            {
                str.insert(0, '3');
            }
            else if(rem == 4)
            {
                str.insert(0, '4');
            }
            else if(rem == 5)
            {
                str.insert(0, '5');
            }
            else if(rem == 6)
            {
                str.insert(0, '6');
            }
            else if(rem == 7)
            {
                str.insert(0, '7');
            }
            else if(rem == 8)
            {
                str.insert(0, '8');
            }
            else if(rem == 9)
            {
                str.insert(0, '9');
            }
            else
            {
                str.insert(0, '0');
            }
        }

        return str;
    }
    public static void main(String[] args) 
    {
        String num1="120",num2="23";

        int number1 = StringToInt(num1);
        int number2 = StringToInt(num2);

        int product = number1 * number2;

        StringBuilder str = new StringBuilder (intToString(product));
        System.out.println(str);
    }
}