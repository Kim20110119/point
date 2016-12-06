package pointtown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Pointtown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","lib/chromedriver.exe");
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--proxy-server=http://43.247.33.158:8080");
        option.addArguments("--proxy-bypass-list=localhost");
        WebDriver driver = new ChromeDriver(option);
//        WebDriver driver = new ChromeDriver();
        driver.get("https://www.pointtown.com/ptu/show_login.do");
        // 「メールアドレス」
        driver.findElement(By.name("uid")).sendKeys("kimyea.006@gmail.com");
        // 「パスワード」
        driver.findElement(By.name("pass")).sendKeys("20110119Jjz");
        // 「ログインボタン」
        driver.findElement(By.xpath("//input[@alt='ログイン']")).click();
        // 「秘密回答」
        driver.findElement(By.name("answer")).sendKeys("めいこ");
        // 「送信」
        driver.findElement(By.xpath("//input[@alt='送信']")).click();

	}

}
