package dummyJavaPackage;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DummyPrgm {

	public static void main(String[] args) {
		System.out.println("hai this is dummy java prgm");
		System.out.println("new line added in Dummy prgm");
		//hi
		System.out.println("new line added through Git Repo");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
}
