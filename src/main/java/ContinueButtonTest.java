import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContinueButtonTest {
    public static void main(String[] args) {
        // Указываем путь к драйверу браузера
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver-win64\\chromedriver.exe");

        // Создаем экземпляр WebDriver
        WebDriver driver = new ChromeDriver();

        // Открываем сайт mts.by
        driver.get("https://www.mts.by/");

        // Находим поле для выбора варианта "Услуги связи"
        WebElement servicesOption = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button"));
        servicesOption.click();

        // Находим поле для ввода номера телефона
        WebElement phoneNumberField = driver.findElement(By.xpath("//*[@id=\"connection-phone\"]"));
        phoneNumberField.sendKeys("297777777");

        // Находим кнопку "Продолжить" и кликаем по ней
        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
        continueButton.click();

        // Добавьте здесь проверки, которые вам необходимы после нажатия кнопки "Продолжить"

        // Закрываем браузер
        driver.quit();
    }
}
