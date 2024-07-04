import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoreDetailsLinkTest {
    public static void main(String[] args) {
        // Указание пути к драйверу браузера Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver-win64\\chromedriver.exe");

        // Инициализация экземпляра WebDriver
        WebDriver driver = new ChromeDriver();

        // Открытие веб-страницы mts.by
        driver.get("https://www.mts.by/");

        // Поиск ссылки "Подробнее о сервисе"
        WebElement moreInfoLink = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a"));

        // Клик по ссылке "Подробнее о сервисе"
        moreInfoLink.click();

        // Проверка заголовка новой страницы
        String newPageTitle = driver.getTitle();

        if (newPageTitle.contains("Подробнее о сервисе")) {
            System.out.println("Ссылка 'Подробнее о сервисе' работает корректно");
        } else {
            System.out.println("Ссылка 'Подробнее о сервисе' не работает");
        }

        // Закрытие браузера
        driver.quit();
    }
}

