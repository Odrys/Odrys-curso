package practico12;

import org.testng.annotations.*;

public class tngNotation {


    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @BeforeClass
    public void init(){
        System.out.println("Inicializando la clase!!");
    }

    @BeforeMethod
    public void beforeMethodTest() {
        System.out.println("Before Method");
    }

    @Test
    @Parameters({"color"})
    public void primerTest(@Optional("Negro") String unColor){
         System.out.println("Ejecutando primer test");
         System.out.println("El color es " + unColor);
     }


    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method notation");
    }

     @Test
    public void segundoTest(){
         System.out.println("Ejecutando segundo Test");
     }

    @AfterClass
    public void afterClass(){
        System.out.println("After class");
    }

     @AfterTest
    public void afterTest(){
         System.out.println("After Test notation");
     }
}
