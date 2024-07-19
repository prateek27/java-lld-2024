package Concurrency_3_ThreadSynchronisation.ProjectMasterSlaveArchitecture;
import java.util.ArrayList;
import java.util.List;

public class Master {
    private List<String> dataList; //thread safe alternative arraylist

    Master(){
        dataList = new ArrayList<>();
    }
    synchronized void addData(String data){
        System.out.println("Adding "+data + " to master");
        dataList.add(data);
    }
    //method that helps in doing an increment fetch
    List<String> getUpdatesSinceLastSync(int lastReadIdx){
        List<String> updates = dataList.subList(lastReadIdx, dataList.size());
        return updates;
    }
}
