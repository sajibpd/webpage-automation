import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTestRunner extends Setup {

    @Test
    public void selectSecondMatch() throws InterruptedException {
        HomePage homepage= new HomePage(driver);
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        homepage.selectSecondMatch("ban");
        String expectedData="Bangladesh";
        String actualData=homepage.searchBox.getAttribute("value");
        System.out.println(actualData);
        Assert.assertEquals(actualData,expectedData);
    }
}
