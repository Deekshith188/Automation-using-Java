package com.sgtesting.xpathandcss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	absoluteCSSPath();
	//	relativeCSSByTagName();
	//	relativeCSSByTagNameWithIDAttributeValue();
	//	relativeCSSByIDAttributeValue();
	//	relativeCSSByTagNameWithClassAttributeValue();
	//	relativeCSSByClassAttributeValue();
	//	relativeCSSByTagNameWithAttributeNameAndValuecombination();
	//	relativeCSSByTagNameWithMultipleAttributeNameAndValuecombination();
	//	relativeCSSByPartialMatchingOfAttributeValue();
	//	relativeCSSByParentReference();
	//	relativeCSSBynthChild();
		relativeCSSByTagNameWithAttributeName();
	}
	static void launchBrowser()
	{
		
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
		oBrowser.manage().window().maximize();
	}
	
	static void navigate()
	{
		try {
		oBrowser.get("file:///D:/HTML/Sample.html");
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void absoluteCSSPath()
	{
		oBrowser.findElement(By.cssSelector("html body div form input")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 1: Identify the Element based on tagName
	 * Syntax: <tagname>
	 */
	static void relativeCSSByTagName()
	{
		oBrowser.findElement(By.cssSelector("input")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 2: Identify the Element based on tagName with id attribute value
	 * Syntax: <tagname>#<id attribute value>
	 */
	static void relativeCSSByTagNameWithIDAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("input#pwd1pass1word1")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 3: Identify the Element based on id attribute value
	 * Syntax: #<id attribute value>
	 */
	static void relativeCSSByIDAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("#pwd1pass1word1")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 4: Identify the Element based on tagName with class attribute value
	 * Syntax: <tagname>.<class attribute value>
	 */
	static void relativeCSSByTagNameWithClassAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("input.pass1word1")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 5: Identify the Element based on class attribute value
	 * Syntax: .<class attribute value>
	 */
	static void relativeCSSByClassAttributeValue()
	{
		oBrowser.findElement(By.cssSelector(".pass1word1")).sendKeys("DemoUser1");
	}

	/**
	 * Case 6: Identify the Element based on tagName with attribute and value combination
	 * Syntax: <tagname>[attributename='attributevalue']
	 */
	static void relativeCSSByTagNameWithAttributeNameAndValuecombination()
	{
		oBrowser.findElement(By.cssSelector("input[name='submit1btn1']")).click();
	}
	
	/**
	 * Case 7: Multiple attributename and value combination
	 * Syntax: <tagname>[attributename='attributevalue'][attributename='attributevalue']
	 */
	static void relativeCSSByTagNameWithMultipleAttributeNameAndValuecombination()
	{
		oBrowser.findElement(By.cssSelector("input[name='submit1btn1'][value='Submit']")).click();
	}
	
	/**
	 * Case 8: Partial matching of attribute value
	 *  ^= starts-with
	 *  $= ends with
	 *  *= contains
	 * Syntax: 
	 * <tagname>[attributename ^='partial attribute value']
	 * <tagname>[attributename $='partial attribute value']
	 * <tagname>[attributename *='partial attribute value']
	 */
	static void relativeCSSByPartialMatchingOfAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("input[id *='submit1']")).click();
	}
	
	/**
	 * Case 9: Identify the elements based on parent
	 * Syntax: <parent> > <child>
	 */
	static void relativeCSSByParentReference()
	{
		oBrowser.findElement(By.cssSelector("div#d2 > form#frm2 > input")).click();
	}
	
	/**
	 * Case 10: nth-child(n) 
	 * Syntax: nth-child(n)
	 */
	static void relativeCSSBynthChild()
	{
		oBrowser.findElement(By.cssSelector("form#frm3 > input:nth-child(3)")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 11: tagname with attribute name alone
	 * Syntax: <tagname>[attributename]
	 */
	static void relativeCSSByTagNameWithAttributeName()
	{
		try
		{
			List<WebElement> oLinks=oBrowser.findElements(By.cssSelector("a[href]"));
			System.out.println("# of Links :"+oLinks.size());
			for(int i=0;i<oLinks.size();i++)
			{
				String linkname=oLinks.get(i).getText();
				if(linkname.startsWith("Selenium"))
				{
					oLinks.get(i).click();
					Thread.sleep(2000);
					break;
				}
			}
			oBrowser.navigate().back();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
