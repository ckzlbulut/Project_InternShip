package Utilities;

import io.cucumber.core.backend.TestCaseState;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD {

    public static WebDriver driver;

    private static ThreadLocal<WebDriver> threadDriver=new ThreadLocal<>(); // WebDriver 1 WebDriver 2
    public static ThreadLocal<String> threadBrowserName=new ThreadLocal<>(); // chrone , firefox ....
    private static TestCaseState scenario;

    // threadDriver.get() -> ilgili tread deki driveri vercek
    // threadDriver.set(driver) -> ilgili tread e driver set ediliyor

    public static WebDriver getDriver()
    {
        // Bana neler lazım : 1 browser tipi lazım burada ona göre oluşturacam
        // her bir paralele çalışan süreç için sadece özel static bir değişken lazım
        // çünkü runner classdaki işaret edilen tüm senaryolarda aynısının çalışması lazım
        // demekki  her pipeline için (local) ve de ona özel static bir drivara ihtiyacım var.
        // donanımdaki adı pipeline , yazılımdaki adı Thread , paralel çalışan her bir süreç

        Locale.setDefault( new Locale("EN"));
        System.setProperty("user.language","EN"); // pc türkçe olunca türkçe çalışmasın diye default
//        //  ayarı english yapıyoruz yoksa rapor gelmiyor
        Logger.getLogger("").setLevel(Level.SEVERE);
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");

        if (threadBrowserName.get()==null)     // parallel çalışmayan yani xml den parametreyle
            threadBrowserName.set("chrome");   // gelmiyen testlerde chrome çalışsın


        if (threadDriver.get()==null)
        {
            String browserName =threadBrowserName.get(); // bu threaddeki browsername i verdi.

            switch (browserName)
            {
                case "chrome":
                    //System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
                    WebDriverManager.chromedriver().setup();
                    threadDriver.set(new ChromeDriver());
                    break;

                case "firefox":
                    //System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
                    WebDriverManager.firefoxdriver().setup();
                    threadDriver.set(new FirefoxDriver());
                    break;

                case "safari":
                    WebDriverManager.safaridriver().setup();
                    threadDriver.set(new SafariDriver());
                    break;

            }
        }
        return threadDriver.get();
    }

    public static void quitDriver( )
    {
        stay(5);

//        if (threadDriver.get()!=null || scenario.isFailed() )
//        {
//            threadDriver.get().quit();
//
//            WebDriver driver = threadDriver.get();
//            driver = null;
//            threadDriver.set(driver); // tekrar gelirse içi boş olmuş olsun
//        }
        if (threadDriver.get()!=null)
        {
            threadDriver.get().quit();

            WebDriver driver = threadDriver.get();
            driver = null;
            threadDriver.set(driver); // tekrar gelirse içi boş olmuş olsun
        }
    }

    public static void stay(int second)
    {
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
