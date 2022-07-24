package week3.day1;

public class Automation extends MultipleLanguage implements Language,TestTool{

	@Override
	public void ruby() {
		System.out.println("Ruby Language");		
	}

	public void selenium() {
		System.out.println("Selenium Webdriver");		
	}

	public void java() {
		System.out.println("Java Language");		
	}
public static void main(String[] args) {
	Automation newAutomation=new Automation();
	newAutomation.java();
	newAutomation.selenium();
	newAutomation.python();
	newAutomation.ruby();
			
}
}
