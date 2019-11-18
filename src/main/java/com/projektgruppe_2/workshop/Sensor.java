package java.com.projektgruppe_2.workshop;

/**
 * The type Sensor.
 */
public class Sensor {

    private String name;
    private SensorType type;
    private int value;

    /**
     * Instantiates a new Sensor.
     *
     * @param name  the name
     * @param type  the type
     * @param value the value
     */
    public Sensor(String name, SensorType type, int value){
        this.name = name;
        this.type = type;
        this.value = value;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public SensorType getType() {
        return type;
    }

    @Override
    public String toString() {
        String after = "";
        if(type ==  SensorType.TEMPERATURE) after = " Celcius";
        else after = " ppm";
        return name + " " + type.toString().toLowerCase() + " " + value + after;
    }
}
