public class Thread2 extends Thread{
    public void run() {
        while ((Thread1.a)%500 == 0){
            System.out.println(Thread1.a);
        }
    }
}
