import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

public class TextReader {
	private String path;

	private static Logger logger = Logger.getLogger(TextReader.class.getName());

	private enum Marker {
		START, END
	};

	private TextReader(String path) {
		this.path = path;
	}

	private void execute() {
		ObjectList<String> valueList = new ObjectList<>();

		try (FileReader fr = new FileReader(path); BufferedReader br = new BufferedReader(fr)) {

			String line;
			while ((line = br.readLine()) != null) {
				valueList.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (String str : valueList) {
			System.out.println(str);
		}
	}

	public static void main(String... args) {
		logger.info(Marker.START.name());
		new TextReader(args[0]).execute();
		logger.info(Marker.END.name());
	}

}