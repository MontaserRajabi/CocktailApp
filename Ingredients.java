package cocktailapp;
import java.awt.Color;
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

   
    public String toStringColor() {
        return   "color=" + color.toString() ;
    }

    
    public String getInfo() {
        return "Ingredients{" + "name=" + name + ", calories=" + calories + ", volume=" + volume + ", color=" + color.toString() + '}';
    }
    
    

}
