import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class ieMode {

    @Before
    public void setUp(){
        System.setProperty("webdriver.ie.driver","C:\\Users\\paulo\\Documents\\Projetos\\EmulandoIE_Edge\\drivers\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
    }

    @Test
    public void teste(){
        InternetExplorerOptions ieOptions = new InternetExplorerOptions();
        ieOptions.attachToEdgeChrome();
        ieOptions.ignoreZoomSettings();
        ieOptions.introduceFlakinessByIgnoringSecurityDomains();
        ieOptions.disableNativeEvents();
        ieOptions.requireWindowFocus();
        ieOptions.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
        ieOptions.destructivelyEnsureCleanSession();
        ieOptions.enablePersistentHovering();
        ieOptions.attachToEdgeChrome();
        ieOptions.withEdgeExecutablePath("C:\\Users\\paulo\\Documents\\Projetos\\EmulandoIE_Edge\\drivers\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new InternetExplorerDriver(ieOptions);
        driver.get("https://www.google.com.br");
        WebElement element = driver.findElement(By.className("gLFyf gsfi"));
        element.sendKeys("Quality Assurrant", Keys.RETURN);
        driver.close();
        driver.quit();
    }

    @After
    public void tearDown(){
        System.out.println("Teste Realizado");
    }
}
