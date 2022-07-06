package tests.loans.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;
import static constants.Constant.MobileReplenishmentTestData.MOBILE_PAYMENT_PHONE_NUMBER;
import static constants.Constant.Urls.CAR_LOANS_URL;

public class CarLoansPositiveTest extends BaseTest {

    @Test
    public void selectAgrementsTabInPublicSession() {
        basePage.goToUrl(CAR_LOANS_URL);
        carLoansPage.selectAgreementsTab();
        basePage.isOutWidgetPresent();
    }

    @Test
    public void selectAgrementsTabInPublicSession2() {
        basePage.goToUrl(CAR_LOANS_URL);
        carLoansPage.switchToggleToNew();
        carLoansPage.enterPhoneNumber(MOBILE_PAYMENT_PHONE_NUMBER);
        carLoansPage.enterButtonSubmit();
        basePage.isOutWidgetPresent();
    }
}
