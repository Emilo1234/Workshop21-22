package java.com.workshop;

import java.util.ArrayList;
import java.util.List;

public class Building {

    private String name;
    private List<Sensor> sensors;
    private List<Actuator> actuators;

    public Building(String name){
        this.name = name;
        this.sensors = new ArrayList<>();
        this.actuators = new ArrayList<>();
    }

    public void addSensor(Sensor sensor){
        sensors.add(sensor);
    }

    public void addActuator(Actuator actuator){
        actuators.add(actuator);
    }

    public void removeSensor(Sensor sensor){
        sensors.remove(sensor);
    }

    public void removeActuator(Actuator actuator){
        actuators.remove(actuator);
    }

    public List<Actuator> getActuators() {
        return actuators;
    }

    public List<Sensor> getSensors() {
        return sensors;
    }
}
