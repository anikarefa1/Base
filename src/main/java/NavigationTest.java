public class NavigationTest extends TestBase{
    public static void main(String[]args){
        launch_Opera();
        openURL("https://google.com");
        smallWait();
        navigateTo();
        customWait(6);
        navigateBack();
        mediumWait();
        navigateForword();

    }
    public static void navigateTo(){
        driver.navigate().to("https://demo.opencart.com/");
    }

    public static void navigateBack(){
        driver.navigate().back();
    }

    public static void navigateForword(){
        driver.navigate().forward();
    }


}
