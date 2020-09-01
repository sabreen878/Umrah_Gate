package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.PilgrimsPage;
import data.JSONDataReader;

public class PilgrimTests extends TestBase{
	
	PilgrimsPage pilgrimObject;
	
	@Test(priority = 1)
	public void PilgrimTestSuccessfullyWithAllDataSearch() throws FileNotFoundException, IOException, ParseException, InterruptedException
	{
		
		JSONDataReader jsonlogin = new JSONDataReader();
		jsonlogin.jsonReader();
		
		JSONDataReader jsonsearch = new JSONDataReader();
		jsonsearch.jsonReader1();
		
		pilgrimObject = new PilgrimsPage(driver);
		pilgrimObject.LoginData(jsonlogin.email, jsonlogin.password);
		Assert.assertTrue(pilgrimObject.SuccessLoginTxt.getText().contains("ﻻ توجد بيانات"));
		pilgrimObject.SetPilgrimDataSearch(jsonsearch.pilgrimname, jsonsearch.passportnumber, jsonsearch.filenumber, 
				jsonsearch.Companylicensenumber);
	}
	
	
	@Test(dependsOnMethods = {"PilgrimTestSuccessfullyWithAllDataSearch"})
	public void logOutSuccess() throws InterruptedException
	{
		pilgrimObject.logOut();
		Thread.sleep(2000);
	}
	
	
	@Test(priority = 2)
	public void PilgrimTestSuccessfullyWithCompanyLicemse() throws FileNotFoundException, IOException, ParseException, InterruptedException
	{
		
		JSONDataReader jsonlogin = new JSONDataReader();
		jsonlogin.jsonReader();
		
		JSONDataReader jsoncompanylicense = new JSONDataReader();
		jsoncompanylicense.jsonReader2();
		
		pilgrimObject = new PilgrimsPage(driver);
		pilgrimObject.LoginData(jsonlogin.email, jsonlogin.password);
		Assert.assertTrue(pilgrimObject.SuccessLoginTxt.getText().contains("ﻻ توجد بيانات"));
		pilgrimObject.SetPilgrimDataSearchLicenseNumber(jsoncompanylicense.Companylicensenumber);
	}
	
	@Test(dependsOnMethods = {"PilgrimTestSuccessfullyWithCompanyLicemse"})
	public void logOutSuccess1() throws InterruptedException
	{
		pilgrimObject.logOut();
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	public void PilgrimTestSuccessfullyWithPilgrimName() throws FileNotFoundException, IOException, ParseException, InterruptedException
	{
		
		JSONDataReader jsonlogin = new JSONDataReader();
		jsonlogin.jsonReader();
		
		JSONDataReader jsonpilgrimname = new JSONDataReader();
		jsonpilgrimname.jsonReader3();
		
		pilgrimObject = new PilgrimsPage(driver);
		pilgrimObject.LoginData(jsonlogin.email, jsonlogin.password);
		Assert.assertTrue(pilgrimObject.SuccessLoginTxt.getText().contains("ﻻ توجد بيانات"));
		pilgrimObject.SetPilgrimDataSearchPilgrimName(jsonpilgrimname.pilgrimname);
	}	
	
	@Test(dependsOnMethods = {"PilgrimTestSuccessfullyWithPilgrimName"})
	public void logOutSuccess2() throws InterruptedException
	{
		pilgrimObject.logOut();
		Thread.sleep(2000);
	}
	
	@Test(priority = 4)
	public void PilgrimTestFailureWithNotExistDataSearch() throws FileNotFoundException, IOException, ParseException, InterruptedException
	{
		
		JSONDataReader jsonlogin = new JSONDataReader();
		jsonlogin.jsonReader();
		
		JSONDataReader jsonnotexistdatasearch = new JSONDataReader();
		jsonnotexistdatasearch.jsonReader4();
		
		pilgrimObject = new PilgrimsPage(driver);
		pilgrimObject.LoginData(jsonlogin.email, jsonlogin.password);
		Assert.assertTrue(pilgrimObject.SuccessLoginTxt.getText().contains("ﻻ توجد بيانات"));
		pilgrimObject.SetPilgrimNotExistDataSearch(jsonnotexistdatasearch.pilgrimname, jsonnotexistdatasearch.passportnumber,
				jsonnotexistdatasearch.filenumber, jsonnotexistdatasearch.Companylicensenumber);

		Assert.assertTrue(pilgrimObject.noResultFound.getText().contains("لا يوجد بيانات"));
	}

}
