public class Empleado {
    private String nombre,departamento,genero;
    private double salarioBase;
    private int horasTrabajadas;
    private Departamento departamento;

    public Empleado(){}
      public Empleado(String nombre, double salarioBase, int horasTrabajadas, String departamento, String genero) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
        this.genero=genero;
    }

    public double calcularSalario(){
	validarSalarioBase();
	validarHorasTrabajadas();
	double SalarioTotal=salarioBase+calcularHorasExtra();
        SalarioTotal+=departamento.calcularBonoPorDepartamento();
	return SalarioTota;}
    
    public void validarSalarioYHoras(){
	if(salarioBase<0){
	throw new IllegalArgumentException("El salario debe ser mayor o igual a 0");}}

    public void validarHorasTrabajadas(){
	if(horasTrabajadas<0){
	throw new IllegalArgumentException("Las horas trabajadas deben ser mayor o igual a 0");}}
    
    public double calcularHorasExtra(){
	if(horasTrabajadas>40){
	   return(horasTrabajadas-40)*50;}
	return 0;}


    //getters&setters

	// Método ImprimirDetalles se pasa a esta clase como parte de la solucion Pull Up Method.
public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salarioBase);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Departamento: " + departamento);
        Sytem.out.println("Genero: " + genero);
    }
	
	
    //Se requiere crear una clase abstracta llamada departamento y las clases hijas (los distintos tipos de departamentos) implementaran, esto para respetar el OCP 
    
    public abstract class Departamento {
    public double abstract calcularBonoPorDepartamento();}

    class Sistemas extends Departamento{

	@Override
	public double calcularBono(){
		return 20;}}

    class Contabilidad extends Departamento{

	@Override
	public double calcularBonoPorDepartamento(){
		return 10;}}


	
 

    


    

    



















