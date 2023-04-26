
public class GenderSpeaker {

	public static void main(String[] args) {

		AbstractPerson man = new Man();
		AbstractPerson woman = new Woman();

		doSpeak(man);
		doSpeak(woman);

	}

	public static void doSpeak(AbstractPerson abstractPerson) {
		abstractPerson.speak();
	}

}
