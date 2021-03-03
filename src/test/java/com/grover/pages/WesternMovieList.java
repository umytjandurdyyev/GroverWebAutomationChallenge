package com.grover.pages;

import com.grover.utilities.BrowserUtils;
import com.grover.utilities.Driver;
import org.openqa.selenium.By;

import java.util.List;

public class WesternMovieList extends BasePage{

    private static String sortBy= "//div[@class='sorting']//a";

    public static List getListOfSortBy(){
        return BrowserUtils.getElementsText(Driver.get().findElements(By.xpath(sortBy)));
    }
}
