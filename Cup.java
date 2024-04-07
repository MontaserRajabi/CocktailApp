/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailapp;

/**
 *
 * @author MontaserPC
 */
public class Cup{
    private int capacity;
    private int contentCalories;

    public Cup(int capacity) {
        setCapacity(capacity);
        this.contentCalories = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getContentCalories() {
        return contentCalories;
    }

    public void setContentCalories(int contentCalories) {
        this.contentCalories = contentCalories;
    }
}
