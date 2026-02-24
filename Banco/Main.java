

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
   * @param        _args
   */
  public static void main(String[] args)
  {
  CuentaBancaria cb1 = new CuentaBancaria(1000.0);
  
  System.out.println("Saldo inicial = " + cb1.getSaldo());
  cb1.depositar(500.0);
  cb1.retirar(1500.0);
  System.out.println("Saldo actual: " + cb1.getSaldo());
  cb1.retirar(100.0);
  
  }


}
