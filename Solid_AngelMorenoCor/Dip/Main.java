public class Main {

    public static void main(String[] args) {

        Dispositivo blla1 = new Bombilla();
        Interruptor itor1 = new Interruptor(blla1);

        itor1.presionar();
    }
}
