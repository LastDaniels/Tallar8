public class EmpleadoFijo extends Empleado {
    private double bonoAnual;
    //Empleado fijo no debe tener tarifas por hora
    //se aplica Push Down Field donde el atributo tarifaHora solo esta presente 
    //en las subclases que lo necesitan 

    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, String departamento, double bonoAnual, String genero) {
        super(nombre, salarioBase, horasTrabajadas, departamento,genero);
        this.bonoAnual = bonoAnual;
        this.genero = genero;
    }

    public void imprimirDetalles() {
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Genero: " + super.getNombre());
        System.out.println("Salario: " + super.getSalarioBase());
        System.out.println("Horas trabajadas: " + super.getHorasTrabajadas());
        System.out.println("Departamento: " + super.getDepartamento());
        System.out.println("bonoAnual: " + bonoAnual);
    }

    // Más metodos
}
