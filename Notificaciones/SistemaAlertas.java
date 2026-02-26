

/**
 * Class SistemaAlertas
 */
public class SistemaAlertas {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  public SistemaAlertas () { };
  
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
  EmailNotificacion email = new EmailNotificacion("Bienvenido!", "user@mail.com");
  email.enviar();       
  email.registrarLog(); 

  SMSNotificacion sms = new SMSNotificacion("Tu código es 1234", "+525512345678");
  sms.enviar();
  sms.registrarLog();
  }


}
