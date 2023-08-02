public class EmpleadoFijo extends Empleado {
    private double bonoAnual;
    //Empleado fijo no debe tener tarifas por hora
    //se aplica Push Down Field donde el atributo tarifaHora solo esta presente 
    //en las subclases que lo necesitan 

    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, String departamento, double bonoAnual, String genero) {
        super(nombre, salarioBase, horasTrabajadas, departamento,genero);
        this.bonoAnual = bonoAnual;
      
    }

    public void imprimirDetalles() {
        
        System.out.println("bonoAnual: " + bonoAnual);
    }

    // Más metodos
}
