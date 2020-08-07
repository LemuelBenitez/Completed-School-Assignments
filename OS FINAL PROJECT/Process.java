package OS_Final;

public class Process {

	private String process_id;
	private int arrival_time;
	private int burst_time;

	private int wait_time;
	private int response_time = -1;
	private int turnaround_time;

	public Process(String process_id, int arrival_time, int burst_time) {
		this.process_id = process_id;
		this.arrival_time = arrival_time;
		this.burst_time = burst_time;
	}

	
	@Override
	public String toString() {
		return this.process_id + " : "
				+ "at=" + this.arrival_time + ", "
				+ "bt=" + this.burst_time + ", "
				+ "wt=" + this.wait_time + ", "
				+ "rt=" + this.response_time + ", "
				+ "tt=" + this.turnaround_time ;
		
	}

	public String getProcess_id() {
		return process_id;
	}

	public int getArrival_time() {
		return arrival_time;
	}
	
	public int getBurst_time() {
		return burst_time;
	}
	
	public int getResponse_time() {
		return response_time;
	}
	
	public int getWait_time() {
		return wait_time;
	}
	
	public int getTurnaround_time() {
		return turnaround_time;
	}
	
	public void setProcess_id(String process_id) {
		this.process_id = process_id;
	}


	public void setArrival_time(int arrival_time) {
		this.arrival_time = arrival_time;
	}

	public void setBurst_time(int burst_time) {
		this.burst_time = burst_time;
	}

	public void setWait_time(int wait_time) {
		this.wait_time = wait_time;
	}

	public void setResponse_time(int response_time) {
		this.response_time = response_time;
	}

	public void setTurnaround_time(int turnaround_time) {
		this.turnaround_time = turnaround_time;
	}
}
