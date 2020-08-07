package OS_Final;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class run {

	public static void main(String[] args) throws FileNotFoundException {

		List<Process> processes_list = new ArrayList<>();
      
		// replace args[0] to run in compiler
		String fileName = args[0];
			
       try {
	    File file = new File(fileName); 
	    Scanner fileReader = new Scanner(file);
		while(fileReader.hasNextLine()) {
			processes_list.add(new Process(fileReader.next(), fileReader.nextInt(), fileReader.nextInt()));
		}
			fileReader.close();
		System.out.println("\nInitial processes_list: ");
		for(int i=0; i<processes_list.size(); i++) {
			System.out.println(processes_list.get(i));
		}
       }catch (Exception e) {
    	   e.printStackTrace();
       }
       
		Scanner scn = new Scanner(System.in);
		System.out.print("Select which algorithm to run the processes with FCFS (f/F) or RoundRobin (R/r): \n");
		String answer = scn.next();
		scn.close();
		
		switch(answer) {
		 
		case "F":
			fcfs fcfs = new fcfs(processes_list);
			fcfs.start();
			
			double sum_wait_time = 0.0;
			double sum_response_time = 0.0;
			double sum_turn_around_time = 0.0;

			System.out.println("\nFinal processes_list: ");
			for(int i=0; i<processes_list.size(); i++) {
				System.out.println(processes_list.get(i));

				sum_wait_time += processes_list.get(i).getWait_time();
				sum_response_time += processes_list.get(i).getResponse_time();
				sum_turn_around_time += processes_list.get(i).getTurnaround_time();

			}
			System.out.println("The average wait time is: " + (sum_wait_time / processes_list.size()));
			System.out.println("The average response time is: " + (sum_response_time / processes_list.size()));
			System.out.println("The average turn around time is: " + (sum_turn_around_time / processes_list.size()));

			break;
			
		case "f":
			fcfs cheetoes = new fcfs(processes_list);
			cheetoes.start();
			double wait2_time = 0.0;
			double response2_time = 0.0;
			double turn_around2_time = 0.0;
			double burst_time= 0.0;

			System.out.println("\nFinal processes_list: ");
			for(int i=0; i<processes_list.size(); i++) {
				System.out.println(processes_list.get(i));

				wait2_time += processes_list.get(i).getWait_time();
				response2_time += processes_list.get(i).getResponse_time();
				turn_around2_time += processes_list.get(i).getTurnaround_time();

			}
			System.out.println("The average wait time is: " + (wait2_time / processes_list.size()));
			System.out.println("The average response time is: " + (response2_time / processes_list.size()));
			System.out.println("The average turn around time is: " + (turn_around2_time / processes_list.size()));

			break;
			
		case "R":
			roundRobin bird = new roundRobin(processes_list);
			bird.start();
			
			double wait3_time = 0.0;
			double response3_time = 0.0;
			double turn_around3_time = 0.0;

			System.out.println("\nFinal processes_list: ");
			for(int i=0; i<processes_list.size(); i++) {
				System.out.println(processes_list.get(i));

				wait3_time += processes_list.get(i).getWait_time();
				response3_time += processes_list.get(i).getResponse_time();
				turn_around3_time += processes_list.get(i).getTurnaround_time();

			}
			System.out.println("The average wait time is: " + (wait3_time / processes_list.size()));
			System.out.println("The average response time is: " + (response3_time / processes_list.size()));
			System.out.println("The average turn around time is: " + (turn_around3_time / processes_list.size()));

		    break;
		    
		case "r":
			roundRobin bird1 = new roundRobin(processes_list);
			bird1.start();

			double wait4_time = 0.0;
			double response4_time = 0.0;
			double turn_around4_time = 0.0;

			System.out.println("\nFinal processes_list: ");
			for(int i=0; i<processes_list.size(); i++) {
				System.out.println(processes_list.get(i));

				wait4_time += processes_list.get(i).getWait_time();
				response4_time += processes_list.get(i).getResponse_time();
				turn_around4_time += processes_list.get(i).getTurnaround_time();

			}
			System.out.println("The average wait time is: " + (wait4_time / processes_list.size()));
			System.out.println("The average response time is: " + (response4_time / processes_list.size()));
			System.out.println("The average turn around time is: " + (turn_around4_time / processes_list.size()));

		
		    break;
		    
		    default:
		    	System.out.println("Restart the program, you've entered an invalid value.\n You can only enter F/f and R/r.");
		}
	}

}