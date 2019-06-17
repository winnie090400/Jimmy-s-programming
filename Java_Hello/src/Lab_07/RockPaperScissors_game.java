package Lab_07;

import java.util.Random;

public class RockPaperScissors_game {
    private static final int STATE_INITIAL 		= 0;
    private static final int STATE_NEWPLAYER            = 1;
    private static final int STATE_GAMESTART            = 2;
    private static final int STATE_CHOOSE 		= 3;
    private static final int STATE_BATTLE		= 4;
    private static final int STATE_RECORD		= 5;
    private static final int STATE_CONTINUE		= 6;
    private static final int STATE_EXIT                 = 7;
    private static final int STATE_END			= 9;

    private static final Random CHANCE_RANDOW = new Random();
    
    private static final String ROCK = "0";
    private static final String PAPER = "1";
    private static final String SCISSORS = "2";
    private static final int LIMITTIME = 10;
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    public RockPaperScissors_game(int state, String chooseOption_computer, String chooseOption_player, RockPaperScissors_player player_computer, RockPaperScissors_player player_01) {
        this.state = state;
        this.chooseOption_computer = chooseOption_computer;
        this.chooseOption_player = chooseOption_player;
        this.player_computer = player_computer;
        this.player_01 = player_01;
    }

    public RockPaperScissors_game() {
    }

    
    private int state;
    private String chooseOption_computer, chooseOption_player;
    
    private RockPaperScissors_player player_computer, player_01;
    private RockPaperScissors_Display RPS_display = new RockPaperScissors_Display();
    
    public void game_start(){
    	state = STATE_INITIAL;
        System.out.println("State = " + state);
    }
    
    private void game_Initail() {
        if(player_computer == null){
            player_computer = new RockPaperScissors_player();
        }
        player_computer.player_Initial();
    	RPS_display.display_Initial();
    	state = STATE_NEWPLAYER;
        System.out.println("State = " + state);
    	chooseOption_computer = null;
        chooseOption_player = null;
    }
    
    private void game_NewPlayer() {
        if(player_01 == null){
            player_01 = new RockPaperScissors_player();
        }
        player_01.player_Initial();
        player_01.player_createPlayer();
        state = STATE_GAMESTART;
        System.out.println("State = " + state);
    }
    
    private void game_GameStart() {
    	RPS_display.display_showMessage(RPS_display.GAME_START);
        state = STATE_CHOOSE;
        System.out.println("State = " + state);
    }
    
    private void game_Choose(){
        chooseOption_player = null;
        System.out.println("You have " + (10-player_01.player_getPlaytimes()) + " times left to play.");
        do{
            chooseOption_player = RPS_display.display_getInputMessage(RPS_display.CHOOSE_OPTION);
            if(chooseOption_player == null){
                state = STATE_EXIT;
                System.out.println("State = " + state);
                return;
            }else if(chooseOption_player == "") {
            	RPS_display.display_showMessage(RPS_display.BLANK_ENTRY);
            }
            else if(chooseOption_player.equals(ROCK) || chooseOption_player.equals(PAPER) || chooseOption_player.equals(SCISSORS)){
                break;
            }else{
                RPS_display.display_showMessage(RPS_display.WRONG_OPTION);
            }
        }while(true);
        
        state = STATE_BATTLE;
        System.out.println("State = " + state);
    }
    
    private void game_Battle(){
        chooseOption_computer = null;
        int RandomNum = CHANCE_RANDOW.nextInt(3);
        chooseOption_computer = String.valueOf(RandomNum);
        RPS_display.display_showBattleMessage(chooseOption_player, chooseOption_computer, game_WinOrLose());
        state = STATE_RECORD;
        System.out.println("State = " + state);
    }
    
    private void game_Record(){
        player_01.player_setRecord(chooseOption_player);
        player_computer.player_setRecord(chooseOption_computer);
        state = STATE_CONTINUE;
        System.out.println("State = " + state);
    }
    
    private void game_List() {
        int confirmNum = 0xff;
    	//System.out.println("State = " + state);
    	switch(state) {
            case STATE_INITIAL:
                game_Initail();
                break;
    		case STATE_NEWPLAYER:
                game_NewPlayer();
                break;
            case STATE_GAMESTART:
                game_GameStart();
                break;
            case STATE_CHOOSE: 
                game_Choose();
                break;
            case STATE_BATTLE:
            	game_Battle();
            	break;
            case STATE_RECORD:
            	game_Record();
            	break;
            case STATE_CONTINUE:
                if(player_01.player_getPlaytimes() >= LIMITTIME)
                {
                    state = STATE_EXIT;
                }else{
                    confirmNum = RPS_display.display_showConfirmMessage(RPS_display.IS_CONTINUE);//0=YES, 1=NO.
                    if(confirmNum == 1) {
                            state = STATE_EXIT;
                    }else {
                            state = STATE_CHOOSE;
                    }
                }
            	System.out.println("State = " + state);
            	break;
            case STATE_EXIT:
                if(player_01.player_getPlaytimes() >= LIMITTIME){
                    game_Exit();
                    state = STATE_END;
                }else{
                    confirmNum = RPS_display.display_showConfirmMessage(RPS_display.CONFIRM_EXIT);//0=YES, 1=NO.
                    if(confirmNum == 0){
                        game_Exit();
                        state = STATE_END;
                    }else{
                        state = STATE_CHOOSE;
                    }
                }
                System.out.println("State = " + state);
                break;
            case STATE_END:
            	//game_Exit();
            	break;
            default:
            	break;
    	}
    }
    
    private int game_WinOrLose() {
    	int pNum = Integer.parseInt(chooseOption_player);
    	int cNum = Integer.parseInt(chooseOption_computer);
    	
    	if(pNum == cNum){
    		return 0;
    	}else if(pNum - cNum == 1 || pNum - cNum == -2) {
    		player_01.player_addWinTimes();
    		return 1;
    	}
    	else {
    		player_computer.player_addWinTimes();
    		return 2;
    	}
    }
    
    public boolean game_IsContinue() {
    	if(state == STATE_END) {
            return false;
    	}
    	game_List();
    	return true;
    }
    
    public void game_Exit() {
    	RPS_display.display_showResult(player_01, player_computer);
    	RPS_display.display_showMessage(RPS_display.EXIT_GAME);
    }
}
