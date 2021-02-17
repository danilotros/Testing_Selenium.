package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public  static final Target BUTTON_UC=Target.the("Seleciona universidad choucair").located(By.xpath("//div[@id='universidad']//strong"));
    public static final  Target INPUT_COURSE=Target.the("Buscar el curso").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO=Target.the("Da click para buscar el curso").located(By.xpath("//button[@class=' btn btn-secondary']"));
    public static final Target BUTTON_COURSE=Target.the("Da click para buscar el curso").located(By.xpath("//h4[contains(text(),'Recursos de Automatizacion Bancolombia')]"));
    public static final Target NAME_COURSE=Target.the("Extrae el nombre del curso").located(By.xpath("//h1[contains(text(),'Recursos de Automatizacion Bancolombia')]"));
}
