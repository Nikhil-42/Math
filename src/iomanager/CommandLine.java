/**
 * 
 */
package iomanager;

/**
 * @author kapow
 *
 */
public class CommandLine {
	
	public static void runCommand(String command) {
		String[] arguments = null;
		int latestArg = 0;
		boolean hasArgs;
		
		try {
			if (command.indexOf(" ") != -1) {
				arguments = command.substring(command.indexOf(" ") + 1).split(" ");
				command = command.substring(0, command.indexOf(" "));
				hasArgs = true;
			} else {
				arguments = new String[0];
				hasArgs = false;
			}
			switch (command) {
			case "exit":
			case "close":
				latestArg = 0;
				if (hasArgs)
					System.exit(Integer.parseInt(arguments[latestArg]));
				else
					System.exit(0);
				break;
			case "clear":
				((CustomOutputStream) ((CustomPrintStream) System.out).getOut()).clear();
				break;
			case "windowlist":
				
				break;
			default:
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
}
