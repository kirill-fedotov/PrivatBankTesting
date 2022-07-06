package tests.base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.LoggerFactory;
import pages.CarLoansPage;
import common.CommonActions;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.MobilePhoneReplenishmentPage;

import java.io.File;
import java.time.LocalTime;
import java.util.Objects;
import java.util.logging.Logger;

import static common.Config.*;

//@ExtendWith(Listener.class)
//@Execution(ExecutionMode.CONCURRENT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected CarLoansPage carLoansPage = new CarLoansPage(driver);
    protected MobilePhoneReplenishmentPage mobilePhoneReplenishmentPage = new MobilePhoneReplenishmentPage(driver);


//    /**
//     * Clear results
//     */
//    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(BaseTest.class);

//    static {
//        LOGGER.info("START TIME:" + LocalTime.now());
//        LOGGER.info("Start clear reports dir: build/reports ...");
//        File allureResults = new File("allure-results");
//        if (allureResults.isDirectory()) {
//            for (File item : Objects.requireNonNull(allureResults.listFiles()))
//                item.delete();
//        }
//
//        if (CLEAR_REPORTS_DIR) {
//            File allureScreenshots = new File("build/reports/tests");
//            for (File item : Objects.requireNonNull(allureScreenshots.listFiles()))
//                item.delete();
//        }
//    }


    @AfterEach
    void clearCookiesAndLocalStorage() {
        if (CLEAR_COOKIES) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear");
        }
    }

    @AfterAll
    void close() {
        if (!HOLD_BROWSER_OPEN) {
            driver.close();
        }
    }
}
