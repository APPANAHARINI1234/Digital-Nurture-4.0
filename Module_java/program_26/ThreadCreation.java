package program_26;
class FirstThread extends Thread {
    public void run() {
        try{
            Thread.sleep(1);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        for(int i=0;i<10;i++){
        System.out.println("first thread");
    }
}
}
class SecondThread implements Runnable{
    public void run(){
        for(int i=0;i<100;i++){
        System.out.println("second thread");
    }
     try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("second done");
    }
}
public class ThreadCreation {
    // two types of multitasking
    // 1. process based multitasking
    // 2.thread based multitasking
    // for threads we have five states
    // 1. new states
    // 2. active states -> runnable state, running state here runnable means ready to run 
    // 3. waiting states/blocked
    // 4. timed waiting states
    // 5.terminated states
    //  jvm provides default thread main
    //  create threads using :
    //   1. thread class
    //   2. implementing runnable interface
    //   use run method to run and start method in main to start thread and thread will starts by running run method
    //   concurrency problems:
    //   1. race condition 2.dead lock 3.livelock 3.thread starvation 4.priority inversion
    public static void main(String[] args) {
        FirstThread t1 = new FirstThread();
        SecondThread s2 = new SecondThread();
        Thread t2 = new Thread(s2);
        t1.start();
        t2.start();
    }
}
