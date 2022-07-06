package tests.telecomunications.negative;

import org.junit.jupiter.api.Test;
import pages.BasePage;
import tests.base.BaseTest;

import static constants.Constant.MobileReplenishmentTestData.*;
import static constants.Constant.MobileReplenishmentTestData.MOBILE_PAYMENT_LAST_NAME;
import static constants.Constant.Urls.MOBILE_PAYMENT_URL;

public class MobilePhoneReplenishmentNegativeTest extends BaseTest {

    @Test
    public void checkMinimumReplenishmentAmount() {
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage
                .enterPhoneNumber(MOBILE_PAYMENT_PHONE_NUMBER)
                .enterAmount("1")
                .enterCardFrom(MOBILE_PAYMENT_CARD)
                .enterCardExpDate(MOBILE_PAYMENT_CARD_EXP_DATE)
                .enterCardCvv(MOBILE_PAYMENT_CARD_CVV)
                .enterFirstName(MOBILE_PAYMENT_FIRST_NAME)
                .enterLastName(MOBILE_PAYMENT_LAST_NAME)
                .enterButtonSubmitToTheCard()
                .checkPaymentDetailsIsPresentInTheCard("AMobile payment. Phone number +380686979712");


    }
}
