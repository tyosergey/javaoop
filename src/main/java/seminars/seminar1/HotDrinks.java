package seminars.seminar1;

public class HotDrinks extends Product{
    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public HotDrinks(String name, int cost, int temperature) {
        super(name, cost);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", temperature=" + temperature;
    }
}
