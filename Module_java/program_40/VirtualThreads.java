package program_40;

public class VirtualThreads {
    //unlike traditional these are managed by jvm not os
    //introduced in java 21
    public static void main(String[] args) {
        //testing performance by creating 100000 threads both virtual and traditional
        // for(int i=0;i<1000000;i++){
        //     Thread.startVirtualThread(()->{
        //         System.out.println("hello from virtual "+i);
        //     });
        // }
        for(int i=0;i<10000000;i++){
            new Thread(()->{
                System.out.println("traditional ");
            }).start();
        }
    }
}
