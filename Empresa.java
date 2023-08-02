import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public void contratarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void despedirEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

    public List<Empleado> obtenerEmpleadosPorHorasTrabajadasaPartirDe(int horas) {
        List<Empleado> empleadosPorHoras = new ArrayList<>();
        for (Empleado empleado : empleados) {
            if (empleadoConMasHoras(empleado, horas)) {
                empleadosPorHoras.add(empleado);
            }
        }
        return empleadosPorHoras;
    }

    private boolean empleadoConMasHoras(Empleado empleado, int horas) {
        return empleado.getHorasTrabajadas() > horas;
    }

    // Más metodos
}

