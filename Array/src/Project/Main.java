package Project;

import java.util.Scanner;

public class Main {

	public static double avgTemp(double[] temp, int days) {
		double avg = 0;
		for(int i = 0;i < days;i++) {
			avg = avg + temp[i];
		}
		return (avg/days);
	}
	
	public static int checkDaysAboveAvgTemp(double[] temp, int days, double avg) {
		int day = 0;
		
		for(int i = 0;i < days;i++) {
			if(temp[i] > avg) {
				day++;
			}
		}
		return day;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("How many day's temperature ? ");
		int days = scan.nextInt();
		
		double temp[] = new double[days];
		
		for(int i = 0;i < days;i++) {
			System.out.print("Day " + i + "'s high temp : ");
			temp[i] = scan.nextDouble(); 
		}
		
		double avg = avgTemp(temp, days);
		System.out.println("\nAverage : " + avg);
		System.out.println(checkDaysAboveAvgTemp(temp, days, avg) + " day(s) above average.");

	}

}
