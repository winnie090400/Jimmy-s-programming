package Lab_07;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RockPaperScissors_Display {
	public static String Option[] = {"ROCK","PAPER","SCISSORS"};
	
    public static final int BLANK_ENTRY     = 0;
    public static final int NUMBERinNAME    = 1;
    public static final int NAMEtooSHORT    = 2;
    public static final int NAME_OK         = 3;
    public static final int ENTER_NAME      = 4;
    public static final int GAME_START      = 5;
    public static final int CHOOSE_OPTION   = 6;
    public static final int WRONG_OPTION    = 7;
    public static final int IS_CONTINUE     = 8;
    public static final int CONFIRM_EXIT    = 9;
    public static final int EXIT_GAME       = 10;
    
    private static ArrayList<String> strMessage = new ArrayList();
    
    public void display_Initial(){
    	if(strMessage.size() != 0) {
    		for(int i=0; i<strMessage.size(); i++) {
                    strMessage.remove(i);
    		}
    	}
        strMessage.add("Your entry is blank, please try again.");				//0
        strMessage.add("Can not include numbers in name");					//1
        strMessage.add("Your name is too short, must be over 3 characters.");			//2
        strMessage.add("Create name successful!");						//3
        strMessage.add("Enter your name.\n No numbers in your name.");				//4
        strMessage.add("Rock Pater Scissors\n10 chances to play.\nGame start, enjoy it!");	//5
        strMessage.add("Rock = 0.\nPaper = 1.\nScissors = 2.\nChoose one of them to battle.");	//6
        strMessage.add("Wrong option! try again.");						//7
        strMessage.add("Do you wnat to continue?");                                     	//8
        strMessage.add("Do you wnat to exit the game?");					//9
        strMessage.add("Thanks for playing!\n See you next time.");				//10
        
    }
    
    public String display_getInputMessage(int index){
        String returnStr = JOptionPane.showInputDialog(strMessage.get(index));
        System.out.println(strMessage.get(index));
        return returnStr;
    }
    
    public String display_getInputMessage(String message){
        String returnStr = JOptionPane.showInputDialog(message);
        System.out.println(message);
        return returnStr;
    }
    
    public void display_showMessage(int index){
        JOptionPane.showMessageDialog(null, strMessage.get(index));
        System.out.println(strMessage.get(index));
    }
    
    public void display_showBattleMessage(String strPlayer, String strComputer, int result) {
    	if(result == 0) {
    		JOptionPane.showMessageDialog(null, "You: " + Option[Integer.parseInt(strPlayer)] + "\n" +
                                                    "Computer: " + Option[Integer.parseInt(strComputer)] + "\n" +
                                                    "This round is tie!!");
    	}
    	else if(result == 1){
    		JOptionPane.showMessageDialog(null, "You: " + Option[Integer.parseInt(strPlayer)] + "\n" +
                                                    "Computer: " + Option[Integer.parseInt(strComputer)] + "\n" +
                                                    "You win this round!!");
    	}else {
    		JOptionPane.showMessageDialog(null, "You: " + Option[Integer.parseInt(strPlayer)] + "\n" +
                                                    "Computer: " + Option[Integer.parseInt(strComputer)] + "\n" +
                                                    "You lost this round!!");
    	}
    }
    
    public int display_showConfirmMessage(int index) {
    	int returnNum = 0xff;
    	//returnNum = JOptionPane.showConfirmDialog(null, strMessage.get(index));
        returnNum = JOptionPane.showConfirmDialog(null, strMessage.get(index), "Continue?", JOptionPane.YES_NO_OPTION);
    	return returnNum;
    }
    
    public void display_showResult(RockPaperScissors_player player, RockPaperScissors_player computer) {
    	
    	if(player.player_getPlaytimes() <= 0)
    	{
    		System.out.println("No record.");
    		return;
    	}
    	System.out.println("Play Times: " + player.player_getPlaytimes());
    	System.out.println("Win Times: " + player.player_getWinTimes());
    	System.out.println("Your hands: ");
    	for(int i=0; i<=(player.player_getPlaytimes()-1); i++) {
    		System.out.print(Option[player.player_getRecordArray(i)] + " ");
    	}
    	System.out.println("");
    	
    	System.out.println("Computers hands: ");
    	for(int i=0; i<=(computer.player_getPlaytimes()-1); i++) {
    		System.out.print(Option[computer.player_getRecordArray(i)] + " ");
    	}
        System.out.println("");
    }
}
