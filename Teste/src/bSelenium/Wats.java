package quartoselenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wats {
	public static void main(String[] args) {
		Scanner ler 	= new Scanner(System.in);
		String op 		= "";
		String site 	= "https://web.whatsapp.com/";
		String conversa = "rascunhos";
		String frase 	= "hello world";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setPosition(new org.openqa.selenium.Point(900, 900));
		driver.manage().window().setSize(new org.openqa.selenium.Dimension(920,1080));
		driver.get(site);
		
		while (!op.equalsIgnoreCase("0")) {
			op = ler.next();
			driver.findElement(By.xpath("//*[@title=\""+ conversa + "\"]")).click();
			for (int i = 0; i < 20; i++) {
				frase = i + " teste";
				driver.findElement(By.className("input")).sendKeys(frase);
				driver.findElement(By.className("compose-btn-send")).click();
	//				String txt = driver.getPageSource();
	//				System.out.println(txt);
			}
		}
	}
}
/*
1 baixe o selenium-server-standalone-x.jar
2 clique sobre ele buid path, add to buid path
*/