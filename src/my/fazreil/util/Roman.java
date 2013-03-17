package my.fazreil.util;

public class Roman {
	
	private String roman[][] = {{"I","V","X"},{"X","L","C"},{"C","D","M"},{"M","",""}};
	
	public Roman()
	{}
	
	/**
	 *@author fazreil.jalil
	 *@param <b>Long</b> numeral; the number to be converted.
	 *@return <b>String</b>; the romanized numeral form of the input.
	 */
	public String romanize(Long numeral)
	{
		String returnvalue = "";
		long decimal = numeral % 10;
		returnvalue = roman(decimal,roman[0])+returnvalue;
		numeral = numeral - decimal;
		long tenth = numeral % 100;
		returnvalue = roman(tenth/10,roman[1])+returnvalue;
		numeral = numeral - tenth;
		long hundred = numeral % 1000;
		returnvalue = roman(hundred/100,roman[2])+returnvalue;
		numeral = numeral - hundred;
		returnvalue = roman(numeral/1000, roman[3])+returnvalue;
		return returnvalue;
	}
	
	public long numeralize(String romanized)
	{
		return 1;
	}
	
	/**
	 * @author fazreil.jalil
	 * @param <b>Long</b> number; the number in Long
	 * @param <b>String[]</b> romanLetters; an array of roman letter taken from the 2-dimensional array roman[][].
	 * @return <b>String</b> the individual letter in numeral letter.
	 */
	private String roman(long number, String[] romanLetters)
	{
		String returnvalue = "";
		
		if(number < 5)
		{
			if(number == 4)
			{
				returnvalue = returnvalue + romanLetters[0]+romanLetters[1];
			}
			else
			{
				for(long i=number;i>0;i--)
				{
					returnvalue = returnvalue + ""+romanLetters[0];
				}
			}
		}
		
		if(number >= 5)
		{
			returnvalue = romanLetters[1] + returnvalue;
			for(long i=(number-5);i>0;i++)
			{
				returnvalue = returnvalue + ""+romanLetters[0];
			}
		}
		
		if(number == 9)
		{
			returnvalue = romanLetters[0]+romanLetters[2];
		}
		
		if(number == 10)
		{
			returnvalue = romanLetters[2];
		}
		return returnvalue;
	}
	/**
	 * @author fazreil.jalil
	 * @param args
	 */
	public static void main(String[] args) {
		Roman roman = new Roman();
		System.out.println(roman.romanize(new Long(1234)));
	}

}
