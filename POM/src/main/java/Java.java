
public class Java {

	public static void main(String[] args) {
		String txt = "AMAZON INDIA";
		
		for (int i = 0; i < txt.length(); i++) {
			
			char charAt = txt.charAt(i);
			charAt--;
			//String next = String.valueOf( (char) (charAt + 1));
		System.out.println(charAt);
		}

	}

}
