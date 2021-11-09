import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        abrirChrome();
    }
    private static void abrirChrome() {
        File file = new File("C:\\Users\\User\\OneDrive\\Documentos\\Faculdade\\CI&T\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.get("hTp://devmedia.com.br");
        String i = driver.getCurrentUrl();
        System.out.println(i);
        driver.close();
    }
}