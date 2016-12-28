package com.kumarvikas.scala.test

import com.kumarvikas1.scala.core.domain.HomePage
import com.kumarvikas1.scala.core
import com.kumarvikas1.scala.core.test.BaseTest;
/**
  * Created by vikakumar on 11/20/16.
  */
class SecondTest extends BaseTest {
  var home: HomePage = _;


  feature("Hotels.comHome page is displayed") {

    info("As a User")
    info("I should be able to load hotels.com home page")

  }

  scenario("Hotels.com Home Page is displayed") {
    Given("Home Page is deployed")
    home = new HomePage;
    When("Hotels.comHome page is opened")
    Then("It is opened")
    assert(home.open.is_shown)
  }


}