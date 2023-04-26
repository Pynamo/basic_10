import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.IntStream;

public class Lambda {

	public static void main(String[] args) {

		LocalTime time = LocalTime.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
		IntStream stream = IntStream.range(1, 10000);

		System.out.println(time.format(df));
		System.out.println(" ");
		stream.forEach(System.out::println);
	}

}
