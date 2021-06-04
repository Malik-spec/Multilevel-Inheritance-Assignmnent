class Electronics{
	void device_type() {
		System.out.println("The is an electronic device");
	}
}

class Television extends Electronics{
	void category() {
		System.out.println("It belongs to the television category");
	}
}


class LED extends Television{
	void display_tech() {
		System.out.println("It is an LED technology");
	}
}
public class Q1 {

	public static void main(String[] args) {
		LED l = new LED();
		l.display_tech();
		l.category();
		l.device_type();
		
		

	}

}
