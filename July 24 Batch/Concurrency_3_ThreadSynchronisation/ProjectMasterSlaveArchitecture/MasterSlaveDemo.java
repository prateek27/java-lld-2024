package Concurrency_3_ThreadSynchronisation.ProjectMasterSlaveArchitecture;

public class MasterSlaveDemo {
    public static void main(String[] args) {
        Master master = new Master();
        Slave slave = new Slave(master);

        Thread t1 = new Thread(()->{
           for(int i=0;i<=100;i++){
               master.addData("Row "+i);
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
        });

        Thread t2 = new Thread(()->{
            for(int i=0;i<=100;i++){
                master.addData("Row "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start(); //master
        t2.start(); //master
        slave.startSync();
    }
}
