package vishal;

public class StringPoolTest {

	public static void main(String[] args) {
		String s1 = "Saloni";
		String s2 = "Vishal";
		String s3 = "Saloni";
		
		String s4 = new String("Saloni");
		
		s3 = s3.substring(1, 5);
		
		System.out.println(s1+" "+s3);
		System.out.println(s1.equals(s4));
	}

}
