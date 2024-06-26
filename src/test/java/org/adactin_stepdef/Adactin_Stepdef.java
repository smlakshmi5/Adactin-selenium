package org.adactin_stepdef;

import org.adactin_pom.Adactin_Hotel_pom;
import org.adactin_runner.Adactin_runner;
import org.baseclass.Base_Class;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adactin_Stepdef extends Base_Class {
	
WebDriver driver = Adactin_runner.driver;

	Adactin_Hotel_pom ad = new Adactin_Hotel_pom(driver);

	@Given("User launching the url and maximize")
	public void user_launching_the_url_and_maximize() {
	   url(driver, "https://adactinhotelapp.com/");
	   maximize(driver);
	}
	
	@When("I enter the valid username")
	public void i_enter_the_valid_username() {
		tosendvalues(ad.getEmail(), "30091991");
		}
	
	@When("I enter the password")
	public void i_enter_the_password() {
		tosendvalues(ad.getPass(), "Lakshmi");
	   
	}
	
	@Then("I click on the login button")
	public void i_click_on_the_login_button() {
	  toclick(ad.getLogin());
	}
	
	@When("Select hotel location")
	public void select_hotel_location() {
	    toselect(driver, ad.getLocation(), 1);
	}
	
	@When("Select the hotel")
	public void select_the_hotel() {
		toselect(driver, ad.getHotels(), 2);
	   
	}
	
	@When("Selet room type")
	public void selet_room_type() {
	   toselect(driver, ad.getRoomtype(), 4);
	}
	
	@Then("Select number of rooms")
	public void select_number_of_rooms() {
	   toselect(driver, ad.getRoomnos(), 2);
	}
	
	@Then("select checkin date")
	public void select_checkin_date() {
	   tosendvalues(ad.getCheckin(), "16/05/2024");
	}
	
	@Then("Selet checkout date")
	public void selet_checkout_date() {
	   tosendvalues(ad.getCheckout(), "18/05/2024");
	}
	
	@Then("Select room for adults")
	public void select_room_for_adults() {
	  toselect(driver, ad.getAdultroom(), 2);
	}
	
	@Then("Select room for kids")
	public void select_room_for_kids() {
	   toselect(driver, ad.getChildroom(), 3);
	}
	
	@Then("I click on search button")
	public void i_click_on_search_button() {
	    toclick(ad.getSubmit());
	}



	
	
}
