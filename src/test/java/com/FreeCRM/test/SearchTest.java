package com.FreeCRM.test;

import base.CommonAPI;
import com.FreeCRM.pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends CommonAPI{
    Logger LOG = LogManager.getLogger(SearchTest.class.getName());

    @Test
    public void SearchTextBoxTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        //String email = ConnectDB.getTableColumnData("select * from cred","password").get(0);

        loginPage.clickOnLoginBtn();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Cogmento CRM");
        LOG.info("login title page validation success");
        Thread.sleep(2000);

        loginPage.typeEmailAddress("tsrahman28@gmail.com");
        loginPage.typePassword("Testaccount1@");
        loginPage.clickOnLoginButton();
        Thread.sleep(2000);

        loginPage.clickOnSearchTextBox();
        loginPage.typeItemToSearch("james");
        Thread.sleep(2000);

    }
}
