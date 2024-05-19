/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loggerPack;

/**
 *
 * @author MontaserPC
 */
public class ConsoleLogger implements Logger{
    public void log(String msg){
        System.out.println(msg);
    }
}
