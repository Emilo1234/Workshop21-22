package java.com.workshop;

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
