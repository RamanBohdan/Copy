package test_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WeightCalculatorPageWithFindBy {

    private final WebDriver driver;

    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input")
    private WebElement inputName;
    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input")
    private WebElement inputHeight;
    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input")
    private WebElement inputWeight;
    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]")
    private WebElement selectGenderMaleMan;
    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[2]")
    private WebElement selectGenderMaleWomen;
    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input")
    private WebElement pressButtonSubmit;

    public WeightCalculatorPageWithFindBy(WebDriver driver) {
        this.driver = driver;
    }

    public void typeName(String name){
        inputName.sendKeys (name);
    }


}
