import java.util.HashMap;

public class Recorder {

	private HashMap<String, String> map;
	
	
	public Recorder() {
		map = new HashMap<>();
	}
	
	
	public void put(String key, String value) {
		map.put(key, value);
		System.out.println(key + " = " + value);
	}

	public void get(String key) {

		if(map.containsKey(key)) {
			System.out.println(map.get(key));
		} else {
			IllegalArgumentException e = new IllegalArgumentException();
			throw e;
		}
	}

	public void delete(String key) throws IllegalArgumentException {
		
		if(map.containsKey(key)) {
			map.remove(key);
			System.out.println("deleted: " + key);
		} else {
			IllegalArgumentException e = new IllegalArgumentException();
			throw e;
		} 
		
	}

	public void delete() {
		map.clear();
	}

}
