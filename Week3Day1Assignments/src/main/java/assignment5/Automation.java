package assignment5;

public class Automation extends MultipleLanguge{
	
	public void java() {
		System.out.println("We are using Java in automation");
	}
	public void selenium() {
		System.out.println("We are using 4.6 version of selenium in automation");
	}
	public void ruby() {
		System.out.println("We can also use ruby in selenium");
	}
	public static void main(String[] args) {
		Automation testLeaf=new Automation();
		testLeaf.java();
		testLeaf.selenium();
		testLeaf.ruby();
		testLeaf.python();	

	}

}
