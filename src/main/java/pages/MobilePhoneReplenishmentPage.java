package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MobilePhoneReplenishmentPage extends BasePage {

    public MobilePhoneReplenishmentPage(WebDriver driver) {

        super(driver);
    }

    private final By buttonWallet = By.xpath("//div[contains(text(),'My wallet')]");
    private final By inputPhoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
    private final By inputAmount = By.xpath("//input[@data-qa-node='amount']");
    private final By inputCardFrom = By.xpath("//input[@data-qa-node='numberdebitSource']");
    private final By inputCardExpDate = By.xpath("//input[@data-qa-node='expiredebitSource']");
    private final By inputCardCvv = By.xpath("//input[@data-qa-node='cvvdebitSource']");
    private final By inputFirstName = By.xpath("//input[@placeholder='TARAS']");
    private final By inputLastName = By.xpath("//input[@placeholder='SHEVCHENKO']");
    private final By buttonSubmitToTheCard = By.xpath("//button[@data-qa-node='submit']");

    private final By paymentDetails = By.xpath("//div[@data-qa-node='details']");

    /**
     * Choose a card from the wallet
     */
    public MobilePhoneReplenishmentPage selectCardFromWallet() {
        driver.findElement(buttonWallet).click();
        return this;
    }

    /**
     * Enter phone number excluding country code
     * @param number phone number
     */
    public MobilePhoneReplenishmentPage enterPhoneNumber(String number) {
        driver.findElement(inputPhoneNumber).sendKeys(number);
        return this;
    }

    /**
     * Enter top-up amount
     * @param amount amount
     */
    public MobilePhoneReplenishmentPage enterAmount(String amount) {
        driver.findElement(inputAmount).sendKeys(amount);
        return this;
    }

    /**
     * Enter card number
     * @param card card number
     */
    public MobilePhoneReplenishmentPage enterCardFrom(String card) {
        driver.findElement(inputCardFrom).sendKeys(card);
        return this;
    }

    /**
     * Enter card exp date
     * @param expDate exp date
     */
    public MobilePhoneReplenishmentPage enterCardExpDate(String expDate) {
        driver.findElement(inputCardExpDate).sendKeys(expDate);
        return this;
    }

    /**
     * Enter card cvv
     * @param Cvv card cvv
     */
    public MobilePhoneReplenishmentPage enterCardCvv(String Cvv) {
        driver.findElement(inputCardCvv).sendKeys(Cvv);
        return this;
    }

    /**
     * Enter card holders First Name
     * @param FirstName First Name
     */
    public MobilePhoneReplenishmentPage enterFirstName(String FirstName) {
        driver.findElement(inputFirstName).sendKeys(FirstName);
        return this;
    }

    /**
     * Enter card holders Last Name
     * @param LastName Last Name
     */
    public MobilePhoneReplenishmentPage enterLastName(String LastName) {
        driver.findElement(inputLastName).sendKeys(LastName);
        return this;
    }

    /**
     * Enter submit button
     */
    public MobilePhoneReplenishmentPage enterButtonSubmitToTheCard() {
        driver.findElement(buttonSubmitToTheCard).click();
        return this;
    }

    /**
     * Check payment details is present in the card
     * @param text expected text
     */
    public MobilePhoneReplenishmentPage checkPaymentDetailsIsPresentInTheCard(String text) {
        WebElement details = driver.findElement(paymentDetails);
        waitElementIsVisible(details);
        Assertions.assertEquals(text, details.getText());
        return this;
    }

}