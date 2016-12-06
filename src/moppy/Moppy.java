package moppy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import common.sindan.WebSindan;

public class Moppy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","lib/chromedriver.exe");
		// Chromeドライバー
		WebDriver driver = new ChromeDriver();
		try{
			Boolean end = WebSindan.execute(driver,"http://shindan-apps.net/pointi?uid=38800457205gf69hj2rpgrofhp8v",0,1);
			System.out.println(end);
			driver.quit();
		}catch(Exception e){
			System.out.println("==========error==================");
			driver.quit();
		}


	}

}
