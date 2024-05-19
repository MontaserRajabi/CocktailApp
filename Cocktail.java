/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailapp;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author MontaserPC
 */
public class Cocktail {
    private double calories;
    private double volume;
    private Color color;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getInfo() {
        return "Cocktail calories :"+calories+"\nVolume :"+volume+"\nColor in RGB"+color.toString();
    }

    
}
