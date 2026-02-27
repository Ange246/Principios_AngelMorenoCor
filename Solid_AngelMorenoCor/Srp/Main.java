public class Main {

    public static void main(String[] args) {

        Usuario us1 = new Usuario("Angel", "angel@mail.com");

        UsuarioRepository rp1 = new UsuarioRepository();
        rp1.guardar(us1);

        EmailService es1 = new EmailService();
        es1.enviarBienvenida(us1);
    }
}
