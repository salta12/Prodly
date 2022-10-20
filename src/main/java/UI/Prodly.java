package UI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Prodly {
        @Test
        public void register() throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://stage.prodly.ru/login");
            WebElement RegisterButton = driver.findElement(By.xpath("//a[@class='link'][contains(text(),'Зарегистрироваться')]"));
            RegisterButton.click();
            Thread.sleep(3000);

            WebElement NameField = driver.findElement(By.xpath("//input[@name='name']"));
            NameField.sendKeys("Salta");
            Thread.sleep(3000);

            WebElement PhoneField = driver.findElement(By.xpath("//input[@class='phone-number-input']"));
            PhoneField.sendKeys("+79224406472");
            Thread.sleep(3000);

            WebElement EmailField = driver.findElement(By.xpath("//input[@name='email']"));
            EmailField.sendKeys("saltanatdjakypova@gmail.com");
            Thread.sleep(3000);

            WebElement ParolField = driver.findElement(By.xpath("//input[@name='password']"));
            ParolField.sendKeys("111111");
            Thread.sleep(3000);

            WebElement CodeField = driver.findElement(By.xpath("//input[@name='reg_id']"));
            CodeField.click();
            Thread.sleep(3000);

            WebElement ButtonRegistration = driver.findElement(By.xpath("//button[contains(text(),'Зарегистрироваться')]"));
            ButtonRegistration.click();
            Thread.sleep(3000);

        }

        @Test
        public void login() throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://stage.prodly.ru/login");
            WebElement LoginUserButton = driver.findElement (By.xpath("//input[@id='loginUsername']"));
            LoginUserButton.sendKeys("+79224406472");
            Thread.sleep(2000);


            WebElement LoginPassword = driver.findElement(By.xpath("//input[@id='loginPassword']"));
            LoginPassword.sendKeys("102021");
            Thread.sleep(2000);

            WebElement EnterButton = driver.findElement(By.xpath("//button[contains(text(),'Войти')]"));
            EnterButton.click();
            Thread.sleep(2000);
            WebElement AddButton = driver.findElement(By.xpath("//a[contains(text(),'Добавить торговую точку')]"));
            AddButton.click();
            Thread.sleep(2000);
            WebElement CodeReg = driver.findElement(By.xpath("//button[contains(text(),'Нет')]"));
            CodeReg.click();
            Thread.sleep(3000);
            WebElement ResetButton= driver.findElement(By.xpath("//button[contains(text(),'Отмена')]"));
            ResetButton.click();
            Thread.sleep(3000);

            WebElement PersonalButton= driver.findElement(By.xpath("//span[contains(text(),'Личный кабинет')]"));
            PersonalButton.click();
            Thread.sleep(3000);
            WebElement ExitButton= driver.findElement(By.xpath("//div[@class='personal-hide opened']//a[contains(text(),'Выход')]"));
            ExitButton.click();
            Thread.sleep(3000);
        }
    }
