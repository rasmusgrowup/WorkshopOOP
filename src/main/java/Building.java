import java.util.List;
import java.util.UUID;

public class Building extends Unit {

    private List<Sensor> sensors;

    private List<Actuator> actuators;

    Building(String name, UUID id,
             List<Sensor> sensors,
             List<Actuator> actuators) {

        super(name, id);
        this.actuators = actuators;
        this.sensors = sensors;
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

    public void addCo2Sensor(Co2Sensor name) {
        sensors.add(name);
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
