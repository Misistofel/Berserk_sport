
package loginTest;


        import org.junit.Assert;
        import org.junit.Test;
        import org.openqa.selenium.By;
        import parentTest.ParentTest;
        import java.util.concurrent.TimeUnit;

public class LoginTest extends ParentTest {

    @Test
    public void validLogin() {
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://berserk-sport.com/en/information/login");
        webDriver.findElement(By.name("username")).sendKeys("Misistofel");
        webDriver.findElement(By.id("passwd")).sendKeys("zubyidat");
        webDriver.findElement(By.xpath(".//*[@class=\"button\" and  @value=\"Логин\" and @type=\"submit\"]")).click();
        Assert.assertTrue("Avatar is not present",
                mainPage.isAvatarPresent());

    }
}
