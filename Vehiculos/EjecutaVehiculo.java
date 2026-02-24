

/**
 * Class EjecutaVehiculo
 */
public class EjecutaVehiculo {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  public EjecutaVehiculo () { };
  
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
  //Automovil
  Automovil au1 = new Automovil("volvo 550", 120, 4, 5, 4);
  au1.mostrarDatos();
  au1.pruebaDelMotor();

  // Moto
  Motocicleta mt1 = new Motocicleta("Italika",120,2,2);
  mt1.mostrarDatos();
  mt1.pruebaDelMotor();

  // Autobus
  Autobus ab1 = new Autobus("Mercedez",300,8,42,2,2);
  ab1.mostrarDatos();
  ab1.pruebaDelMotor();

  Autobus ab2 = new Autobus("Mercedez smart",250,6,25,1,1);
  ab2.mostrarDatos();
  ab2.pruebaDelMotor();
  
  }


}
