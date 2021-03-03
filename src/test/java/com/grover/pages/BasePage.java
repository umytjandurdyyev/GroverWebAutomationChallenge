package com.grover.pages;

import com.grover.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

/**
 * I put whatever common to my app (logout, getTitle), and my POM model classes extends it
 */

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

}
