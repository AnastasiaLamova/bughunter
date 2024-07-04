import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlockNameTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mts.by");

        // Находим элемент с указанным блоком
        WebElement block = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2"));

        // Проверяем, что блок существует и отображается на странице
        if (block.isDisplayed()) {
            System.out.println("Тест успешен: блок 'Онлайн пополнение без комиссии' найден на странице.");
        } else {
            System.out.println("Тест провален: блок 'Онлайн пополнение без комиссии' не найден на странице.");
        }

        driver.quit();
    }
}
