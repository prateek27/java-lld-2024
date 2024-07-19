package Concurrency_3_ThreadSynchronisation.ProjectMasterSlaveArchitecture;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Slave {
    private Master master;
    int lastReadIdx;
    private ScheduledExecutorService executorService;
    //Todo: Add Data-list

    public Slave(Master master){
        this.master = master;
        this.lastReadIdx = 0;
        executorService = Executors.newScheduledThreadPool(1);
    }
    public void startSync(){
        executorService.scheduleAtFixedRate(this::syncWithMaster,0,5, TimeUnit.SECONDS);
    }
    private void syncWithMaster(){
        List<String> updates = master.getUpdatesSinceLastSync(lastReadIdx);
        for(String u:updates){
            //add it to the slave's data
            // processing
            System.out.println("Processing Update " + u);
            //Add to the database
        }
        this.lastReadIdx += updates.size();
    }

    private void stopSync(){
        executorService.shutdown();
    }
}
