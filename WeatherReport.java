import java.util.Scanner;
public class WeatherReport
{
	public static void main(String[] args) 
	{
	System.out.println("Please enter the temperature in degrees F:");
		Scanner cin=new Scanner(System.in);
		int temp=cin.nextInt();
		if (temp>=90)
		{
			System.out.println("That's really hot!");
		}
		else if (temp<=32)
		{
			System.out.println("It's kind of chilly out, you might want to wear a jacket.");
		}
			int a=5;
			int b=temp-32;
				System.out.println("It is "+((double)(a*b)/9)+" degrees C.");
		cin.close();
	}
}
