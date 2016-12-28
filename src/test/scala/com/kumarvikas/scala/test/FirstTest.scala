package com.kumarvikas.scala.test

import com.kumarvikas1.scala.core.driver.DriverManager
import com.kumarvikas1.scala.core.test.BaseTest
import org.scalatest.GivenWhenThen

/**
  * Created by vikakumar on 11/20/16.
  */
class FirstTest extends BaseTest with GivenWhenThen {

  feature("BBC Home page is displayed") {

    info("As a User")
    info("I should be able to load bbc home page")

  }

  scenario("BBC Home Page is displayed") {
    Given("WebDriver is not null")
    When("BBC Home page is opened")
    DriverManager.get().get("http://bbc.co.uk");
    When("BBC Home page is opened1")
    When("BBC Home page is opene2d")
    Then("It is opened")
    assert(fail())
  }

  scenario("BBC Home Page is displayed again") {
    Given("WebDriver is there")
    When("BBC Home page is again opened")
    DriverManager.get().get("http://bbc.co.uk");
    Then("It is opened")
  }

}