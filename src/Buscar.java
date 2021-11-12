import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Buscar {


        public static void main(String[] args) {

            File file = new File("C:\\Users\\User\\OneDrive\\Documentos\\Faculdade\\CI&T\\chromedriver_win32\\chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.casasbahia.com.br/%22");

                    //driver.close();
                    WebElement caixaDeBusca = driver.findElement(By.id("strBusca"));
            caixaDeBusca.sendKeys("PlayStation");
            caixaDeBusca.clear();
            caixaDeBusca.sendKeys("Panela");

            WebElement botaoBusca = driver.findElement(By.id("btnOK"));
            botaoBusca.click();

            //driver.close();
        }

    }

