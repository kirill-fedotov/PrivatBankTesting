package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarLoansPage {

    WebDriver driver;
    public CarLoansPage(WebDriver driver) {

        this.driver = driver;
    }

    private final By tabAgreements = By.xpath("//div[@class='item_ryTYvf_Qfl']");
    private final By toggleToNew = By.xpath("//label[normalize-space()='New']");
    private final By inputPhoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
    private final By clickButtonSubmit = By.xpath("//button[normalize-space()='Submit an application']");

    /**
     * Select agreements tab
     */
    public CarLoansPage selectAgreementsTab() {
        driver.findElement(tabAgreements).click();
        return this;
    }

    /**
     * Enter submit button
     */
    public CarLoansPage enterButtonSubmit() {
        driver.findElement(clickButtonSubmit).click();
        return this;
    }

    /**
     * Switch toggle to new
     */
    public CarLoansPage switchToggleToNew() {
        driver.findElement(toggleToNew).click();
        return this;
    }

    /**
     * Enter phone number excluding country code
     * @param number phone number
     */
    public CarLoansPage enterPhoneNumber(String number) {
        driver.findElement(inputPhoneNumber).sendKeys(number);
        return this;
    }
}
