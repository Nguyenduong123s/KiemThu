/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
public class SuaThongTInTaiKhoan {

	static WebDriver driver;
	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://newshop.vn/");
//                WebElement ho_ten = driver.findElement(By.xpath("//input[@id='inputName']"));
//                WebElement sdt = driver.findElement(By.xpath("//input[@id='inputPhone']"));
//                WebElement email = driver.findElement(By.xpath("//input[@id='inputEmail']"));
//                WebElement gt = driver.findElement(By.xpath("//select[@name='gender']"));
//                Select gioi_tinh = new Select(gt);
//                WebElement ngay = driver.findElement(By.cssSelector("select[name='birthday[day]']"));
//                WebElement thang = driver.findElement(By.cssSelector("select[name='birthday[month]']"));
//                WebElement nam = driver.findElement(By.cssSelector("select[name='birthday[year]']"));
//                Select day = new Select(ngay);
//                Select month = new Select(thang);
//                Select year = new Select(nam);
                //login
                WebElement btn_dn = driver.findElement(By.xpath("//ul[@id='menuMember']//li//a[@href='#'][contains(text(),'Đăng nhập')]"));
                btn_dn.click();
                Thread.sleep(1000);
                WebElement tk = driver.findElement(By.xpath("//form[@action='https://newshop.vn/login']//input[@placeholder='Email của bạn']"));
                tk.sendKeys("nd113112003@gmail.com");
                Thread.sleep(1000);
                WebElement mk = driver.findElement(By.xpath("//form[@action='https://newshop.vn/login']//input[@placeholder='Mật khẩu']"));
                mk.sendKeys("0912168266");
                Thread.sleep(1000);
                WebElement button_login = driver.findElement(By.xpath("//button[contains(text(),'Đăng nhập')]"));
                button_login.click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("//ul[@id='menuMember']//a[contains(text(),'Tài khoản')]")).click();
                Thread.sleep(1000);
////                //test case 1
//                driver.findElement(By.xpath("//input[@id='inputName']")).clear();
//                driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Nguyễn Xuân Dương");
//                driver.findElement(By.xpath("//input[@id='inputPhone']")).clear();
//                driver.findElement(By.xpath("//input[@id='inputPhone']")).sendKeys("098701112");
//                driver.findElement(By.xpath("//input[@id='inputEmail']")).clear();
//                driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys("dd15919@gmail.com");
//                WebElement gt = driver.findElement(By.xpath("//select[@name='gender']"));
//                Select gioi_tinh = new Select(gt);
//                gioi_tinh.selectByIndex(1);
//                driver.findElement(By.xpath("//button[@class='button-save']")).click();	
                
                
                 //test case 2
//                driver.findElement(By.xpath("//input[@id='inputName']")).clear();
//                driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Nguyễn Xuân Dương");
//                driver.findElement(By.xpath("//input[@id='inputPhone']")).clear();
//                driver.findElement(By.xpath("//input[@id='inputPhone']")).sendKeys("");
//                driver.findElement(By.xpath("//input[@id='inputEmail']")).clear();
//                driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys("dd123591@gmail.com");
//                WebElement gt = driver.findElement(By.xpath("//select[@name='gender']"));
//                Select gioi_tinh = new Select(gt);
//                gioi_tinh.selectByIndex(1);
//                driver.findElement(By.xpath("//button[@class='button-save']")).click();	
                
//                //test case 3
//                driver.findElement(By.xpath("//input[@id='inputName']")).clear();
//                driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Nguyễn Xuân Dương");
//                driver.findElement(By.xpath("//input[@id='inputPhone']")).clear();
//                driver.findElement(By.xpath("//input[@id='inputPhone']")).sendKeys("0987601112");
//                driver.findElement(By.xpath("//input[@id='inputEmail']")).clear();
//                driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys("dd591321");
//                WebElement gt = driver.findElement(By.xpath("//select[@name='gender']"));
//                Select gioi_tinh = new Select(gt);
//                gioi_tinh.selectByIndex(1);
//                driver.findElement(By.xpath("//button[@class='button-save']")).click();
                 //test case 4
//                driver.findElement(By.xpath("//input[@id='inputName']")).clear();
//                driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("");
//                driver.findElement(By.xpath("//input[@id='inputPhone']")).clear();
//                driver.findElement(By.xpath("//input[@id='inputPhone']")).sendKeys("0987601112");
//                driver.findElement(By.xpath("//input[@id='inputEmail']")).clear();
//                driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys("dd1591@gmail.com");
//                WebElement gt = driver.findElement(By.xpath("//select[@name='gender']"));
//                Select gioi_tinh = new Select(gt);
//                gioi_tinh.selectByIndex(1);
//                driver.findElement(By.xpath("//button[@class='button-save']")).click();

                 //test case 5
                driver.findElement(By.xpath("//input[@id='inputName']")).clear();
                driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Nguyễn Xuân Dương");
                driver.findElement(By.xpath("//input[@id='inputPhone']")).clear();
                driver.findElement(By.xpath("//input[@id='inputPhone']")).sendKeys("0aaaaaaaaaaa");
                driver.findElement(By.xpath("//input[@id='inputEmail']")).clear();
                driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys("dd15d91@gmail.com");
                WebElement gt = driver.findElement(By.xpath("//select[@name='gender']"));
                Select gioi_tinh = new Select(gt);
                gioi_tinh.selectByIndex(1);
                driver.findElement(By.xpath("//button[@class='button-save']")).click();	
                
	}
}
