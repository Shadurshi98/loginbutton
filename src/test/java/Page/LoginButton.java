package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.Initialization;

public class LoginButton extends Initialization {

	
	
//	@FindBy(xpath="//*[@id ='usernameOrEmail']")
//    public static WebElement username;
//    
//    @FindBy(id="password")
//    public static WebElement password;
    
    @FindBy(xpath= "//button[@type]")
    public static WebElement login;
    
//    @FindBy(xpath ="//*[@id=\"root\"]/div/section/section/header/ul/div/div[2]/div/div/span")
//    public static WebElement CheckAdmin ;
}
