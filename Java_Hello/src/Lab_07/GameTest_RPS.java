package Lab_07;

import java.util.Random;

public class GameTest_RPS {
	private static final int SCISSORS 	= 0;
	private static final int ROCK		= 1;
	private static final int PAPER		= 2;
	private static final String[] array = {"SICCORS", "ROCK", "PAPER"};
	private static final Random RandomMachine = new Random();
	
	public void random10Times() {
		int countS = 0, countR = 0, countP = 0, result = 0xff;
		String strMessage;
		for(int i=0; i<10; i++) {
			result = RandomMachine.nextInt(3);
			
			switch(result) {
				case SCISSORS:
					countS++;
					break;
				case ROCK:
					countR++;
					break;
				case PAPER:
					countP++;
					break;
				default:
					System.out.println("Something wrong!");
					break;
			}
		}
		
		strMessage = "The result of ten times counting: \n" + 
					array[0] + ":" + countS + "\n" +
					array[1] + ":" + countR + "\n" +
					array[2] + ":" + countP + "\n";
		System.out.println(strMessage);
	}
	
}
