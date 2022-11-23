import java.util.UUID;

public class TemperatureCensor extends Sensor {

    private double temperature;

    TemperatureCensor(String name, UUID id, double temperature) {
        super(name, id);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return super.getName() + " " + super.getId() + " " + temperature;
    }
}
