/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailapp;

import java.awt.Color;

/**
 *
 * @author MontaserPC
 */
public abstract  class  Ingredients{
    private String name;
    private double calories;
    private double volume;
    private Color color;

    public Ingredients(String name, double calories, double volume,int red , int green , int blue) {
        setName(name);
        setCalories(calories);   
        setVolume(volume);
        setColorRGB(red, green, blue);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories >0 ? calories:1;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume > 0 ? volume:1;
    }

    public Color getColor() {
        return color;
    }

    public void setColorRGB(int n1, int n2, int n3) {
        this.color = new Color(n1, n2, n3);
    }

}
