package bridgelabz.junit.serviceImpl;


public class PalindromeandIsPrime {

	public boolean check_Palindrome(String s)
	{
		String res="";
		for(int i=s.length()-1;i>=0;i--)
		{
			res=res+s.charAt(i);
		}
		if(s.equals(res))
			return true;
		else
			return false;
	}

	public boolean isPrime(int n)
	{
		for(int i=2;i<n-1;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

}