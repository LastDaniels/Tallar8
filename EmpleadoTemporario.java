public class EmpleadoTemporario extends Empleado {
    private int mesesContrato;
    private double tarifaHora;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, String departamento, int mesesContrato, String genero) {
        super(nombre, salarioBase, horasTrabajadas, departamento,genero);
        this.mesesContrato=mesesContrato;
        this.tarifaHora=tarifaHora;
      
    }

    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Meses de contrato: " + mesesContrato);
    }

    // Más metodos
}
