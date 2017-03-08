public class Principal {
    public static void main(String[] args) {
        Thread1 hilo1 = new Thread1();
        Thread2 hilo2 = new Thread2();
        hilo2.start();
        hilo1.start();
    }

}
