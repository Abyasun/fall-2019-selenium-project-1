package com.cybertek.tests.day16_page_object_model;

import com.cybertek.base.TestBase;
import com.cybertek.base.VytrackTestBase;
import com.cybertek.pages.DashboardPage;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PageHeadersTests extends VytrackTestBase {
    // go to vyrack
    // login as driver
    // verify  header is "Quick Launchpad"

    @Test
    public void dashboardPageTest(){
        String username = ConfigurationReader.getProperty("driver_username");
        String password = ConfigurationReader.getProperty("driver_password");
        loginPage.login(username, password);

        DashboardPage dashboardPage = new DashboardPage();
        String actual = dashboardPage.pageHader.getText();
        assertEquals(actual, "Quick Launchpad");
    }


//    go to vyrack
    // go to Fleet vehicles
    // login as driver
    // verify  header is "All Cars"

}