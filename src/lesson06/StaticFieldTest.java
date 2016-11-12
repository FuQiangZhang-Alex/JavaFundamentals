package lesson06;

public class StaticFieldTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticField sf = new StaticField();
		StaticField sf1 = new StaticField();
		StaticField.setName(5);
		StaticField.setName(6);
		System.out.println(sf.getName());

	}

}
