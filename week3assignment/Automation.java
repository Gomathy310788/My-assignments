package week3assignment;

public class Automation extends MultipleLanguage implements Language,Testtool{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automation obj=new Automation();
		obj.Java();
		obj.Python();
		obj.Ruby();
		obj.Selenium();
		
		
	}

	public void Python() {
		
		
		 System.out.println("Python method");

		}

	
	public void Selenium() {
		System.out.println("Selenium method");
		
	}

	public void Java() {
		System.out.println("Java method");
		
	}

	@Override
	public void Ruby() {
		System.out.println("Ruby method");
		
	}

}
