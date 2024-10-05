import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HomePage{

    @FindBy(id = "autosuggest")
    WebElement searchBox;
    @FindBy(xpath = "//a[contains(text(),'Bangladesh')]")
    WebElement suggestElement;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void selectSecondMatch(String input ) throws InterruptedException {
        searchBox.sendKeys(input);
        suggestElement.click();
    }
}
