/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailapp;

public class Cup{
    private int capacity;
    private double contentCalories;

    public Cup(int capacity) {
        setCapacity(capacity);
        this.contentCalories = 0;
    }
    public static void cupBlending(){
    }
    

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getContentCalories() {
        return contentCalories;
    }

    public void setContentCalories(int contentCalories) {
        this.contentCalories = contentCalories;
    }

    public String getInfo() {
        return "Cup{" + "capacity=" + capacity + ", contentCalories=" + contentCalories + '}';
    }
    
}
