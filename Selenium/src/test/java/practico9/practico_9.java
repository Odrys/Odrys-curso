package practico9;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class practico_9 {
    @Test
    public void ej3(){
        GetProperties properties = new GetProperties();
        String chromeDriverUrl= properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver",chromeDriverUrl);

        WebDriver driver = new ChromeDriver();

        String bbcURL = "https://www.Facebook.com";
        driver.get(bbcURL);

        System.out.println("Esta es la URL del sitio: " + driver.getCurrentUrl());
        System.out.println("Este es el titulo del sitio: " + driver.getTitle());

        List<WebElement>listaH1= driver.findElements(By.tagName("h1"));
        System.out.println("******Mostrar elementos H1 de Facebook*****");

        for(WebElement elementoh1: listaH1) {
            System.out.println("*******");

            System.out.println(elementoh1);
            System.out.println(elementoh1.getText());

            System.out.println("*******");
        }

        List<WebElement>anchor= driver.findElements(By.tagName("a"));
        List<WebElement>paragraphs= driver.findElements(By.tagName("p"));
        System.out.println("******Cantidad de links*****");

        for(WebElement a: anchor) {
            System.out.println(a.getText());
        }
        System.out.println("******Cantidad de parrafos*****");

        for(WebElement p: paragraphs) {
            System.out.println(p.getText());
        }

        driver.findElement(By.name("email")).sendKeys("andres@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("andres1234");
        driver.findElement(By.name("firstname")).sendKeys("Andrea");
        driver.findElement(By.name("lastname")).sendKeys("Gonzales");
        driver.findElement(By.name("reg_email__")).sendKeys("andrea@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("andrea@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("1234");

        //driver.close();
    }


}

