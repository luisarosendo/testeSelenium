import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.io.File;
import java.util.List;


public class Google {

        public static void main(String[] args) throws Exception {

            File file = new File("C:\\Users\\User\\OneDrive\\Documentos\\Faculdade\\CI&T\\chromedriver_win32\\chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
            WebDriver driver = new ChromeDriver();
            driver.get("http://www.google.com/webhp?complete=1&hl=en%22");

                    WebElement query = driver.findElement(By.name("q"));
            query.sendKeys("Vocês são os melhores");

            long end = System.currentTimeMillis() + 5000;
            while (System.currentTimeMillis() < end) {
                WebElement resultsDiv = driver.findElement(By.className("sbdd_b"));

                if (resultsDiv.isDisplayed()) {
                    break;
                }
            }

            List<WebElement> allSuggestions = driver.findElements(By.xpath("//div[@class='sbqs_c']"));

            for (WebElement suggestion : allSuggestions) {
                System.out.println(suggestion.getText());
            }
            driver.quit();
        }
    }

