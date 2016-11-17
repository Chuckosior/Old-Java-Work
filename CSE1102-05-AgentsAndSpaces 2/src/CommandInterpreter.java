
// Project 5: Agents and Spaces2
// CSE1102 Spring 2015
// Chris Kosior
// 3/29/2015
// TA: Yusuf Albayram
// Section: 12
// Instructor: Jeffrey A. Meunier

import java.io.File;
import java.util.*;

import jeff.imagewindow.*;
import jeff.textconsole.*;

public class CommandInterpreter {
	private static void _showImage(ImageWindow imageWindow, Agent agent)
	{
		String imageName = agent.getLocation().getImageName();
		File imageDir = new File("data", "images");
		File imageFile = new File(imageDir, imageName);
		imageWindow.loadImage(imageFile);
	}
	public static void run(Agent agent, ImageWindow imageWindow, TextConsole textConsole) {

		Scanner kbd = new Scanner(System.in);
		boolean loopControl = true;
		textConsole.println(agent.toStringLong());
		CommandInterpreter._showImage(imageWindow, agent);
		do {
			textConsole.print("==>");
			String input = textConsole.readLine();
			if (input.equals("help")) {
				textConsole.println("Possible Commands: " 
						+ "\n" + "-help"
						+ "\n" + "-go" 
						+ "\n" + "-look" 
						+ "\n" + "-where"
						+ "\n" + "-quit");
			} else if (input.equals("go")) {
				CommandInterpreter._showImage(imageWindow, agent);
				agent.usePortal(textConsole);
			} else if (input.equals("look")) {
				textConsole.println(agent.getLocation().toStringLong());
			} else if (input.equals("where")) {
				textConsole.println(agent.getName() + " is in " + agent.getLocation().toString());
			} else if (input.equals("quit")) {
				loopControl = false;
			} else {
				textConsole.println("Sorry, I don't understand " + input);
			} 

		} while(loopControl);
		System.exit(0);
	}
}
