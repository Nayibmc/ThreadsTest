public class Thread1 extends Thread{
    static int a = 1;

    public void run(){
        while (a <= 10000){
            a++;
        }
    }


}
