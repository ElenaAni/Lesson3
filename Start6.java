

public class Start6 {
    private static Object WebDriverManager;

    public static <WebDriver> void main(String[] args) throws InterruptedException {
        // System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

    }

}

