package control;
import java.io.*;

public class Access {

	public static void main(String[] args) throws IOException
	{
		if(args.length != 1)
		{
			System.out.println("invalid command, only 1 argument accepted");
			//create a log and write to it as well
			System.exit(1);
		}
		String filePath = args[0];
		String instruction;
		BufferedReader getCommands = new BufferedReader(new FileReader(filePath));
		while((instruction = getCommands.readLine()) != null)
		{
			//insert command handler here to parse instructions and call appropriate class
		}
		
		//SYNC TEST SYNC TEST6666
	}
	
	
	
}
