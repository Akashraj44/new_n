package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;

public class CartTest extends BaseTest{
  @Test
  public void addToCartTest() {
	  LoginPage login = new LoginPage(driver);
	  login.login("standard_user", "secret_sauce");
	  HomePage home = new HomePage(driver);
	  home.addProductToCart();
	  home.openCart();
	  CartPage cart = new CartPage(driver);
	  cart.checkout();
  }
}
