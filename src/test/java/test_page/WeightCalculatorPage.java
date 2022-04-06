package test_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class WeightCalculatorPage {

    private final WebDriver driver;

    By inputNameLocator = By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input");
    By inputHeightLocator = By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input");
    By inputWeightLocator = By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input");
    By selectGenderMaleManLocator = By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]");
    By selectGenderMaleWomenLocator = By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[2]");
    By buttonSubmitLocator = By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input");
    By messageXpath = By.xpath("/html/body/table/tbody/tr[2]/td[2]");

    public WeightCalculatorPage(WebDriver driver) {
        this.driver = driver;

        //    //проверка того факта, что мы находимся на верной странице
        //    if ((!driver.getTitle().equals("Расчёт веса"))||
        //    (!driver.getCurrentUrl().equals("http://svyatoslav.biz/testlab/wt")))
        //    {
        //        throw new IllegalStateException("Wrong site page!");
        //    }
    }

    public WeightCalculatorPage typeName(String name) {
        driver.findElement(inputNameLocator).sendKeys(name);
        return this;
    }

    public WeightCalculatorPage typeHeight(String height) {
        driver.findElement(inputHeightLocator).sendKeys(height);
        return this;
    }

    public WeightCalculatorPage typeWeight(String weight) {
        driver.findElement(inputWeightLocator).sendKeys(weight);
        return this;
    }

    public WeightCalculatorPage selectGenderMaleMan() {
        driver.findElement(selectGenderMaleManLocator).click();
        return this;
    }

    public WeightCalculatorPage selectGenderMaleWomen() {
        driver.findElement(selectGenderMaleWomenLocator).click();
        return this;
    }

    public WeightCalculatorPage pressButtonSubmit() {
        driver.findElement(buttonSubmitLocator).click();
        return this;
    }

    public WeightCalculatorPage selectGender(String gender) {

        //  if (gender.equals("M")){
        //      driver.findElement(selectGenderMaleManLocator).click();
        //      }else {
        //      driver.findElement(selectGenderMaleWomenLocator).click();

        if (gender.equals("M")) {
            selectGenderMaleMan();
        } else {
            selectGenderMaleWomen();

        }
        return this;
    }

    public String getMessage() {
        return driver.findElement(messageXpath).getText();

    }
}
