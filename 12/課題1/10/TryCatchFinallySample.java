import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TryCatchFinallySample {
	
	public static void main(String[] args) {

		Logger logger = Logger.getLogger(TryCatchFinallySample.class.getName());
		ConsoleHandler consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(Level.INFO);
		logger.addHandler(consoleHandler);
		
		try {
			//System.out.println("try");
			logger.warning("try");
			Integer.parseInt(args[0]);
			
		} catch(NumberFormatException e) {
			//System.out.println("catch");
			logger.severe("catch");
		} finally {
			//System.out.println("finally");
			logger.info("finally");
		}
	}
}