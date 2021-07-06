
public class Main {

public static <WebDriver> void main(String[] args) {
        System.setProperty(
                "webdriver.chrome.driver", "src/main/resources/chromedriver"
        );
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
    }

}
