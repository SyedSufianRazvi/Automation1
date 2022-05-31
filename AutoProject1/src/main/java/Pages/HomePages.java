package Pages;

import org.openqa.selenium.By;

public class HomePages {

	public static By objMyACCount = By.xpath("//a[contains(text(),'My Account')]");

	public static By objEmail = By.xpath("//input[@id='reg_email']");

	public static By objPassword = By.xpath("//input[@id='reg_password']");

	public static By objRegister = By.name("register");
			
	public static By objAddresses = By.linkText("Addresses");

	public static By objEdit = By.linkText("Edit");

	public static By objFirstName = By.xpath("//input[@id='billing_first_name']");

	public static By objLastName = By.xpath("//input[@id='billing_last_name']");

	public static By objCompName = By.xpath("//input[@id='billing_company']");

	public static By objPhone = By.xpath("//input[@id='billing_phone']");

	public static By objAdd1 = By.xpath("//input[@id='billing_address_1']");

	public static By objAdd2 = By.xpath("//input[@id='billing_address_2']");

	public static By objCity = By.xpath("//input[@id='billing_city']");

	public static By objState = By.xpath("//span[@id='select2-chosen-2']");
	
	public static By objState1 = By.id("s2id_autogen2_search");
	
	public static By objState2 = By.xpath("//span[normalize-space()='Kerala']");
	
	public static By objZIPCode = By.id("billing_postcode");

	public static By objSaveAdd = By
			.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[12]/input[1]");

	
}
