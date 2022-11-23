import java.util.*;

public class Building extends Unit {

    private List<Sensor> sensors;

    private List<Actuator> actuators;

    Building(String name, UUID id) {
        super(name, id);
        sensors = new ArrayList();
    }

    public List<Sensor> getSensors() {
        return sensors;
    }

    public List<Actuator> getActuators() {
        return actuators;
    }

    public void addTemperatureSensor(TemperatureCensor name) {
        sensors.add(name);
    }

    public void addCo2Sensor(Co2Sensor sensor) {
        sensors.add(sensor);
    }

    public void removeSensor(Sensor name) {
        sensors.remove(name);
    }

    public void addVentActuator(VentilationActuator name) {
        actuators.add(name);
    }
    public void removeActuator(Actuator name) {
        actuators.remove(name);
    }
}
