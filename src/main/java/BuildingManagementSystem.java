import java.util.List;
import java.util.UUID;

public class BuildingManagementSystem {
    List<Building> buildings;

    BuildingManagementSystem() {
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

    public static void main(String[] args) {
        BuildingManagementSystem bms = new BuildingManagementSystem();
        UUID buildingId = UUID.randomUUID();
        UUID co2Id = UUID.randomUUID();
        Co2Sensor co2Sensor = new Co2Sensor("First floor CO2 sensor", co2Id, 95);
        Building building = new Building("Empire State Building", buildingId);
        building.addCo2Sensor(co2Sensor);
        System.out.println(building.toString());
        System.out.println(building.getSensors());
    }

}
