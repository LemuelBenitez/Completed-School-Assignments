package OS_Final;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class fcfs {
    private List<Process> processes_list;

    public fcfs(List<Process> processes_list) {
        this.processes_list = processes_list;
    }

    public void start() {

        List<Process> ready_queue = new ArrayList<>();

        int timer = 0;
        int num_of_processed = 0;

        int ready_queue_front = 0;
        int ready_queue_back = 0;

        boolean processor_busy = false;
        int processor_busy_until = -1;
        Process process_in_progress = null;


        while(num_of_processed < processes_list.size()) { 

            List<Process> tempArrivedProcesses = arrivedProcesses(timer);
            if(tempArrivedProcesses.size() > 0) {
                for(Process p : tempArrivedProcesses) {
                    ready_queue.add(ready_queue_back++, p);
                }
            }

            if(processor_busy) {

               
                if(processor_busy_until <= timer) {
                    processor_busy = false;
                    num_of_processed++;
                    updateTurnAroundTimeAndWaitTime(process_in_progress.getProcess_id(), timer);
                }

            }

            if(!processor_busy) {
                if(ready_queue_back > ready_queue_front) {
                    process_in_progress = ready_queue.get(ready_queue_front++);
                    updateResponseTime(process_in_progress.getProcess_id(), timer);
                    processor_busy_until = timer + process_in_progress.getBurst_time();
                    processor_busy = true;

                } else {
                    processor_busy_until = -1;
                    process_in_progress = null;
                }

            }

            System.out.println("t=" + timer + " >> " + (process_in_progress != null ? process_in_progress.getProcess_id() : "IDLE"));

            timer++;
        }


    }

    private List<Process> arrivedProcesses(int timer) {
        return processes_list.stream()
                .filter(p -> p.getArrival_time() == timer)
                .collect(Collectors.toList());
    }

    private void updateResponseTime(String pid, int response_t) {

        processes_list.stream()
                .filter(p -> p.getProcess_id()!=null &&  p.getProcess_id().equals(pid))
                .forEach(p -> p.setResponse_time(response_t));
    }

    private void updateTurnAroundTimeAndWaitTime(String pid, int completion_t) {

        processes_list.stream()
                .filter(p -> p.getProcess_id()!=null &&  p.getProcess_id().equals(pid))
                .forEach(p -> {
                    p.setTurnaround_time(completion_t - p.getArrival_time());
                    p.setWait_time(p.getTurnaround_time() - p.getBurst_time());
                });
    }

}