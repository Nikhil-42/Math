package iomanager;

public class Command {
	
	private String call;
	private Runnable output;
	
	public Command (String call, Runnable output) {
		this.call= call;
		this.output = output;
	}
	
	public boolean tryCommand(String input, String[] args) {
		if(input.equals(call)) {
			output.run();
			return true;
		} else
			return false;
	}

}
