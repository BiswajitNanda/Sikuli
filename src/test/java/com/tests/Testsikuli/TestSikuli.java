package com.tests.Testsikuli;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.api.DesktopScreenRegion;
import org.sikuli.api.ImageTarget;
import org.sikuli.api.ScreenRegion;
import org.sikuli.api.Target;
import org.sikuli.api.robot.desktop.DesktopMouse;
import org.sikuli.api.visual.DesktopCanvas;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class TestSikuli 
    
{
	
	@Test 
	public void testsikuli()
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.uk/maps");
		driver.findElement(By.id("searchboxinput")).sendKeys("London");
		driver.findElement(By.id("searchboxinput")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("/html/body/jsl/div[3]/div[7]/div[19]/div[1]/div[2]/div[6]/div/button[1]")).click();
		
		ScreenRegion s = new DesktopScreenRegion();
		Target target = new ImageTarget(new File("C:\\Automation\\earth.png"));
		ScreenRegion r = s.wait(target,8000);
		r=s.find(target);


	//  Construct a Canvas object of the type Desktop canvas 
		DesktopCanvas canvas = new DesktopCanvas();
		
		// Add a box around a screen region 'r'
		
		canvas.addBox(r);
		
		// Add a label on the screen region r
		
		canvas.addLabel(r, "WE FOUND IT!!");
		
		// Display the canvas f
		
		canvas.display(3);

		
		org.sikuli.api.robot.Mouse mouse =  new DesktopMouse();
		mouse.click(r.getCenter());
	
		
		
	}
	
	}
