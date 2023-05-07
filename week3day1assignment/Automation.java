package week3day1assignment;

public class Automation extends MultipleLanguage implements Language, TestTool {
	
	public void Selenium() {
		System.out.println("Testing Tool is Selenium..");
	}

	public void Java() {
		System.out.println("Programming Language is Java..");		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation au = new Automation();
		au.Selenium();
		au.Java();
		au.python();
	}
}
