public class EmpleadoPorHoras extends Empleado {

    private double tarifaHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, String departamento, String genero) {
        super(nombre, 0, horasTrabajadas, departamento,genero);
        super.setSalarioBase(calcularSalario());
        this.tarifaHora=tarifaHora;
    }

    public void imprimirDetalles() {
       super.imprimirDetalles();
    }

    @Override
    public double calcularSalario() {
        return super.getHorasTrabajadas() * this.tarifaHora;

    // Más metodos
}
