package com.grover.pages;

import com.grover.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static com.grover.utilities.BrowserUtils.*;

public class TopRatedMovies extends BasePage{

    private static String listOfMovies = "//tbody[@class = 'lister-list']";
    private static String listOfMovieTitles = "//tbody[@class = 'lister-list']//td[2]//a";
    private static String listOfGenre = "//ul[@class = 'quicklinks ']//li";
    private static String sortingOptions = "lister-sort-by-options";
    private static String ascendingDescending = "(//select[@id='lister-sort-by-options'])/../span";


    public static List getListOfTopRatedMovies(){

        return getElementsText(Driver.get().findElements(By.xpath(listOfMovies)));
    }

    public static List getListOfTitlesOfTopRatedMovies(){

        return getElementsText(Driver.get().findElements(By.xpath(listOfMovieTitles)));
    }

    public static List getListOfTopRatedMoviesByGenre(){

        return getElementsText(Driver.get().findElements(By.xpath(listOfGenre)));
    }

    public static void clickGenreType(String name){
        waitFor(1);
        int indexOfGenre = getListOfTopRatedMoviesByGenre().indexOf(name);
        hoverClick(Driver.get().findElement(By.xpath("(//ul[@class = 'quicklinks '])//li["+(indexOfGenre+1)+"]//a")));

    }

    public static List getListOfSortOptions() {

        Select sortBy = new Select(Driver.get().findElement(By.id(sortingOptions)));
        List<WebElement> sortOptions = sortBy.getOptions();

        return getElementsText(sortOptions);
    }

    public static void getMoviesBySortingOptions(String sortingOption){
        Select sortDropdown = new Select(Driver.get().findElement(By.id(sortingOptions)));
        sortDropdown.selectByValue(sortingOption);

    }


}
