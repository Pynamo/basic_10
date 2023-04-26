
public class Person {

	public static void main(String[] args) {

		Person man = new Person(Gender.MAN.getValue());
		Person woman = new Person(Gender.WOMAN.getValue());

		man.speak();
		woman.speak();

	}

	public enum Gender {
		MAN("man"), WOMAN("woman");

		private final String gender;

		private Gender(String gender) {
			this.gender = gender;
		}

		public String getValue() {
			return this.gender;
		}
	}

	private String gender;

	public Person(String gender) {
		this.gender = gender;
	}

	public void speak() {
		System.out.println("I'm a " + gender);
	}

}
