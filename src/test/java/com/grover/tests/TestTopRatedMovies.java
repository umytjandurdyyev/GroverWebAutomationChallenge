package com.grover.tests;

import org.testng.annotations.Test;

import static com.grover.pages.TopRatedMovies.*;
import static com.grover.pages.WesternMovieList.getListOfSortBy;
import static org.testng.Assert.assertTrue;

public class TestTopRatedMovies extends TestBase{

    /**
     * Assume that all orders are descending
     */


    @Test(priority = 1)
    public void testListOfTitlesTopRatedMovies(){

        System.out.println(getListOfTopRatedMovies());

    }

    @Test(priority = 2)
    public void testAtListOneMovieInTheList(){
        assertTrue(getListOfTitlesOfTopRatedMovies().contains("The Shawshank Redemption"));
        assertTrue(getListOfTitlesOfTopRatedMovies().contains("The Handmaiden"));
    }

    @Test(priority = 3)
    public void testSortingOptionByRankingAsDefault(){
        assertTrue(getListOfTitlesOfTopRatedMovies().get(4).equals("12 Angry Men"));;
        assertTrue(getListOfTitlesOfTopRatedMovies().get(3).equals("The Dark Knight"));;
        assertTrue(getListOfTitlesOfTopRatedMovies().get(2).equals("The Godfather: Part II"));;
        assertTrue(getListOfTitlesOfTopRatedMovies().get(1).equals("The Godfather"));;
        assertTrue(getListOfTitlesOfTopRatedMovies().get(0).equals("The Shawshank Redemption"));;
    }

    @Test(priority = 4)
    public void testSortOptionsByImdbRating(){
        getMoviesBySortingOptions("ir:descending");
        assertTrue(getListOfTitlesOfTopRatedMovies().get(4).equals("12 Angry Men"));;
        assertTrue(getListOfTitlesOfTopRatedMovies().get(3).equals("The Dark Knight"));;
        assertTrue(getListOfTitlesOfTopRatedMovies().get(2).equals("The Godfather: Part II"));;
        assertTrue(getListOfTitlesOfTopRatedMovies().get(1).equals("The Godfather"));;
        assertTrue(getListOfTitlesOfTopRatedMovies().get(0).equals("The Shawshank Redemption"));;
    }

    @Test(priority = 5)
    public void testSortOptionsByReleaseDate(){
        getMoviesBySortingOptions("us:descending");
        assertTrue(getListOfTitlesOfTopRatedMovies().get(4).equals("7 Kogustaki Mucize"));;
        assertTrue(getListOfTitlesOfTopRatedMovies().get(3).equals("Klaus"));;
        assertTrue(getListOfTitlesOfTopRatedMovies().get(2).equals("1917"));;
        assertTrue(getListOfTitlesOfTopRatedMovies().get(1).equals("Hamilton"));;
        assertTrue(getListOfTitlesOfTopRatedMovies().get(0).equals("Soul"));;

    }

    @Test(priority = 6)
    public void testSortOptionsByNumberOfRatings(){
        getMoviesBySortingOptions("nv:descending");
        assertTrue(getListOfTitlesOfTopRatedMovies().get(4).equals("Pulp Fiction"));;
        assertTrue(getListOfTitlesOfTopRatedMovies().get(3).equals("Fight Club"));;
        assertTrue(getListOfTitlesOfTopRatedMovies().get(2).equals("Inception"));;
        assertTrue(getListOfTitlesOfTopRatedMovies().get(1).equals("The Dark Knight"));;
        assertTrue(getListOfTitlesOfTopRatedMovies().get(0).equals("The Shawshank Redemption"));;

    }
    @Test(priority = 7)
    public void testSortOptionsByYourRating(){
        getMoviesBySortingOptions("ur:descending");
        assertTrue(getListOfTitlesOfTopRatedMovies().get(4).equals("12 Angry Men"));;
        assertTrue(getListOfTitlesOfTopRatedMovies().get(3).equals("The Dark Knight"));;
        assertTrue(getListOfTitlesOfTopRatedMovies().get(2).equals("The Godfather: Part II"));;
        assertTrue(getListOfTitlesOfTopRatedMovies().get(1).equals("The Godfather"));;
        assertTrue(getListOfTitlesOfTopRatedMovies().get(0).equals("The Shawshank Redemption"));;

    }

    @Test
    public void testNavigateToGenreAndGetSortOptions(){
        clickGenreType("Western");
        String [] expectedSortOptions = {"Popularity","A-Z","User Rating▼","Number of Votes","US Box Office",
                "Runtime","Year","Release Date","Date of Your Rating","Your Rating"};
        System.out.println(getListOfSortBy());
        for (String datum : expectedSortOptions) {
            assertTrue(getListOfSortBy().contains(datum));
        }
    }


}
