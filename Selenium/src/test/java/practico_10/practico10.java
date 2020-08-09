package practico_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.GetProperties;

import java.util.List;

public class practico10 {

            private WebDriver getDriver(String url){
                GetProperties properties = new GetProperties();
                String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
                System.setProperty("webdriver.chrome.driver", chromeDriverUrl);

            WebDriver driver = new ChromeDriver();

            driver.get(url);
            return driver;
        }

        @Test
        public void comboBoxTestOnFacebook(){
                WebDriver driver= getDriver("http://www.facebook.com");

            WebElement meses = driver.findElement(By.name("birthday_month"));
            Select comboBoxMeses = new Select(meses);
            comboBoxMeses.selectByVisibleText("abr");

            List<WebElement> options = comboBoxMeses.getOptions();

            Assert.assertNotEquals(options.size(),0,"There should be option on this combobox");

            for(WebElement opt: options){
                System.out.println(" Opcion " + opt.getText());

                WebElement dias= driver.findElement(By.id("day"));
                Select comboDias= new Select(dias);
                comboDias.selectByValue("1");

                WebElement year= driver.findElement(By.name("birthday_year"));
                Select comboYear= new Select(year);
                comboYear.selectByValue("1995");

                WebElement gender= driver.findElement(By.id("u_0_6"));
                gender.click();

                //WebElement gender= driver.findElement(By.id("u_0_7"));
                //gender.click();

                //WebElement gender= driver.findElement(By.id("u_0_8"));
                //gender.click();

                WebElement enter= driver.findElement(By.id("u_0_b"));
                enter.click();





            }

        }
    }
