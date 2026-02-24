

/**
 * Class Profesor
 */
public class Profesor extends Persona {

  //
  // Fields
  //

  public int IdTrabajador;
  public double Salario;
  public String Departamento;
  
  //
  // Constructors
  //
  public Profesor(String nombre, int edad, String sexo, int idTrabajador, double salario, String departamento) {

    super(nombre, edad, sexo);
    this.IdTrabajador = idTrabajador;
    this.Salario = salario;
    this.Departamento = departamento;
}
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of IdTrabajador
   * @param newVar the new value of IdTrabajador
   */
  public void setIdTrabajador (int newVar) {
    IdTrabajador = newVar;
  }

  /**
   * Get the value of IdTrabajador
   * @return the value of IdTrabajador
   */
  public int getIdTrabajador () {
    return IdTrabajador;
  }

  /**
   * Set the value of Salario
   * @param newVar the new value of Salario
   */
  public void setSalario (double newVar) {
    Salario = newVar;
  }

  /**
   * Get the value of Salario
   * @return the value of Salario
   */
  public double getSalario () {
    return Salario;
  }

  /**
   * Set the value of Departamento
   * @param newVar the new value of Departamento
   */
  public void setDepartamento (String newVar) {
    Departamento = newVar;
  }

  /**
   * Get the value of Departamento
   * @return the value of Departamento
   */
  public String getDepartamento () {
    return Departamento;
  }

  //
  // Other methods
  //

  /**
   * @param        IdTrabajador
   * @param        Salario
   * @param        Departamento
   */
  public void DatosDocente(int IdTrabajador, double Salario, String Departamento)
  {
    super.mostrarDatos(getNombre(), getEdad(), getSexo());
    System.out.println("Id Trabajador: " + IdTrabajador);
    System.out.println("Salario: " + Salario);
    System.out.println("Departamento: " + Departamento);
}


}
