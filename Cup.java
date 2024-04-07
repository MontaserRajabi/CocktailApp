package cocktailapp;

public class Cup{
    private int capacity;
    private int contentCalories;

    public Cup(int capacity) {
        setCapacity(capacity);
        this.contentCalories = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getContentCalories() {
        return contentCalories;
    }

    public void setContentCalories(int contentCalories) {
        this.contentCalories = contentCalories;
    }

    public String getInfo() {
        return "Cup{" + "capacity=" + capacity + ", contentCalories=" + contentCalories + '}';
    }
}
