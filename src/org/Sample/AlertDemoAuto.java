package org.Sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemoAuto {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\SeliniumDay6\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement btnClick = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		
		btnClick.click();
		
		//button[text()='click the button to demonstrate the prompt box ']
		
		WebElement bthClickDemo = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
	
		bthClickDemo.click();
		
		Alert al = driver.switchTo().alert();
		
		al.sendKeys("Gayathri");
		
		String text = al.getText();
		
		System.out.println(text);
		
		al.accept();
		
		//p[text()='Hello Gayathri How are you today']
		
		WebElement element = driver.findElement(By.xpath("//p[text()='Hello Gayathri How are you today']"));
		
		String text2 = element.getText();
		
		System.out.println(text2);
	}

}
