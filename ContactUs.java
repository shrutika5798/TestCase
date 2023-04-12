package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class ContactUs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\HP\\\\Desktop\\\\selenium resources\\\\chromedriver_win32\\\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
//navigate to page url
driver.get("https://techpub-connect-demo.netlify.app/html/contactus.html");
//scroll downpage
JavascriptExecutor down= (JavascriptExecutor) driver;
down.executeScript("window.scrollBy(0,500)","");
//enter name
driver.findElement(By.xpath("//input[@placeholder='John Doe']")).sendKeys("shrutika");
driver.findElement(By.xpath("//div[@class='reg-form-wrapper mb-30']//div[1]//input[1]")).sendKeys("4554665678");
driver.findElement(By.xpath("//div[@class='col-lg-6 mb-30']//input[@type='text']")).sendKeys("shrutikagiramkar@gmail.com");
driver.findElement(By.xpath("//div[@class='reg-form-wrapper mb-30']//div[1]//input[1]")).sendKeys("regarding contact");
driver.findElement(By.xpath("//textarea[@id='commnent']")).sendKeys("gddfhuhugh");
driver.findElement(By.xpath("//button[@class='theme_btn border_btn active mt-20']")).submit();
 driver.findElement(By.xpath("//form[@class='subscribe-form sub-form-2']//input[@type='text']")).sendKeys("shrutikagiramkar@gmail.com");
driver.findElement(By.xpath("//button[@class='sub_btn']")).click();
//contact us footer
driver.findElement(By.xpath("//a[normalize-space()='info@example.com']")).click();
System.out.println("It will scroll to contact us");
JavascriptExecutor js= (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,700)","");
driver.findElement(By.xpath("//a[normalize-space()='+00 235 695 58']")).click();
System.out.println("It will scroll to contact us");
JavascriptExecutor js1= (JavascriptExecutor) driver;
js1.executeScript("window.scrollBy(0,700)","");
driver.findElement(By.xpath("//a[normalize-space()='Terms & Conditions']")).click();
System.out.println("It will scroll to contact us");
JavascriptExecutor js2= (JavascriptExecutor) driver;
js2.executeScript("window.scrollBy(0,700)","");
driver.findElement(By.xpath("//a[normalize-space()='Privacy Policy']")).click();
System.out.println("It will scroll to contact us");
JavascriptExecutor js3= (JavascriptExecutor) driver;
js3.executeScript("window.scrollBy(0,700)","");
driver.findElement(By.xpath("//a[normalize-space()='Contacts']")).click();
System.out.println("It will redirect to contact us ");
JavascriptExecutor js4= (JavascriptExecutor) driver;
js4.executeScript("window.scrollBy(0,700)","");
driver.findElement(By.xpath("//a[normalize-space()='Our Careers']")).click();
System.out.println("It will scroll to contact us");
JavascriptExecutor js5= (JavascriptExecutor) driver;
js5.executeScript("window.scrollBy(0,700)","");
driver.findElement(By.xpath("//a[normalize-space()='About US']")).click();
System.out.println("It will navigate to about us page");
JavascriptExecutor js6= (JavascriptExecutor) driver;
js6.executeScript("window.scrollBy(0,700)","");
driver.findElement(By.xpath("//a[normalize-space()='Explore Pages']")).click();
System.out.println("It will scroll to about us page");
JavascriptExecutor js7= (JavascriptExecutor) driver;
js7.executeScript("window.scrollBy(0,700)","");
driver.findElement(By.xpath("//a[normalize-space()='Our Services']")).click();
System.out.println("It will scroll to about us page");
JavascriptExecutor js8= (JavascriptExecutor) driver;
js8.executeScript("window.scrollBy(0,700)","");
driver.findElement(By.xpath("//a[normalize-space()='Destinations']")).click();
System.out.println("It will scroll to about us page");
JavascriptExecutor js9= (JavascriptExecutor) driver;
js9.executeScript("window.scrollBy(0,700)","");
driver.findElement(By.xpath("//a[normalize-space()='Home Page']")).click();
System.out.println("It will navigate to home page");
JavascriptExecutor js10= (JavascriptExecutor) driver;
js10.executeScript("window.scrollBy(0,700)","");
driver.findElement(By.xpath("//a[normalize-space()='Testimonials']")).click();
System.out.println("It will navigate to home page");
JavascriptExecutor js11= (JavascriptExecutor) driver;
js11.executeScript("window.scrollBy(0,700)","");
driver.findElement(By.xpath("//a[normalize-space()='Latest News']")).click();
System.out.println("It will  navigate to page not found ");
driver.findElement(By.xpath("//a[@id='back-link']")).click();
JavascriptExecutor js12= (JavascriptExecutor) driver;
js12.executeScript("window.scrollBy(0,700)","");
driver.findElement(By.xpath("//a[normalize-space()='Help Center']")).click();
System.out.println("It will  navigate to home page");
JavascriptExecutor js13= (JavascriptExecutor) driver;
js13.executeScript("window.scrollBy(0,700)","");
	}

}
