package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Ol� Pessoal".charAt(2));

		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
	}

}
