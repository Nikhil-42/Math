/**
 * 
 */
package iomanager;

import java.util.ArrayList;

/**
 * @author kapow
 *
 */
public class CommandLine {
	
	public static ArrayList<Command> availableCommands;
	public static int latestArg;
	public static String[] arguments;
	public static boolean hasArgs;
	
	public static void runCommand(String command) {	
		
		try {
			if (command.indexOf(" ") != -1) {
				arguments = command.substring(command.indexOf(" ") + 1).split(" ");
				command = command.substring(0, command.indexOf(" "));
				hasArgs = true;
			} else {
				arguments = new String[0];
				hasArgs = false;
			}
			availableCommands.add(new Command("exit", new Runnable() {
				public void run() {
					latestArg = 0;
					if (hasArgs)
						System.exit(Integer.parseInt(arguments[latestArg]));
					else
						System.exit(0);
				}
			}));
			switch (command) {
			case "exit":
			case "close":
				
				break;
			case "clear":
				((CustomOutputStream) ((CustomPrintStream) System.out).getOut()).clear();
				break;
			default:
				for (Command c: availableCommands) {
					c.tryCommand(command, arguments);
				}
				System.out.println("'" + command + "' is not recognized as an internal command.");
				break;
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("This is not recognized as an internal command.");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("Invalid argument : '" + arguments[latestArg] + "'");
			e.printStackTrace();
		}
	}
	
	public static void addCommand(Command c) {
		availableCommands.add(c);
	}
}
