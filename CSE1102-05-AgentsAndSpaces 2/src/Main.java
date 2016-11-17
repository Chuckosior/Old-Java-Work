import java.io.File;

import jeff.imagewindow.ImageWindow;
import jeff.textconsole.TextConsole;

// Project 5: Agents and Spaces2
// CSE1102 Spring 2015
// Chris Kosior
// 3/29/2015
// TA: Yusuf Albayram
// Section: 12
// Instructor: Jeffrey A. Meunier

public class Main {
	public static void main(String[] args) {
		//given to us by Jeff
		 TextConsole console = TextConsole.create();
		 ImageWindow imageWindow = new ImageWindow();
		 File configFile = new File("data", "config.ini");
		 ConfigLoader cl = new ConfigLoader(configFile);
		 Agent a = cl.buildAll();
		 CommandInterpreter.run(a, imageWindow, console); 
	}
}

