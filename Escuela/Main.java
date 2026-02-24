

/**
 * Class Main
 */
public class Main {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  public Main () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  //
  // Other methods
  //

  /**
   */
  public static void main(String[] args)
  {
  System.out.println("----- ESTUDIANTES -----");

        Estudiante e1 = new Estudiante("Maria", 20, "Femenino", 1001, 9.5, "Ingenieria");
        Estudiante e2 = new Estudiante("Pedro", 22, "Masculino", 1002, 8.7, "Medicina");
        Estudiante e3 = new Estudiante("Sofia", 19, "Femenino", 1003, 9.8, "Derecho");

        e1.DatosDeAlumnos(e1.getMatricula(), e1.getPromedio(), e1.getLicenciatura());
        System.out.println();

        e2.DatosDeAlumnos(e2.getMatricula(), e2.getPromedio(), e2.getLicenciatura());
        System.out.println();

        e3.DatosDeAlumnos(e3.getMatricula(), e3.getPromedio(), e3.getLicenciatura());


        System.out.println("\n----- PROFESORES -----");

        Profesor p1 = new Profesor("Dr. Ramirez", 50, "Masculino", 2001, 15000, "Matematicas");
        Profesor p2 = new Profesor("Dra. Lopez", 45, "Femenino", 2002, 16000, "Quimica");
        Profesor p3 = new Profesor("Dr. Hernandez", 55, "Masculino", 2003, 17000, "Fisica");

        p1.DatosDocente(p1.getIdTrabajador(), p1.getSalario(), p1.getDepartamento());
        System.out.println();

        p2.DatosDocente(p2.getIdTrabajador(), p2.getSalario(), p2.getDepartamento());
        System.out.println();

        p3.DatosDocente(p3.getIdTrabajador(), p3.getSalario(), p3.getDepartamento());
  }


}
