package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			System.out.println("Sunday Sundae :)");
			break;
		case "Monday":
			System.out.println("Mondays - D:");
			break;
		case "Tuesday":
			System.out.println("You get a taco! You get a taco! YOU get a taco!");
			break;
		case "Wednesday":
			System.out.println("silent d");
			break;
		case "Thursday":
			System.out.println("Only one more day...");
			break;
		case "Friday":
			System.out.println("Let's go!");
			break;
		case "Saturday":
			System.out.println("First day of the weekend! Yay!");
			break;
		}
	}
}
