
public class TypeCasting {

	public static void main(String[] args) {
		int x = 7;    
		long y = x;   //automatically converts the integer type into long type  
		float z = y;  //automatically converts the long type into float type
		System.out.println("Int value "+x);  
		System.out.println("After conversion, long value "+y);  
		System.out.println("After conversion, float value "+z);  

	}

}
