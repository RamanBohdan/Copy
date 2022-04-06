package test_page;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class WeightCalculatorTest extends AbstractTestClass implements WebDriverMessageConstant{

    @Test
    public void testInputHeight50() throws InterruptedException {

        webDriver.get(WEB_URL);
        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("50")
                .typeWeight("50")
                .selectGender("M")
                .pressButtonSubmit();

        Thread.sleep(3000);

        Assert.assertEquals(weightCalculatorPage.getMessage(), WEIGHT_OBESITY);
    }


    @Test(enabled = false)
    public void testInputHeight49() throws InterruptedException {

        webDriver.get(WEB_URL);
        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("49")
                .typeWeight("50")
                .selectGender("M")
                .pressButtonSubmit();

        Thread.sleep(3000);
    }

    @Test(enabled = false)
    public void testInputHeight301() throws InterruptedException {

        webDriver.get(WEB_URL);
        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("301")
                .typeWeight("50")
                .selectGender("M")
                .pressButtonSubmit();

        Thread.sleep(3000);
    }

    @Test(enabled = false)
    public void testInputHeight150() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("150")
                .typeWeight("50")
                .selectGender("Ж")
                .pressButtonSubmit();

        Thread.sleep(3000);
    }

    @Test(enabled = false)
    public void testInputHeight300() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("300")
                .typeWeight("50")
                .selectGender("Ж")
                .pressButtonSubmit();

        Thread.sleep(3000);
    }


    @Test(enabled = false)
    public void testInputHeight_10() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("-10")
                .typeWeight("50")
                .selectGender("Ж")
                .pressButtonSubmit();

        Thread.sleep(3000);
    }

    @Test(enabled = false)
    public void testInputHeight0() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("0")
                .typeWeight("50")
                .selectGender("Ж")
                .pressButtonSubmit();

        Thread.sleep(3000);
    }

    @Test(enabled = false)
    public void testInputHeight100000000() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("10000000")
                .typeWeight("50")
                .selectGender("Ж")
                .pressButtonSubmit();

        Thread.sleep(3000);
    }

    //Если вес начинается с цифры, а дальше идут буквы, символы и прочие - тест проходит при условии попадания в дивпазон!!!!
    @Test(enabled = false)
    public void testInputHeight_a() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("150aaaa")
                .typeWeight("50")
                .selectGender("Ж")
                .pressButtonSubmit();

        Thread.sleep(3000);
    }


    @Test(enabled = false)
    public void testInputHeight_AAA() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("AAA")
                .typeWeight("50")
                .selectGender("Ж")
                .pressButtonSubmit();

        Thread.sleep(3000);
    }

    @Test(enabled = false)
    public void testInputHeight_() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("-")
                .typeWeight("50")
                .selectGender("Ж")
                .pressButtonSubmit();

        Thread.sleep(3000);
    }

    @Test(enabled = false)
    public void testInputHeight_a111A() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("a111A")
                .typeWeight("50")
                .selectGender("Ж")
                .pressButtonSubmit();

        Thread.sleep(3000);
    }

    @Test(enabled = false)
    public void testInputHeightSymbol() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("$")
                .typeWeight("50")
                .selectGender("Ж")
                .pressButtonSubmit();

        Thread.sleep(3000);
    }

    @Test(enabled = false)
    public void testInputHeightNull() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("")
                .typeWeight("50")
                .selectGender("Ж")
                .pressButtonSubmit();

        Thread.sleep(3000);
    }

    @Test(enabled = false)
    public void testInputHeightSpace() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("  ")
                .typeWeight("50")
                .selectGender("Ж")
                .pressButtonSubmit();

        Thread.sleep(3000);
    }

    @Test(enabled = false)
    public void testInputWeight3() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("180")
                .typeWeight("3")
                .selectGender("Ж")
                .pressButtonSubmit();

        Thread.sleep(3000);
    }

    @Test(enabled = false)
    public void testInputWeight500() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("180")
                .typeWeight("500")
                .selectGender("Ж")
                .pressButtonSubmit();

        Thread.sleep(3000);
    }

    @Test(enabled = false)
    public void testInputWeight250() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("180")
                .typeWeight("250")
                .selectGender("M")
                .pressButtonSubmit();

        Thread.sleep(3000);
    }

    @Test(enabled = false)
    public void testInputWeight2() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("180")
                .typeWeight("2")
                .selectGender("M")
                .pressButtonSubmit();

        Thread.sleep(5000);
    }

    @Test(enabled = false)
    public void testInputWeight501() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("180")
                .typeWeight("501")
                .selectGender("M")
                .pressButtonSubmit();

        Thread.sleep(5000);
    }

    @Test(enabled = false)
    public void testInputWeight10000() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("180")
                .typeWeight("10000000")
                .selectGender("M")
                .pressButtonSubmit();

        Thread.sleep(5000);
    }


    @Test(enabled = false)
    public void testInputWeight_100() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("180")
                .typeWeight("-100")
                .selectGender("M")
                .pressButtonSubmit();

        Thread.sleep(5000);
    }

    @Test(enabled = false)
    public void testInputWeightZero() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("180")
                .typeWeight("0")
                .selectGender("M")
                .pressButtonSubmit();

        Thread.sleep(5000);
    }

    @Test(enabled = false)
    public void testInputWeightNull() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("180")
                .typeWeight("")
                .selectGender("M")
                .pressButtonSubmit();

        Thread.sleep(5000);
    }

    @Test(enabled = false)
    public void testInputWeightSpace() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeWeight("Name")
                .typeHeight("180")
                .typeWeight("  ")
                .selectGender("M")
                .pressButtonSubmit();

        Thread.sleep(5000);
    }


    @Test(enabled = false)
    public void testInputWeight_a() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("180")
                .typeWeight("aaa")
                .selectGender("M")
                .pressButtonSubmit();

        Thread.sleep(5000);
    }

    @Test(enabled = false)
    public void testInputWeightAAA() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("180")
                .typeWeight("AAA")
                .selectGender("M")
                .pressButtonSubmit();

        Thread.sleep(5000);
    }

    @Test(enabled = false)
    public void testInputWeight_aF() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("180")
                .typeWeight("aF")
                .selectGender("M")
                .pressButtonSubmit();

        Thread.sleep(5000);
    }

    //Если вес начинается с буквы, символа и прочего, а дальше идут цифры - тест не проходит!!!!!!!!
    @Test(enabled = false)
    public void testInputWeight_111EEaa() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("180")
                .typeWeight("111EEaa")
                .selectGender("M")
                .pressButtonSubmit();

        Thread.sleep(5000);
    }

    @Test(enabled = false)
    public void testInputWeightSymbol() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("180")
                .typeWeight("$")
                .selectGender("M")
                .pressButtonSubmit();

        Thread.sleep(5000);
    }

    @Test(enabled = false)
    public void testInputName() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("180")
                .typeWeight("80")
                .selectGender("M")
                .pressButtonSubmit();

        Thread.sleep(5000);
    }

    @Test(enabled = false)
    public void testInputNull() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("")
                .typeHeight("180")
                .typeWeight("80")
                .selectGender("M")
                .pressButtonSubmit();

        Thread.sleep(5000);
    }

    @Test(enabled = false)
    public void testInputSymbol() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("%&")
                .typeHeight("180")
                .typeWeight("80")
                .selectGender("M")
                .pressButtonSubmit();

        Thread.sleep(5000);
    }

    @Test(enabled = false)
    public void testInputSpace() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName(" ")
                .typeHeight("180")
                .typeWeight("80")
                .selectGender("M")
                .pressButtonSubmit();

        Thread.sleep(5000);
    }

    @Test(enabled = false)
    public void testInputZero() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("0")
                .typeHeight("180")
                .typeWeight("100")
                .selectGender("M")
                .pressButtonSubmit();

        Thread.sleep(5000);
    }

    //тест проходит с двумя нулями в отличии от отдного нуля.
    @Test(enabled = false)
    public void testInputDoubleZero() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("00")
                .typeHeight("180")
                .typeWeight("80")
                .selectGender("M")
                .pressButtonSubmit();

        Thread.sleep(5000);
    }

    //тест проходит, подставляя пробел и ноль.
    @Test(enabled = false)
    public void testInputSpaceZero() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName(" 0")
                .typeHeight("180")
                .typeWeight("80")
                .selectGender("M")
                .pressButtonSubmit();

        Thread.sleep(5000);
    }

    @Test(enabled = false)
    public void testInputSpace_() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("-")
                .typeHeight("180")
                .typeWeight("80")
                .selectGender("M")
                .pressButtonSubmit();

        Thread.sleep(5000);
    }

    @Test(enabled = false)
    public void InputGenderMaleMan() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("180")
                .typeWeight("100")
                .selectGender("M")
                .pressButtonSubmit();

        Thread.sleep(5000);
    }

    @Test(enabled = false)
    public void InputGenderMaleWomen() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("180")
                .typeWeight("100")
                .selectGender("Ж")
                .pressButtonSubmit();

        Thread.sleep(5000);
    }
    @Test(enabled = false)
    public void InputGenderMaleNon() throws InterruptedException {

        webDriver = new ChromeDriver();
        webDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webDriver);
        weightCalculatorPage
                .typeName("Name")
                .typeHeight("180")
                .typeWeight("100")
                .pressButtonSubmit();

        Thread.sleep(5000);
    }

}
