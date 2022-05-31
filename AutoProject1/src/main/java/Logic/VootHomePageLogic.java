package Logic;

import static Logic.LaunchBrowsers.driver;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Pages.HomePages;

public class VootHomePageLogic {
	// constructor
	public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

	/**
	 * 1. Method to verify user navigated to voot home page by fetching current url
	 * & comparing with actual url.
	 */
	public static void verifyHomePageNavigation() throws InterruptedException {
		String homePageUrl = driver.getCurrentUrl();
		Assert.assertEquals(homePageUrl, "http://practice.automationtesting.in/", "Not navigated to Voot home page");
		Thread.sleep(1000);
		System.out.println("Home page url is: " + homePageUrl);
	}

	/**
	 * 2. method to verify voot logo by presence of element and comparing fetched
	 * logo text with actual text.
	 */
	public static void verifyVootLogo() throws InterruptedException {

		WebElement vootlogo = driver.findElement(HomePages.objMyACCount);
		String logoText = vootlogo.getAttribute("title");
		String title = driver.getTitle();
		System.out.println("Title is: " + title);
		System.out.println("Text of voot logo is: " + logoText);
		// Assert.assertEquals(logoText, "Voot", "Failed to fetch voot logo");
		// Assert.assertTrue(vootlogo.isDisplayed(), "Voot logo not displayed");

	}

	public static void navigatetomyaccounttab() throws Exception {
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(HomePages.objMyACCount).click();

		Thread.sleep(5000);

		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		driver.findElement(HomePages.objEmail).sendKeys("username" + randomInt + "@gmail.com");
		// driver.findElement(HomePages.objEmail).sendKeys("deaddonkey@nonise.com");

		driver.findElement(HomePages.objPassword).sendKeys("alloockart@fleetcor.careers");

		driver.findElement(HomePages.objRegister).click();

		driver.findElement(HomePages.objAddresses).click();

		driver.findElement(HomePages.objEdit).click();

		driver.findElement(HomePages.objFirstName).sendKeys("Syed Sufian");

		driver.findElement(HomePages.objLastName).sendKeys("Razvi");

		driver.findElement(HomePages.objCompName).sendKeys("Intact Green Services");

		driver.findElement(HomePages.objPhone).sendKeys("1234567898");

		driver.findElement(HomePages.objAdd1).sendKeys("Koramangala");

		driver.findElement(HomePages.objAdd2).sendKeys("Yelahanka");

		driver.findElement(HomePages.objCity).sendKeys("Bangalore");
		// Thread.sleep(5000);

		driver.findElement(HomePages.objState).click();

		driver.findElement(HomePages.objState1).sendKeys("Kerala");

		driver.findElement(HomePages.objState2).click();

		driver.findElement(HomePages.objZIPCode).sendKeys("560076");
		Thread.sleep(5000);
		driver.findElement(HomePages.objSaveAdd).click();

	}

}
