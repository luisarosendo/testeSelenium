import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.io.File;


public class Cep {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\User\\OneDrive\\Documentos\\Faculdade\\CI&T\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();

        driver.get("https://buscacepinter.correios.com.br/app/endereco/index.php");

        WebElement caixaDeBusca = driver.findElement(By.id("endereco"));
        caixaDeBusca.sendKeys("35620000");

        WebElement botaoBusca = driver.findElement(By.id("btn_pesquisar"));
        botaoBusca.click();
    }

}

