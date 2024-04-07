
package cocktailapp;

import java.awt.Color;
import java.util.ArrayList;

public class Blender {

    private ArrayList<Ingredients> ingred = new ArrayList<>();
    private int capacity;
    private int totalCalories;
    private int volume;
    private Color color;

    public Blender(int capacity) {
        this.capacity = capacity;
        this.totalCalories = 0;
        this.volume = 0;
    }

    public static Color mixColors(Color color1, Color color2) {
        int red = (color1.getRed() + color2.getRed()) / 2;
        int green = (color1.getGreen() + color2.getGreen()) / 2;
        int blue = (color1.getBlue() + color2.getBlue()) / 2;

        return new Color(red, green, blue);
    }

    public void blend() {
        System.out.println("Blending ingredients...");
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

    public int getTotalCalories() {
        return totalCalories;
    }

    public int getVolume() {
        return volume;
    }

    public void addIngredient(Ingredients ing) {
        if (totalVolume() + ing.getVolume() <= capacity) {
            ingred.add(ing);
        } else {
            System.out.println("Blender Capacity Full!");
        }

        totalCalories += ing.getCalories();
        volume += ing.getVolume();
        Color mixedColor = mixColors(color, ing.getColor());
    }

    public String getInfo() {
        return "Blender{" + "ingred=" + ingred + ", capacity=" + capacity + ", totalCalories=" + totalCalories + ", volume=" + volume + ", color=" + color.toString() + '}';
    }

}