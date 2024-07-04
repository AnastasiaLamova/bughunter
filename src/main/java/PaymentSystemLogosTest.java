import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaymentSystemLogosTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mts.by");

        // Находим элемент с логотипами платежных систем
        WebElement paymentLogos = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]"));

        // Получаем список логотипов платежных систем
        java.util.List<WebElement> logosList = paymentLogos.findElements(By.tagName("img"));

        // Проверяем наличие логотипов платежных систем
        if (logosList.size() > 0) {
            System.out.println("Тест успешен: логотипы платежных систем найдены на странице.");
        } else {
            System.out.println("Тест провален: логотипы платежных систем не найдены на странице.");
        }

        driver.quit();
    }
}

