import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;

    public static void main(String[] args) {
        launch_Opera();
        quit_Opera();
        close_Opera();
        smallWait();
        mediumWait();
        longWait();
        customWait(6);

    }

    public static void launch_Opera() {
        System.setProperty("webdriver.opera.driver", "./src/main/resources/operadriver.exe");
        driver = new OperaDriver();
        driver.manage().window().maximize();
    }

    public static void openURL(String URL){
        driver.get(URL);
    }

    public static void close_Opera(){
        driver.close();
    }
    public static void quit_Opera(){
        driver.quit();
    }
    
    public static void smallWait(){
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    
    public static void mediumWait(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    
    public static void longWait(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    
    public static void customWait(int milliSeconds){
        try {

            Thread.sleep(milliSeconds);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public static void implicitWait(int Seconds){
        driver.manage().timeouts().implicitlyWait(Seconds,TimeUnit.SECONDS);
    }
    public String getPageTitle(){
        return driver.getTitle();
    }
}