/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loggerPack;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;

/**
 *
 * @author MontaserPC
 */
public class FileLogger implements Logger{
    String filepath;
    public FileLogger(String filepath){
    this.filepath =filepath;
    }

    public FileLogger() {
        
    }
    public void log(String msg){
    
        FileWriter fw;
        try {
            fw = new FileWriter(filepath);
            fw.write(msg);
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }
         
    }
}
