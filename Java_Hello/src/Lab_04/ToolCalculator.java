package Lab_04;

public class ToolCalculator {
    String title;
    int total = 0, count = 0;
    double avg = 0;
    
    public int addScore(int score){
        total += score;
        count++;
        return score;
    }
    
    public double getScoreAvg(int score){
        
        double davg = (double)score/(double)count;
        return davg;
    }
    
}
