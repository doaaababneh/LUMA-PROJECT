import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sigup {
	SoftAssert myaAssertion=new SoftAssert();
	WebDriver driver= new ChromeDriver();
	@BeforeTest 
	public void Randlangage() {
		
		driver.get("https://magento.softwaretestingboard.com/");
	}
	
//	@Test()
//	public void mytest1() throws InterruptedException {
//		
//		driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("doaa");
//		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("ababneh");
//		driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys("doaaababneh1111@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Ababneh11Doaa");
//		driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]")).sendKeys("Ababneh11Doaa");
//		driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button")).click();
//		
//		driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("doaaababneh1111@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Ababneh11Doaa");
//		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
//		Thread.sleep(5000);
//        String wlcomemsg  =driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[1]/span")).getText();
//		SoftAssert myaAssertion=new SoftAssert();
//		Boolean checkTheWord =wlcomemsg.contains("Welcome");
//		myaAssertion.assertEquals(checkTheWord, true);
//		myaAssertion.assertAll();
//	}
//   @Test(priority = 2)
//    public void let_thesearch_bar() throws InterruptedException {
//	   driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("doaaababneh1111@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Ababneh11Doaa");
//		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
//		
//
//		
//		String[] theItems= {"jacket","t-shirt","jeans for men","jeans for women","pants"};
//	   Random myrandom =new Random();
//	   int index =myrandom.nextInt(0,theItems.length);
//	  WebElement searchValue= driver.findElement(By.xpath("//*[@id=\"search\"]"));
//	   searchValue.sendKeys(theItems[index]+Keys.ENTER);
//	 
//	   Thread.sleep(5000);
//	 String sentText= driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/h1/span")).getText();
//	 boolean containtvalue =sentText.contains(theItems[index]);
//	 SoftAssert myAssert=new SoftAssert();
//	 myAssert.assertEquals(containtvalue,true);
//	 myAssert.assertAll();
//	 
//   }
	   
	   
	   
   
   @Test(priority = 3)
   public void add_to_cart() throws InterruptedException {
	   
	   //++++++++++++++++++++++++get URL+++++++++++++++++++++++++++++++++++++++++++
	   
	   String[] URL = {"https://magento.softwaretestingboard.com/radiant-tee.html"
			          ,"https://magento.softwaretestingboard.com/breathe-easy-tank.html",
			           "https://magento.softwaretestingboard.com/argus-all-weather-tank.html",
			   "https://magento.softwaretestingboard.com/hero-hoodie.html"};
	   
	   //+++++++++++++++++++++++++++ADD ITMES+++++++++++++++++++++++++++++++++++++++++
	   int counter = 1;

	   for( int i=0;i<URL.length;i++) {
		   if(i==1) {
			   driver.get(URL[i]);
			   counter= 3 ;
		   }else if (i==1) {
			   driver.get(URL[i]);
			   counter=2;
			  
		   }else if (i==2) {
			   driver.get(URL[i]);
			   counter =4;
			   
			   
		   }else if (i==3) {
			   driver.get(URL[i]);
			   counter =1;
			   
		   }	   
	   
	   driver.manage().window().maximize();
	   
		   Thread.sleep(3000);
//+++++++++++++++++++++random size$color++++++++++++++++++++++++++++++++++++++++++++++++++++++
	   List<WebElement> size=driver.findElements(By.xpath("//div[@class='swatch-attribute size']"));
	   List<WebElement> color=driver.findElements(By.xpath("//div[@class='swatch-attribute color']"));
	  
	   
	   Thread.sleep(3000);
	   for (int  s= 0; s < counter; s++); {
		   Random randd = new Random();
		   int randomsize = randd.nextInt(size.size());
		   int randomcolor = randd.nextInt(color.size());
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		   
		    
		   size.get(randomsize).click();
		   
		   Thread.sleep(3000);
		   color.get(randomcolor).click();
		   Thread.sleep(3000);

		   driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
		 
		    
		   size.get(randomsize).click();
		   
		   Thread.sleep(3000);
		   color.get(randomcolor).click();
		   driver.findElement(By.xpath("//*[@id=\"option-label-size-143\"]")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
		   
	   }
	   
	   
	   
	   } 

}}