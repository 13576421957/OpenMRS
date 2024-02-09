package pages;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;

import javax.swing.text.html.CSS;

public class Dialog {
    public Dialog() {

    }
    @FindBy(css=("#username"))
    public WebElement username;

    @FindBy(css =("#password"))
    public WebElement password;

    @FindBy(css = ("#loginButton"))
    public WebElement loginButton;





}


