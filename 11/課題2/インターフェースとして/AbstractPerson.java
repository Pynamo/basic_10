public interface AbstractPerson {
	public String getGender();

	public default void speak() {
		System.out.println("I'm a " + getGender());
	}
}

/*
 * public abstract class AbstractPerson {
 * 
 * abstract String getGender();
 * 
 * public void speak() { System.out.println("I'm a " + getGender()); } }
 */
