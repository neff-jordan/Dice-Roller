import java.util.Random;

public class sixSides {

	public static void main(String[] args) {

		for(int i = 0; i < 5; i++) {
			Random diceRoll = new Random();
			int x = diceRoll.nextInt(6) + 1;
			System.out.println("You rolled a " + x);
			
		}
		
	}
}
