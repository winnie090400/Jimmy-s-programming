package Lab_06;

public class Array_Student {
    private String name;
    private int[] scores = new int[3];
    
    public void setName(String str){
        this.name = str;
    }
    
    public void setScores(int index, int score){
        this.scores[index] = score;
    }
    
    public void displayInfo(){
        System.out.println(this.name);
        for(int i= 0; i<this.scores.length; i++){
            int score = this.scores[i];
            System.out.println(score);
        }
    }
}
