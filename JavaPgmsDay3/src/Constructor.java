
public class Constructor {
	public int i;
	public static void main(String[] args) {
		Constructor cp =  new Constructor();
		System.out.println(cp.i);
	}
	public Constructor() {
		i=20;
		System.out.println("Constructor is called");
	}
	public Constructor(int a) {
		i=a;

	}
}
