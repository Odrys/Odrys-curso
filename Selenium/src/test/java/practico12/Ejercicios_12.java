package practico12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import utilities.GetProperties;

import java.util.List;

public class Ejercicios_12 {

    private static String SPOTIFY_URL = " https://www.spotify.com/uy/signup/";
    private final String REGISTERD_ERROR_MSG= "Este correo electrónico ya está conectado a una cuenta. Inicia sesión.";
    private final String DIFFERENT_ERROR_MSG= "Las direcciones de correo electrónico no coinciden.";
    private static final String Set_Message_ReEmail= "Es necesario que introduzcas tu correo electrónico.";

    WebDriver driver;

    @BeforeMethod
    public void setup() {
            GetProperties properties = new GetProperties();
            String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
            System.setProperty("webdriver.chrome.driver", chromeDriverUrl);
            driver = new ChromeDriver();
            driver.get(SPOTIFY_URL);
    }
   /* @Test (priority = 0)
    public void spotifyByName() {
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("o0o0123@gmail.com");
        driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("o0o0123@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("login186");
        driver.findElement(By.xpath("//input[@name='displayname']")).sendKeys("princess");
        driver.findElement(By.xpath("//input[@name='day']")).sendKeys("1");
        Select mes = new Select(driver.findElement(By.xpath("//select[@name='month']")));
        mes.selectByValue("04");
    }

    @Test(priority = 1)
    public void verifyTitle(){
        // System.out.println(driver.getTitle());
        String expectedResult= "Registrarte - Spotify";
        String actualResult=driver.getTitle();
        Assert.assertEquals(actualResult,expectedResult);
        //Assert.assertTrue(driver.getCurrentUrl().contains(SPOTIFY_URL));
    }

    @Test(priority = 2)
    public void validateEmailErrorMessage() throws InterruptedException {
        driver.findElement(By.xpath("//input[@placeholder= 'Introduce tu correo electrónico.']")).sendKeys("odrysbc@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder= 'Vuelve a introducir tu correo electrónico.']")).sendKeys("odrysbc@gmail.com");

        Thread.sleep(1500);
        WebElement emailErrorMessage= driver.findElement(By.xpath("//*[contains(text(), 'Este correo electrónico ya está conectado a una cuenta.')]"));
        System.out.println("Mensaje--> " + emailErrorMessage.getText());

        Assert.assertEquals(emailErrorMessage.getText(), REGISTERD_ERROR_MSG);
    }

    @Test(priority = 3)
        public void checkValidEmailError() throws InterruptedException {
        driver.findElement(By.xpath("//input[@placeholder= 'Introduce tu correo electrónico.']")).sendKeys("consu@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder= 'Vuelve a introducir tu correo electrónico.']")).sendKeys("consul@gmail.com");
        driver.findElement(By.name("password")).sendKeys("buenasNoches");

        Thread.sleep(1500);
        WebElement differentEmailMessageError= driver.findElement(By.xpath("//*[contains(text(), 'Las direcciones de correo electrónico no coinciden.')]"));
        System.out.println("Mensaje--> " + differentEmailMessageError.getText());
        Assert.assertEquals(differentEmailMessageError.getText(), DIFFERENT_ERROR_MSG);
    }

    @Test(priority = 4)
    public void CheckButtom(){
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement Put_Email_Error= driver.findElement(By.xpath("//*[contains(text(), 'Es necesario que introduzcas tu correo electrónico.')]"));
        Assert.assertEquals(Put_Email_Error.getText(),Set_Message_ReEmail);

    } */

    @Test(priority = 5)
    @Parameters({"tag_name"})
    public void printHs(@Optional("a") String tag){
        List<WebElement>elements= driver.findElements(By.tagName(tag));
        System.out.print(" Muestra los elementos de : " );

        if (tag.equals("h1")) {
            System.out.println("H1");
        }else if(tag.equals("h2")){
            System.out.println("H2");
        }else if (tag.equals("a")){
            System.out.println("Hiperlinks");
        }else {
            System.out.println(tag);
            }
        for (WebElement e : elements){
            System.out.println(e.getText());
        }
        System.out.println("END");


    }

    @AfterMethod
    public void close(){
        driver.quit();
    }










}
