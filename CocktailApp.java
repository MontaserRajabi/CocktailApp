/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package cocktailapp;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CocktailApp {

    public static void main(String[] args) {
        Cup cup1 = new Cup(100);

        Fruit orange = new Fruit("Orange", 65, 120, 255, 165, 0);
        Fruit apple = new Fruit("Apple", 95, 150, 255,255,0);
        Milk milk = new Milk("Milk", 45, 200);
        Suger sugar = new Suger("Sugar", 15, 50);
        Blender blender = new Blender(1000);
        try {
            blender.addIngredient(orange);
            blender.addIngredient(apple);
            blender.addIngredient(milk);
            blender.addIngredient(sugar);
        } catch (BlenderOverFlowException ex) {
            Logger.getLogger(CocktailApp.class.getName()).log(Level.SEVERE, null, ex);
        }

        blender.blend();
        try {
            blender.pourIntoCup(cup1);
        } catch (BlenderEmptyException ex) {
            Logger.getLogger(CocktailApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Cup content calories: " + cup1.getContentCalories());

        System.out.println(cup1.getInfo());
        System.out.println("Blender Capacite:" + blender.getCapacity());
    }
}

