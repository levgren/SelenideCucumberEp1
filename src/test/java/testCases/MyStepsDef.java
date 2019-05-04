package testCases;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Selenide.open;

public class MyStepsDef extends BaseTest{

    @Given("^Open \"([^\"]*)\" page$")
    public void open_page(String arg1) throws Throwable {
        open(url);
        throw new PendingException();
    }

    @Given("^Search for \"([^\"]*)\"$")
    public void search_for() throws Throwable {
        mainPage.searchNecessaryWord(searchedWord);
        throw new PendingException();
    }

    @When("^Open the first link on search results page$")
    public void open_the_first_link_on_search_results_page() throws Throwable {
        searchResultPage.openFirstLink();
        throw new PendingException();
    }

    @Then("^The title should contains searched word$")
    public void the_title_should_contains_searched_word() throws Throwable {
        webSitePage.verifyTitleContainsWord(searchedWord);
        throw new PendingException();
    }

    @When("^Search for \"([^\"]*)\"$")
    public void search_for(String arg1) throws Throwable {
        mainPage.searchNecessaryWord(searchedWord);
        throw new PendingException();
    }

    @Then("^Expected domain should be present on search results pages\\.$")
    public void expected_domain_should_be_present_on_search_results_pages() throws Throwable {
        searchResultPage.verifyDomainOnSearchResultPage(domain, 5);
        throw new PendingException();
    }
}
