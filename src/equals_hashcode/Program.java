package equals_hashcode;

public class Program {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Maria", "email.com");
		Cliente c2 = new Cliente("Maria", "email2.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
	}
}
