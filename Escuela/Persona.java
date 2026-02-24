

/**
 * Class Persona
 */
public class Persona {

  //
  // Fields
  //

  public String Nombre;
  public int Edad;
  public String Sexo;
  
  //
  // Constructors
  //
  public Persona(String nombre, int edad, String sexo) {
        this.Nombre = nombre;
        this.Edad = edad;
        this.Sexo = sexo;
    }
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of Nombre
   * @param newVar the new value of Nombre
   */
  public void setNombre (String newVar) {
    Nombre = newVar;
  }

  /**
   * Get the value of Nombre
   * @return the value of Nombre
   */
  public String getNombre () {
    return Nombre;
  }

  /**
   * Set the value of Edad
   * @param newVar the new value of Edad
   */
  public void setEdad (int newVar) {
    Edad = newVar;
  }

  /**
   * Get the value of Edad
   * @return the value of Edad
   */
  public int getEdad () {
    return Edad;
  }

  /**
   * Set the value of Sexo
   * @param newVar the new value of Sexo
   */
  public void setSexo (String newVar) {
    Sexo = newVar;
  }

  /**
   * Get the value of Sexo
   * @return the value of Sexo
   */
  public String getSexo () {
    return Sexo;
  }

  //
  // Other methods
  //

  /**
   * @param        Nombre_
   * @param        Edad
   * @param        Sexo
   */
  public void mostrarDatos(String Nombre, int Edad, String Sexo)
  {
  System.out.println("Nombre: " + Nombre);
  System.out.println("Edad: " + Edad);
  System.out.println("Sexo: " + Sexo);
  }


}
