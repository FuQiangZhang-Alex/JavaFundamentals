package lesson06;

public class StaticField {
	
	private static int name = 0;

	public static int getName() {
		return name;
	}

	public static void setName(int name) {
		StaticField.name = name;
	}
	
	

}
