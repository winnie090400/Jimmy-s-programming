package Lab_05;

public class Elevator_Information {
    public final int MAX_FLOOR = 5, MIN_FLOOR = 1;
    private int floor;
    
    public void Infor_setFloor(int num){
        floor = num;
    }
    
    public int Infor_getFloor(){
        return floor;
    }
    
    public void Infor_addFloor(){
        floor += 1;
    }
    
    public void Infor_subFloor(){
        floor -= 1;
    }
}
