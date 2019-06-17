package Lab_07;

import java.util.Random;
import java.util.ArrayList;

public class Lottery_RandomMachine {
	private static Random random = new Random();
	private static ArrayList<Integer> Lottery = new ArrayList<Integer>();
	private static int[][] array = new int[3][6];
	
	
	/**
	 * @set
	 * 	Enter how many set of lottery numbers you want to display.
	 * Maximum = 3, Minimum = 1.
	 */
	public void displayResult(int set) {
		if(set > 3 || set < 1) {
			return;
		}
		
		for(int i=0; i<set; i++) {
			RandomResult(i);
			displayArray(i);
		}
	}
	
	private void RandomResult(int Index) {
		int rNum;
		reflashLottey();
		for(int i=0; i<6; i++) {
			rNum = random.nextInt(Lottery.size());
			array[Index][i] =  Lottery.remove(rNum);
		}
	}
	
	private void displayArray(int Index) {
		System.out.print("Lottery number set " + (Index+1) + ": ");
		for(int i=0; i<6; i++) {
			System.out.print(String.format("%02d", array[Index][i]) + "\t");
		}
		System.out.println("");
	}
	
	private void reflashLottey() {
		if(Lottery.size() != 0) {
			Lottery = null;
			Lottery = new ArrayList<Integer>();
		}
		
		for(int i=0; i<49; i++) {
			Lottery.add(i+1);
		}
	}
	
}
