package FlightControl.domain;

public class Airplane {
    private String name;
    private int capacity;

    public Airplane(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    };

    public String getName() {
        return this.name;
    };

    public int getCapacity() {
        return this.capacity;
    }
    
}
