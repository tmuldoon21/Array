import java.util.Random;

public class DiceArray 
{

	public static void main(String[] args) 
	{
		Random rand = new Random();
		int dice1 = rand.nextInt(6);
		int dice2 = rand.nextInt(6);
		int []dieTotals = new int [11];
		for (int i=0; i<1000; i++)
		{
			dice1 = rand.nextInt(6);
			dice2 = rand.nextInt(6);
			int total = dice1 + dice2;
			dieTotals[total]++;
		}
		for (int i=0; i<11; i++)
		{
			System.out.println("The amount of time you rolled the #"+ (i+2) +" is " + dieTotals[i] + "");
		}

	}

}
