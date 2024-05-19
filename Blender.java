
package cocktailapp;

import java.awt.Color;
import java.util.ArrayList;
import loggerPack.ConsoleLogger;
import loggerPack.Logger;




public class Blender {


    private ArrayList<Ingredients> ingred = new ArrayList<>();
    private double capacity;
    private double totalCalories;
    private double volume;
    private Color color , mixed;
    private double calPerMl;
    private loggerPack.Logger Logger = new ConsoleLogger();
    
    public Blender(double capacity , Logger logger) {
        this.capacity = capacity;
        this.totalCalories = 0;
        this.volume = 0;
        this.mixed = new Color(255,255,255);
        this.Logger = logger;
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
            this.Logger.log("Blender is empty. Cannot pour into cup.");
        }
        
            if (cup.getCapacity()>volume) {
                this.Logger.log("Pouring......");
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
    

    public Cocktail blend(){
        this.Logger.log("Adding ingreidents ");
        Cocktail cocktail = new Cocktail();
        cocktail.setCalories(totalCalories);
        cocktail.setColor(mixed);
        cocktail.setVolume(volume);
        this.calPerMl = (double)(this.totalCalories) / (double) (this.volume);
        return cocktail;
            
    }

    public void setVolume(double volume) {
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

    public double getCapacity() {
        return capacity;
    }

    public String getInfo() {
        return  " capacity :"+ capacity  + "  \ntotalCalories :" + totalCalories+ "\nCalories Per Mile :"+calPerMl+"\nvolume  :" +volume+ "\ncolor :" + mixed.toString();
    }

}
