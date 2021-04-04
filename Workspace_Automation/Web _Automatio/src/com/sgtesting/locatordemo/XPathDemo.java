package com.sgtesting.locatordemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		absolutexPath();
	//	relativeXPathBasedOnTagName();
	//	relativeXPathBasedOnTagNameWithIndex();
	//	relativeXPathUsingTagNameWithAttributeNameValueCombination();
	//	relativeXPathUsingMultipleAttributeNameValue();
	//	relativeXPathUsingMultipleAttributeNameValueByOROperator();
	//	relativeXPathUsingMultipleAttributeNameValueByAndOperator();
	//	relativeXPathIrresptiveTagAttributeNameValue();
	//	relativeXPathTagNameWithAttributeNameAlone();
	//	relativeXPathPartialMatchingOfAttributeValue();
	//	relativeXPathBasedOnTextContent();
	//	relativeXPathPartialMatchingOfTextContent();
		relativeXPathBasedOnParent();
	//	relativeXPathSkippingImmediateParent();
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
		oBrowser.get("file:\\E:\\SG_TESTING\\JAVA NOTES\\HTML");
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void absolutexPath()
	{
		oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case1: identify the Element based on tag Name
	 *  Syntax: //<tagname>
	 */
	static void relativeXPathBasedOnTagName()
	{
		oBrowser.findElement(By.xpath("//input")).sendKeys("DemoUser1");
	}
	
	/**
	 * case 2: Using tagname along with Index
	 * Syntax: //<tagname>[index]
	 */
	static void relativeXPathBasedOnTagNameWithIndex()
	{
		oBrowser.findElement(By.xpath("//input[2]")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 3: tagname along with attributeName and Value Combination
	 * Syntax:  //<tagname>[@attributename='attributevalue']
	 */
	static void relativeXPathUsingTagNameWithAttributeNameValueCombination()
	{
		oBrowser.findElement(By.xpath("//input[@name='pass1word1']")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 4: tagname along with multiple attributeName and Value Combination
	 * Syntax:  //<tagname>[@attributename1='attributevalue'][@attributename2='attributevalue']
	 */
	static void relativeXPathUsingMultipleAttributeNameValue()
	{
		oBrowser.findElement(By.xpath("//input[@name='pass1word1'][@class='pass1word1']")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 5: tagname along with multiple attributeName and Value Combination using OR operator
	 * Syntax:  //<tagname>[@attributename1='attributevalue' or @attributename2='attributevalue']
	 */
	static void relativeXPathUsingMultipleAttributeNameValueByOROperator()
	{
		oBrowser.findElement(By.xpath("//input[@name='pass1word1' or @class='pass1word1']")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 6: tagname along with multiple attributeName and Value Combination using AND operator
	 * Syntax:  //<tagname>[@attributename1='attributevalue' or @attributename2='attributevalue']
	 */
	static void relativeXPathUsingMultipleAttributeNameValueByAndOperator()
	{
		oBrowser.findElement(By.xpath("//input[@name='pass1word1' and @class='pass1word1']")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 7:  Irresptive of TagName attributeName and Value Combination 
	 * Syntax:  //*[@attributename1='attributevalue']
	 */
	static void relativeXPathIrresptiveTagAttributeNameValue()
	{
		oBrowser.findElement(By.xpath("//*[@name='submit1btn1']")).click();
	}
	
	/**
	 * Case 8:  TagName with attributeName Alone
	 * Syntax:  //<tagname>[@attributename]
	 * @return List<WebElement>
	 */
	static void relativeXPathTagNameWithAttributeNameAlone()
	{
		try
		{
			List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
			System.out.println("# of Links :"+oLinks.size());
			for(int i=0;i<oLinks.size();i++)
			{
				String linkText=oLinks.get(i).getText();
				
				if(linkText.equalsIgnoreCase("eclipse"))
				{
					System.out.println(linkText);
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
	
	/**
	 * Case 9:  partial matching of attributeValue  
	 * Xpath functions:
	 *  starts-with(@attributename,'partial attributevalue')
	 *  ends-with(@attributename,'partial attributevalue')
	 *  contains(@attributename,'partial attributevalue')
	 *  Syntax:
	 *  //<tagname>[starts-with(@attributename,'partial attributevalue')]
	 *  //<tagname>[ends-with(@attributename,'partial attributevalue')]
	 *  //<tagname>[contains(@attributename,'partial attributevalue')]
	 */
	static void relativeXPathPartialMatchingOfAttributeValue()
	{
		oBrowser.findElement(By.xpath("//input[contains(@id,'submit1')]")).click();
	}
	
	/**
	 * Case 10:  Based on the Text Content identify the Element
	 * <a href="http://www.gmail.com">Gmail</a>
	 * Syntax:  //<tagname>[text()='textContent']
	 */
	static void relativeXPathBasedOnTextContent()
	{
		oBrowser.findElement(By.xpath("//a[text()='Gmail']")).click();
	}
	
	/**
	 * Case 11:  partial matching of text Content
	 * Xpath functions:
	 *  starts-with(text(),'partial text')
	 *  ends-with(text(),'partial text')
	 *  contains(text(),'partial text')
	 *  Syntax:
	 *  //<tagname>[starts-with(text(),'partial text')]
	 *  //<tagname>[ends-with(text(),'partial text')]
	 *  //<tagname>[contains(text(),'partial text')]
	 */
	static void relativeXPathPartialMatchingOfTextContent()
	{
		oBrowser.findElement(By.xpath("//a[contains(text(),'nium')]")).click();
	}
	
	/**
	 * Case 12: Identify Child Element based on Parent
	 * Syntax:  //<parent>/<parent>/<tagname>
	 */
	static void relativeXPathBasedOnParent()
	{
		oBrowser.findElement(By.xpath("//div[@id='d2']/form[@id='frm2']/input")).click();
	}
	/**
	 * Case 13: Skipping its immediate parent
	 * Syntax:  //<xpathExpression>//<xpathExpression>
	 */
	static void relativeXPathSkippingImmediateParent()
	{
		oBrowser.findElement(By.xpath("//div[@id='d2']//input")).click();
	}
}
