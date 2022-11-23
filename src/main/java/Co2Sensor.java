import java.util.UUID;

public class Co2Sensor extends Sensor{

    private double co2Level;

    Co2Sensor(String name, UUID id, double temperature, double co2Level) {
        super(name, id);
        this.co2Level = co2Level;
    }

    public double getCo2Level() {
        return co2Level;
    }

    @Override
    public String toString() {
        return super.getName() + " " + super.getId() + " " + co2Level;
    }
}
