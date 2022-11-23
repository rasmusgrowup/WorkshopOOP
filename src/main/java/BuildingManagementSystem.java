import java.util.List;
import java.util.UUID;

public class BuildingManagementSystem {

    List<Building> buildings;

    BuildingManagementSystem(List<Building> buildings) {
        this.buildings = buildings;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void addBuilding(int index, Building name) {
        buildings.add(index, name);
    }

    public void removeBuilding(Building name) {
        buildings.remove(name);
    }

}
