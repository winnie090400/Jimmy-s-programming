package Lab_07;

import java.util.ArrayList;

public class RockPaperScissors_player {
    private static RockPaperScissors_Display RPS_display = new RockPaperScissors_Display();
    
    private String name;
    private ArrayList<Integer> record = new ArrayList<>();
    private int winTimes;
    
    public void player_Initial(){
        this.name = null;
        winTimes = 0;
        if(record.size() != 0){
            for(int i: record){
                record.remove(i);
            }
        }
    }
    
    public void player_createComputer(){
        this.name = "Computer";
    }
    
    public void player_createPlayer(){
        String str;
        do{
            str = RPS_display.display_getInputMessage(RPS_display.ENTER_NAME);
            player_setName(str);
            if(name != null){
                break;
            }
        }while(true);
    }
    
    public void player_addWinTimes() {
    	this.winTimes ++;
    }
    
    public int player_getWinTimes() {
    	return this.winTimes;
    }
    
    public int player_getPlaytimes() {
    	int playTimes = this.record.size();
    	return playTimes;
    }
    
    public void player_setRecord(String thisHand) {
        this.record.add(Integer.parseInt(thisHand));
    }
    
    public int player_getRecordArray(int index){
    	return this.record.get(index);
    }
    
    private void player_setName(String set_Name){
        if(!isNameOk(set_Name)){
            return;
        }
        this.name = set_Name;
    }
    
    private boolean isNameOk(String checkName){
        if(checkName == null){
            RPS_display.display_showMessage(RPS_display.BLANK_ENTRY);
            return false;
        }else{
            char charName[] = new char[checkName.length()];
            for(int i=0; i<checkName.length(); i++){
                charName[i] = checkName.charAt(i);
                if(charName[i] >= '0' && charName[i] <= '9'){
                    RPS_display.display_showMessage(RPS_display.NUMBERinNAME);
                    return false;
                }
            }
            if(charName.length <= 2){
                RPS_display.display_showMessage(RPS_display.NAMEtooSHORT);
                return false;
            }
        }
        RPS_display.display_showMessage(RPS_display.NAME_OK);
        return true;
    }
}
