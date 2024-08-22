/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package selenium;

/**
 *
 * @author PCASUSVIVOBOOK
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import static selenium.SuaThongTInTaiKhoan.driver;
import static selenium.TestTimKiemSP.driver;
public class TImKiemSP {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://newshop.vn/");
                
                //test case 1
//                driver.findElement(By.xpath("//input[@id='search-keyword']")).sendKeys("sách ngữ văn");
//                driver.findElement(By.xpath("//button[contains(text(),'Tìm kiếm')]")).click();
                
                 //test case 2
//                driver.findElement(By.xpath("//input[@id='search-keyword']")).sendKeys("");
//                driver.findElement(By.xpath("//button[contains(text(),'Tìm kiếm')]")).click();
                
                 //test case 3
//                driver.findElement(By.xpath("//input[@id='search-keyword']")).sendKeys("Sách Toán 9");
//                driver.findElement(By.xpath("//button[contains(text(),'Tìm kiếm')]")).click();
                
                 //test case 4
//                driver.findElement(By.xpath("//input[@id='search-keyword']")).sendKeys("afgsds");
//                driver.findElement(By.xpath("//button[contains(text(),'Tìm kiếm')]")).click();
                
                //test case 5
                driver.findElement(By.xpath("//input[@id='search-keyword']")).sendKeys("#$%@");
                driver.findElement(By.xpath("//button[contains(text(),'Tìm kiếm')]")).click();
    }
}
