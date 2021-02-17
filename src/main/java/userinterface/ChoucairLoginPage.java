package userinterface;

import net.thucydides.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON=Target.the("button that shows us the form login").located(By.xpath("//[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]"));
    public static final Target INPUT_USER=Target.the("where do we write the user").located(By.id("username"));
    public static final Target INPUT_PASSWORD=Target.the("where do we write the password").located(By.id("password"));
    public static final Target ENTER_BUTTON=Target.the("button to confirm login").located(By.xpath("/html/body/div[1]/div[2]/div/section/div[2]/div[1]/div/div/div[2]/div[2]/form/div[3]/button"));

}
