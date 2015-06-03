/**
 * @author jagdeepjain
 *
 */
package org.google.ui.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchPage {
    // locators
    @FindBy(id = "lst-ib")
    private WebElement searchInputBox;
    @FindBy(name = "btnG")
    private WebElement searchButton;
    @FindBy(id = "ires")
    private WebElement searchResultContainer;
    By searchResultHeader = By.tagName("h3");
    
    // perform search action with the given text
    public void searchText(String text) {
        searchInputBox.sendKeys(text);
        searchButton.click();
    }
    
    public List<String> readSearchResults() {
        List<WebElement> searchResults = searchResultContainer
                .findElements(searchResultHeader);
        
        List<String> searchResultsHeaderText = new ArrayList<String>();
        int size = searchResults.size();
        for (int i = 0; i < size; i++) {
            searchResultsHeaderText.add(searchResults.get(i).getText());
        }
        return searchResultsHeaderText;
    }
    
}
