
package cocktailapp;

public class BlenderEmptyException extends Exception {
    public BlenderEmptyException() {
        super("The blender is empty!");
    }
}
