package java.com.workshop;

import java.util.ArrayList;
import java.util.List;

public class BuildingSystem {

    private List<Building> buildings;

    /**
     * Instantiates a new BuildingSystem.
     */
    public BuildingSystem(){
        buildings = new ArrayList<>();
    }

    public void addBuilding(Building building){
        buildings.add(building);
    }

    public void removeBuilding(Building building){
        buildings.remove(building);
    }
}
