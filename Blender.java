/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailapp;

import java.awt.Color;
import java.util.ArrayList;

public class Blender {

    private ArrayList<Ingredients> ingred = new ArrayList<>();
    private int capacity;
    private double totalCalories;
    private double volume;
    private Color color , mixed;
    private double calPerMl;
   
    
    public Blender(int capacity) {
        this.capacity = capacity;
        this.totalCalories = 0;
        this.volume = 0;
        this.mixed = new Color(255,255,255);
    }

    public double getCalPerMl() {
        return calPerMl;
    }

    public void setCalPerMl(double calPerMl) {
        this.calPerMl = this.totalCalories/this.volume;
    }
    

    public static Color mixColors(Color color1, Color color2) {
        int red = (color1.getRed() + color2.getRed()) / 2;
        int green = (color1.getGreen() + color2.getGreen()) / 2;
        int blue = (color1.getBlue() + color2.getBlue()) / 2;

        return new Color(red, green, blue);
        
    }
    
    
     public void pourIntoCup(Cup cup) throws BlenderEmptyException {
        if(this.volume>0){
         if (cup.getCapacity()== 0) {
            System.out.println("Blender is empty. Cannot pour into cup.");
        }
        
            if (cup.getCapacity()>volume) {
                cup.setContentCalories((int)(this.volume * this.calPerMl));
                this.volume=0;
            }
            else{
                this.volume -= cup.getCapacity();
                cup.setContentCalories((int)(cup.getCapacity()*this.calPerMl));
            }
        }
        else{
            throw new BlenderEmptyException();
        }
         
    }
    

    public void blend(){
        System.out.println("Blending ingredients...");
        System.out.println("The final color of the cocktail is :" + mixed.toString() );
        System.out.println("The total Calories is : " + this.totalCalories);
       this.calPerMl = (double)(this.totalCalories) / (double) (this.volume);
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int totalCalories() {
        int total = 0;
        for (Ingredients ing : ingred) {
            total += ing.getCalories();
        }
        return total;
    }

    public double totalVolume() {
        double total = 0;
        for (Ingredients ing : ingred) {
            total += ing.getVolume();
            if (ing instanceof Milk) {
                total += ((Milk) ing).getVolume();
            }
            if (ing instanceof Suger) {
                total += ((Suger) ing).getVolume();
            }

        }
        return total;
    }

    public double getTotalCalories() {
        return totalCalories;
    }

    public double getVolume() {
        return volume;
    }

    public void addIngredient(Ingredients ing)throws BlenderOverFlowException{
        if (totalVolume() + ing.getVolume() <= capacity) {
            ingred.add(ing);
            mixed = mixColors(mixed, ing.getColor());
        } else {
           throw new BlenderOverFlowException();
        }

        totalCalories += ing.getCalories();
        volume += ing.getVolume();
        
    }

    public int getCapacity() {
        return capacity;
    }

    public String getInfo() {
        return "Blender{" + "ingred=" + ingred + ", capacity=" + capacity + ", totalCalories=" + totalCalories + ", volume=" + volume + ", color=" + color.toString() + '}';
    }

}
