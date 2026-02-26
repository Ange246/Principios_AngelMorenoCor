

/**
 * Class EmailNotificacion
 */
public class EmailNotificacion extends Notificacion implements Envia {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  public EmailNotificacion (String mensaje, String destinatario) {
  super(mensaje, destinatario);
  };
  
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
   * @param        mensaje
   * @param        destinatario
   */


  /**
   */
  public void enviar()
  {
  System.out.println("Enviando Email a " + destinatario + ": " + mensaje);
  }


}
