package java.com.projektgruppe_2.workshop;

public class Actuator {

    private String name;
    private double value;

    public Actuator(String name, double value){
        this.name = name;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
