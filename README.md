# Grover
- Front-End Test Challenge

- URL:  https://www.imdb.com/chart/top


### Tasks Accomplished:

The tests should confirm: 
- The Top 250 ( http:// www.imdb.com/chart/top ) page returns a t least 1 movie , in
the list.
- The previous should be true, for each of the sorting options
- Assert returned result accordingly
- Assert each sorting options navigating to the Western genre

### Tools Used:
```
Java 13.0.0
TestNG 7.1.0
Maven 4.0.0
Selenium 3.141.59
bonigarcia 4.1.0
maven-surfire-plugin 2.22.2
```
### Running tests
```
# cd {location of this project}
mvn clean test
```
### A tested UI:
```
https://www.imdb.com/chart/top

```

### About Task Completion
```
Three packeges created to make easy solution of the task. In utilities
package contains ConfigurationReader class, BrowserUtils and Driver class. In the tests
package contains TestCases and TestBase class. In the pages package contains page classes 

BrowserUtils: with all core functions/methods for this task

ConfigurationReader: load my file to properties object, and use 
getProperty method with key name then it will return value.

Driver: Designed based on Singleton design pattern. Same driver for one session

Properties file: I want to centrilize as possible. To update or change something in my framework 
I shouldn't be looking at different test or classes. Test cases must be static. I keep my common 
information's in this file (browser type and URL)

Pages: Designed based on Page Object Model. POM helping me set up better framwork, and will seperate
my test cases and locators and I keep my locators and methods in the page classes
 
```
### Task Steps

Test case | Test methods | Expected
--- | --- | --- 
Get list of top rated movies with all information | getListOfTopRatedMovies | 250 top rated movies listed.
Assert at least one movie | testAtListOneMovieInTheList | Assert that The Shawshank Redemption or The Handmaiden are in the list.
Sort as default | testSortingOptionByRankingAsDefault | Assert previous movie is true.
Sort as IMDB Rating| testSortOptionsByImdbRating | Assert previous movie is true.
Sort as Release Date | testSortOptionsByReleaseDate | Assert previous movie is true.
Sort as Number of Ratings | testSortOptionsByNumberOfRatings | Assert previous movie is true.
Sort as Your Rating | testSortOptionsByYourRating | Assert previous movie is true.
Navigate to Western genre | testNavigateToGenreAndGetSortOptions | Assert each sorting options.

```
- I created test methods against the test cases and asserted with actual and expexted results
TestName: TestTopRatedMovies

- I have before method(calls driver, maximize, implicit and explicitly wait and get URL) and 
after method close my driver
TestName: TestBase


```

### Test Report

In the target directory exist `surefire-reports` directory. In this directory we can examine our test results


