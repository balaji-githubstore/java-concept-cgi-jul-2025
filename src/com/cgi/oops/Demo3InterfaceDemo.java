package com.cgi.oops;

interface WebDriverDemo
{
	public abstract void get(String url);
	String getTitle();
	void quit();
}

interface TakeScreenshotDemo
{
	void getScreenshot();
}

interface JavascriptExecutorDemo 
{
	void executeScript(String script);
}

class ChromeDriverDemo implements WebDriverDemo,TakeScreenshotDemo,JavascriptExecutorDemo
{
	public ChromeDriverDemo()
	{
		System.out.println("constructor chrome launch");
	}

	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		System.out.println("chrome url navigation");
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "get title from chrome";
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		System.out.println("chrome quit");
	}
	
	public void chromeOnly()
	{
		System.out.println("chrome only");
	}

	@Override
	public void getScreenshot() {
		// TODO Auto-generated method stub
		System.out.println("sc chrome");
	}

	@Override
	public void executeScript(String script) {
		// TODO Auto-generated method stub
		
	}
	
}

class EdgeDriverDemo implements WebDriverDemo,TakeScreenshotDemo,JavascriptExecutorDemo
{
	public EdgeDriverDemo()
	{
		System.out.println("constructor Edge launch");
	}
	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		System.out.println("edge url navigation");
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "get title from edge";
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		System.out.println("edge quit");
	}
	@Override
	public void getScreenshot() {
		// TODO Auto-generated method stub
		System.out.println("sc edge");
	}
	@Override
	public void executeScript(String script) {
		// TODO Auto-generated method stub
		
	}
}


public class Demo3InterfaceDemo {

	public static void main(String[] args) {
		
		WebDriverDemo driver=new ChromeDriverDemo();
		
		driver.get("http");
		driver.quit();
		
		TakeScreenshotDemo ts=(TakeScreenshotDemo) driver;
		ts.getScreenshot();
		
		JavascriptExecutorDemo js=(JavascriptExecutorDemo) driver;
		js.executeScript("");
		
	
		
	}
}
