package com.HYD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Revenue_calculator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./newbrowserfiles_2/chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.fitpeo.com/");
		Actions keyboard=new Actions(driver);
		keyboard.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform();
		Thread.sleep(3000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)");
		
		///html/body/div[1]/div[1]/div[1]/div[2]/div/div/span[1]/span[3]/input
		//By slider_property=By.xpath("/html/body/div[2]/div[1]/div[1]/div[2]/div/div/span[1]/span[3]/input");
		//WebElement slider=driver.findElement(slider_property);
		//Actions mouse=new Actions(driver);
		//mouse.dragAndDropBy(slider,820,228).build().perform();
		///html/body/div[1]/div[1]/div[1]/div[2]/div/div/div/div
		//<input aria-invalid="false" id=":r0:" min="0" max="2000" class="MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng" type="number" value="200">
		By slider_property=By.xpath("//input[@aria-invalid='false'] [@id=':r0:'] [@min='0'] [@max='2000'] [@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'] [@type='number'] [@value='200']");
		WebElement slider=driver.findElement(slider_property);
		slider.clear();
		Thread.sleep(2000);
		slider.sendKeys("560");
		jse.executeScript("window.scrollBy(0,800)");
		
	By cpt_1_prop=By.xpath("//input[@class='PrivateSwitchBase-input css-1m9pwf3'][@type='checkbox']");
	WebElement cpt_1=driver.findElement(cpt_1_prop);
	cpt_1.click();
	Actions keyboard_2=new Actions(driver);
	
	keyboard.sendKeys(Keys.TAB,Keys.SPACE,Keys.TAB,Keys.SPACE,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.SPACE).perform();
	//<input class="PrivateSwitchBase-input css-1m9pwf3" data-indeterminate="false" type="checkbox">
	
	
		
	}

}
