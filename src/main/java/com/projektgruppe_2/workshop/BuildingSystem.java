package java.com.projektgruppe_2.workshop;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Building system.
 */
public class BuildingSystem {

    private List<Building> buildings;

    /**
     * Instantiates a new BuildingSystem.
     */
    public BuildingSystem(){
        buildings = new ArrayList<>();

        Building sdu = new Building("Syddansk universitet");
        Sensor sensor = new Sensor("SDU Sensor 1", SensorType.TEMPERATURE, 20);
        sdu.addSensor(sensor);
        Actuator actuator = new Actuator("SDU Actuator 1", 22);
        sdu.addActuator(actuator);
        addBuilding(sdu);

        for(Building building : buildings){
            building.getSensors().get(0).toString();
        }
    }

    /**
     * Add building.
     *
     * @param building the building
     */
    public void addBuilding(Building building){
        buildings.add(building);
    }

    /**
     * Remove building.
     *
     * @param building the building
     */
    public void removeBuilding(Building building){
        buildings.remove(building);
    }
}
