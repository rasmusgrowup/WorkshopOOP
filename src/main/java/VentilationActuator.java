import java.util.UUID;

public class VentilationActuator extends Actuator {

    VentilationActuator(String name, UUID id) {
        super(name, id);
    }

    @Override
    public String toString() {
        return super.getName() + " " + super.getId();
    }


}
