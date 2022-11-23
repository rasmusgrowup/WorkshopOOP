import java.util.UUID;

public class Actuator extends Unit {

    private double value;

    Actuator(String name, UUID id) {
        super(name, id);
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
