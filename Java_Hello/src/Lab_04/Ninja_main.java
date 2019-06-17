package Lab_04;

import javax.swing.JOptionPane;

public class Ninja_main {

    public static void main(String[] args) {
        Ninja_UI ui = new Ninja_UI(); 
        
        while(ui.flag){
            ui.showList();
            ui.SelectActive();
        }
    }
}
