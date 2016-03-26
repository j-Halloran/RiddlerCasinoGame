import java.util.Random;
public class RiddlerGame{
	static long timesRan = 100000000;
	public static void main(String[] args){
		long numPicked = 0;
		Random rng = new Random();
		double currentVal = 0;
		for(int i =0;i<timesRan;i++){
			currentVal = 0;
			while(currentVal<1){
				numPicked += 1;
				currentVal +=rng.nextDouble();
			}
		}
		System.out.println("You spend $"+(timesRan*250)+" and made a profit of: $"+((numPicked*100)-(timesRan*250)));
		System.out.println("Your average profit was: $"+((((double)numPicked*100)-(timesRan*250))/timesRan));
		
	}
}