
public class FinalMethodExample {

		   public final void display(){
		      System.out.println("Hello World");
		   }
		   public static void main(String args[]){
		      new FinalMethodExample().display();
		   }
}
		   /*class Sample extends FinalMethodExample{
		      //public void display() {        //Error gets generated
		       //  System.out.println("hi");
		   }
	}*/