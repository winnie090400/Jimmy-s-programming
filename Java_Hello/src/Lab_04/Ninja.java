package Lab_04;

public class Ninja {
    String Name;
    int cakram;
    
    public void getEntrgy(Ninja_Energy energy){
        cakram += energy.dabuwan;
        System.out.println("Energy +" + energy.dabuwan + "\n" + "cakram: " + cakram);
    }
    
    public void splitUp(){
        if(cakram >= 10){
            System.out.println("Kage Bunshin no Jutsu!!!");
            cakram -= cakram;
        }   else{
            System.out.println("Low cakram: " + cakram);
        }
    }
    
    public void showInfo(){
        System.out.println("--------------NinjaInfo--------------");
        System.out.println("Name: " + Name);
        System.out.println("Cakram: " + cakram);
        System.out.println("-------------------------------------");
    }
}
