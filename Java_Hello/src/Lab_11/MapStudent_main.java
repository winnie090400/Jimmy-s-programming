package Lab_11;

public class MapStudent_main {

    public static void main(String[] args) {
        MapStudent_student student = new MapStudent_student();
        
        student.setName("Jimmy");
        student.setScores("Chinese", 100);
        student.setScores("English", 90);
        student.setScores("Math", 80);
        student.displayInfo();
    }
}
