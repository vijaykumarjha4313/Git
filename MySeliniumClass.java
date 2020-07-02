#testfor email
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class MySeliniumClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay\\eclipse\\chromedriver_win32\\chromedriver.exe");
         WebDriver WD = new ChromeDriver();
         
         WD.get("https://login.yahoo.com/");
         WD.manage().window().maximize();
         try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        WD.findElement(By.xpath("//input[@name='username']")).sendKeys("vijay.rec2006@yahoo.com");
        try {
   			Thread.sleep(2000);
   		} catch (InterruptedException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		}
        
        //WD.findElement(By.xpath("//input[@value='Next']")).click();


        
        System.out.println("enter password");
    
        WebElement MailLink = WD.findElement(By.xpath("a[starts-with(text(),'Mail')]"));
        JavascriptExecutor js1= (JavascriptExecutor) WD; 
        js.executeScript("arguments[0].click();",js1);
        
      //a[starts-with(text(),'Mail')]
        
        // error text is not captured.need to find the soluation,Gaurav is also checking 
         //WebElement usererror = WD.findElement(By.id ("username-error"));
         //String Error3 = (String) js.executeScript("arguments[0].innerText;",usererror);
         //System.out.println("error" + Error3);
         //String error1 = usererror.getAttribute("innertext");
         //String error = usererror.getText();
         //System.out.println("error" + error);
         //System.out.println("error" + error1);
         
         
         //WD.findElement(By.id("createacc")).click(); (Not clickable trying by id)
         //WebElement Createacc=WD.findElement(By.xpath("//a[@id='createacc']")); code for create account
         //JavascriptExecutor js= (JavascriptExecutor) WD; code for create account
         //js.executeScript("arguments[0].click();",targetGenericElement);getting error
       //js.executeScript("arguments[0].click();",Createacc); code is working fine
        //WD.findElement(By.xpath("//input[@value='Next']")).click();
        //WebElement NextButton = WD.findElement(By.xpath("//input[@value='Next']"));
      //JavascriptExecutor js= (JavascriptExecutor) WD; 
        //js.executeScript("arguments[0].click();",NextButton);
        System.out.println("enter password");
        
        
        
	}

}
