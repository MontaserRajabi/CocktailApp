/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailapp;

public class BlenderOverFlowException extends Exception {
     public BlenderOverFlowException(){
        super("Ingredients volume exceeds blender capacity");
    }
}
