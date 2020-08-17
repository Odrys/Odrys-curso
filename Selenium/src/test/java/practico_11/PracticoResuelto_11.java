package practico_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.GetProperties;

public class PracticoResuelto_11 {

    private WebDriver getDriver(String url){
        GetProperties properties = new GetProperties();
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", chromeDriverUrl);

        WebDriver driver = new ChromeDriver();

        driver.get(url);
        return driver;
    }

    @Test
    public void completeDocusignRegistrationForm(){
        WebDriver driver = getDriver(" https://go.docusign.com/o/trial/");

        driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Cristian");
        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Lopez");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Cris4477@gmail.com");
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("28282822");
        driver.findElement(By.xpath("//input[@name='title']")).sendKeys("QA");
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("28282822");
        Select industry= new Select(driver.findElement(By.xpath("//select[@name='ds_industry']")));
        industry.selectByValue("Education");
    }
    @Test
    public void defaultxPath() {
        WebDriver driver = getDriver(" https://go.docusign.com/o/trial/");
        driver.findElement(By.xpath("//*[@id=\"dsFormLabel_First_Name\"]/input")).sendKeys("Alejandra");
        driver.findElement(By.xpath("//*[@id=\"dsFormLabel_Last_Name\"]/input")).sendKeys("Hernandez");
        driver.findElement(By.xpath("//*[@id=\"dsFormLabel_Email\"]/input")).sendKeys("Ale2225@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"dsFormLabel_Phone\"]/input")).sendKeys("6523879");
        driver.findElement(By.xpath("//*[@id=\"dsFormLabel_Job_Title\"]/input")).sendKeys("Accountant");
        Select indust= new Select(driver.findElement(By.xpath("//*[@id=\"dsFormLabel_Industry\"]/select")));
        indust.selectByValue("Accounting");
    }
    @Test
    public void spotifyByName(){
        WebDriver driver= getDriver(" https://www.spotify.com/uy/signup/");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("o0o0123@gmail.com");
        driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("o0o0123@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("login186");
        driver.findElement(By.xpath("//input[@name='displayname']")).sendKeys("princess");
        driver.findElement(By.xpath("//input[@name='day']")).sendKeys("1");
        Select mes = new Select(driver.findElement(By.xpath("//select[@name='month']")));
        mes.selectByValue("04");
        driver.findElement(By.xpath("//input[@name='year']")).sendKeys("1995");
        driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[2]/form/div[6]/div[2]/label[2]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[2]/form/div[7]/label/span[1]")).click();
        driver.findElement(By.xpath("//*[@role='presentation']")).click();
        driver.findElement(By.xpath("//*[@type='submit']")).click();
    }

    @Test
    public void spotifyByNameCss(){
        WebDriver driver= getDriver("https://www.spotify.com/uy/signup/");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("queen30098@gmail.com");
        driver.findElement(By.cssSelector("input[name='confirm']")).sendKeys("queen30098@gmail.com");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("reinademicorazon");
        driver.findElement(By.cssSelector("input[name='displayname']")).sendKeys("ME");
        driver.findElement(By.cssSelector("input[name='day']")).sendKeys("23");
        Select mescss = new Select(driver.findElement(By.cssSelector("select[name='month']")));
        mescss.selectByValue("05");
        driver.findElement(By.cssSelector("input[name='year']")).sendKeys("1964");
        driver.findElement(By.cssSelector("#__next > main > div.signuppage__Signup-sof6g5-0.YsCoj > form > div.EmailForm__Center-jwtojv-0.gMBYBd > div > button")).click();
    }
    @Test
    public void GmailWithPath(){
        WebDriver driver= getDriver(" http://www.gmail.com");
        // Cuando tienes ya la cuenta creada y es solo hacer el login
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("2020sixteen@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
        driver.findElement(By.xpath("//*[@class='PrDSKc']")).click();
    }

}
