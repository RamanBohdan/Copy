package page;

import com.sun.tracing.dtrace.Attributes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WedDriverTest {

    private static WebDriver webDriver;
    private final static String WebUrl = "http://svyatoslav.biz/testlab/wt";
    private final static String INPUT_NAME_XPATH = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
    private final static String INPUT_HEIGHT_XPATH = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
    private final static String INPUT_WEIGHT_XPATH = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
    private final static String INPUT_GENDER_MALE_MAN_XPATH = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]";
    private final static String INPUT_GENDER_MALE_WOMEN_XPATH = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[2]";
    private final static String PRESS_BUTTON_XPATH = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";

    WebElement inputName = webDriver.findElement(By.xpath(INPUT_NAME_XPATH));
    WebElement inputHeight = webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH));
    WebElement inputWeight = webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH));
    WebElement inputGenderMaleMan = webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH));
    WebElement inputGenderMaleWomen = webDriver.findElement(By.xpath(INPUT_GENDER_MALE_WOMEN_XPATH));
    WebElement pressButton = webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH));

    @BeforeClass
    public static void beforeAll() {
        webDriver = new ChromeDriver();
    }


    // тест проходит
    @Test
    public void testInputHeight50() throws InterruptedException {

        webDriver.get(WebUrl);

        inputName.sendKeys("NAME");
        inputHeight.sendKeys("50");
        inputWeight.sendKeys("50");
        inputGenderMaleMan.click();
        pressButton.click();

        Thread.sleep(3000);
    }


    @Test(enabled = false)
    public void testInputHeight49() throws InterruptedException {

        webDriver.get(WebUrl);

        inputName.sendKeys("NAME");
        inputHeight.sendKeys("49");
        inputWeight.sendKeys("50");
        inputGenderMaleMan.click();
        pressButton.click();

        Thread.sleep(3000);
    }


    // тест не проходит

    //  @Test(enabled = false)
    //  public void testInputHeight301() throws InterruptedException {

    //      webDriver.get(WebUrl);

    //      webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("NAME");
    //      webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("301");
    //      webDriver.findElement(By.xpath(inputGenderMaleManXPath)).click();
    //      webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("50");
    //      webDriver.findElement(By.xpath(pressButtonXPath)).click();

    //      Thread.sleep(3000);
    //  }

    // @Test(enabled = false)
    // public void testInputHeight150() throws InterruptedException {

    //     webDriver = new ChromeDriver();
    //     webDriver.get(WebUrl);

    //     webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("NAME");
    //     webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("150");
    //     webDriver.findElement(By.xpath(inputGenderMaleWomenXPath)).click();
    //     webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("50");
    //     webDriver.findElement(By.xpath(pressButtonXPath)).click();

    //     Thread.sleep(3000);
    // }


    //  @Test(enabled = false)
    //  public void testInputHeight300() throws InterruptedException {

    //      webDriver = new ChromeDriver();
    //      webDriver.get(WebUrl);

    //      webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("NAME");
    //      webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("300");
    //      webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
    //      webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("50");
    //      webDriver.findElement(By.xpath(pressButtonXPath)).click();

    //      Thread.sleep(3000);
    //  }


    //   тест не проходит
// @Test(enabled = false)
// public void testInputHeight_10() throws InterruptedException {

//        webDriver = new ChromeDriver();
//        webDriver.get(WebUrl);

//        webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("NAME");
//        webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("-10");
//        webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
//        webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("50");
//        webDriver.findElement(By.xpath(pressButtonXPath)).click();

//        Thread.sleep(3000);
//    }


    // тест не проходит
    //  @Test(enabled = false)
    //  public void testInputHeight0() throws InterruptedException {

    //      webDriver = new ChromeDriver();
    //      webDriver.get(WebUrl);

    //      webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("NAME");
    //      webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("0");
    //      webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
    //      webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("50");
    //      webDriver.findElement(By.xpath(pressButtonXPath)).click();

    //      Thread.sleep(3000);
    //  }


    //тест не проходит
    // @Test(enabled = false)
    // public void testInputHeight1000000() throws InterruptedException {

    //      webDriver = new ChromeDriver();
    //      webDriver.get(WebUrl);

    //      webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("NAME");
    //      webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("1000000");
    //      webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
    //      webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("50");
    //      webDriver.findElement(By.xpath(pressButtonXPath)).click();

    //      Thread.sleep(3000);
    //  }


    // Если вес начинается c цифры,а дальше идут буквы, символы и прочие- тест проходит при условии попадания в дивпазон!!!!!!!!!!!!!!

//   @Test(enabled = false)
//   public void testInputHeight_a() throws InterruptedException {

//       webDriver = new ChromeDriver();
//       webDriver.get(WebUrl);

//       webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("NAME");
//       webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("140a");
//       webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
//       webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("50");
//       webDriver.findElement(By.xpath(pressButtonXPath)).click();

//       Thread.sleep(3000);
//   }


    // тест не проходит
    //  @Test(enabled = false)
    //  public void testInputHeight_A() throws InterruptedException {

    //      webDriver = new ChromeDriver();
    //      webDriver.get(WebUrl);

    //      webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("NAME");
    //      webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("A");
    //      webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
    //      webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("50");
    //      webDriver.findElement(By.xpath(pressButtonXPath)).click();

    //      Thread.sleep(3000);
    //  }


    //тест не проходит
    //  @Test(enabled = false)
    //  public void testInputHeight_() throws InterruptedException {

    //      webDriver = new ChromeDriver();
    //      webDriver.get(WebUrl);

    //      webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("NAME");
    //      webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("-");
    //      webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
    //      webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("50");
    //      webDriver.findElement(By.xpath(pressButtonXPath)).click();

    //      Thread.sleep(3000);
    //  }


    // тест не проходит
    // @Test(enabled = false)
    //  public void testInputHeight_a1A() throws InterruptedException {

    //      webDriver = new ChromeDriver();
    //      webDriver.get(WebUrl);

    //      webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("NAME");
    //      webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("a*1A");
    //      webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
    //      webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("50");
    //      webDriver.findElement(By.xpath(pressButtonXPath)).click();

    //      Thread.sleep(3000);
    //  }


    //  @Test(enabled = false)
    //  public void testInputHeight_$() throws InterruptedException {

    //      webDriver = new ChromeDriver();
    //      webDriver.get(WebUrl);

    //      webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("NAME");
    //      webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("$&");
    //      webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
    //      webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("50");
    //      webDriver.findElement(By.xpath(pressButtonXPath)).click();

    //      Thread.sleep(3000);
    //  }


    // тест не проходит
    //  @Test(enabled = false)
    //  public void testInputHeightNull() throws InterruptedException {

    //      webDriver = new ChromeDriver();
    //      webDriver.get(WebUrl);

    //      webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("NAME");
    //      webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("");
    //      webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
    //      webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("50");
    //      webDriver.findElement(By.xpath(pressButtonXPath)).click();

    //      Thread.sleep(3000);
    //  }


    // тест не проходит
//  @Test(enabled = false)
//   public void testInputHeightSpace() throws InterruptedException {

//       webDriver = new ChromeDriver();
//       webDriver.get(WebUrl);

//       webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("NAME");
//       webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys(" ");
//       webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
//       webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("50");
//       webDriver.findElement(By.xpath(pressButtonXPath)).click();

//       Thread.sleep(3000);
//   }


    // тест проходит
//    @Test(enabled = false)
//    public void testInputWeight3() throws InterruptedException {
//
//        webDriver = new ChromeDriver();
//        webDriver.get(WebUrl);
//
//        webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("NAME");
//        webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("180");
//        webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("3");
//        webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
//        webDriver.findElement(By.xpath(pressButtonXPath)).click();
//
//        Thread.sleep(3000);
//    }


    //  тест проходит
// @Test(enabled = false)
//   public void testInputWeight500() throws InterruptedException {

//       webDriver = new ChromeDriver();
//       webDriver.get(WebUrl);

//       webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("NAME");
//       webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("180");
//       webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("500");
//       webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
//       webDriver.findElement(By.xpath(pressButtonXPath)).click();

//       Thread.sleep(3000);
//   }


    //тест проходит
    //  @Test(enabled = false)
    //  public void testInputWeight250() throws InterruptedException {

    //      webDriver = new ChromeDriver();
    //      webDriver.get(WebUrl);

    //      webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("NAME");
    //      webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("180");
    //      webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("250");
    //      webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
    //      webDriver.findElement(By.xpath(pressButtonXPath)).click();

    //      Thread.sleep(3000);
    //  }


    //тест не проходит
    //  @Test(enabled = false)
    //  public void testInputWeight2() throws InterruptedException {

    //      webDriver = new ChromeDriver();
    //      webDriver.get(WebUrl);

    //      webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("NAME");
    //      webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("180");
    //      webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("2");
    //      webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
    //      webDriver.findElement(By.xpath(pressButtonXPath)).click();

    //      Thread.sleep(3000);
    //  }


    // тест не проходит
//  @Test(enabled = false)
//   public void testInputWeight501() throws InterruptedException {

//       webDriver = new ChromeDriver();
//       webDriver.get(WebUrl);

//       webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("NAME");
//       webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("180");
//       webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("501");
//       webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
//       webDriver.findElement(By.xpath(pressButtonXPath)).click();

//       Thread.sleep(3000);
//   }


    //  тест не проходит
//   @Test(enabled = false)
//   public void testInputWeight10000000() throws InterruptedException {

//       webDriver = new ChromeDriver();
//       webDriver.get(WebUrl);

//       webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("NAME");
//       webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("180");
//       webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("1000000");
//       webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
//       webDriver.findElement(By.xpath(pressButtonXPath)).click();

//       Thread.sleep(3000);
//   }


    // тест не проходит
//   @Test(enabled = false)
//   public void testInputWeight_100() throws InterruptedException {

//       webDriver = new ChromeDriver();
//       webDriver.get(WebUrl);

//       webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("NAME");
//       webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("180");
//       webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("-100");
//       webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
//       webDriver.findElement(By.xpath(pressButtonXPath)).click();

//       Thread.sleep(3000);
//   }


    // тест не проходит
 // @Test(enabled = false)
 // public void testInputWeight_0() throws InterruptedException {

 //     webDriver = new ChromeDriver();
 //     webDriver.get(WebUrl);

 //     webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("NAME");
 //     webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("180");
 //     webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("0");
 //     webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
 //     webDriver.findElement(By.xpath(pressButtonXPath)).click();

 //     Thread.sleep(3000);
 // }


//   // тест не проходит
//   @Test(enabled = false)
//   public void testInputWeightNull() throws InterruptedException {

//       webDriver = new ChromeDriver();
//       webDriver.get(WebUrl);

//       webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("NAME");
//       webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("");
//       webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("3");
//       webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
//       webDriver.findElement(By.xpath(pressButtonXPath)).click();

//       Thread.sleep(3000);
//   }

// // тест не проходит
// @Test(enabled = false)
// public void testInputWeigh__() throws InterruptedException {

//     webDriver = new ChromeDriver();
//     webDriver.get(WebUrl);

//     webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("NAME");
//     webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("180");
//     webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys(" ");
//     webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
//     webDriver.findElement(By.xpath(pressButtonXPath)).click();

//     Thread.sleep(3000);
//    }


    // тест не проходит
//  @Test(enabled = false)
//  public void testInputWeight_a() throws InterruptedException {

//      webDriver = new ChromeDriver();
//      webDriver.get(WebUrl);

//      webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("NAME");
//      webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("180");
//      webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("aaa");
//      webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
//      webDriver.findElement(By.xpath(pressButtonXPath)).click();

//      Thread.sleep(3000);
//  }


    // тест не проходит

  // public void testInputWeight_AA() throws InterruptedException {

  //     webDriver = new ChromeDriver();
  //     webDriver.get(WebUrl);

  //     webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("NAME");
  //     webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("180");
  //     webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("AA");
  //     webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
  //     webDriver.findElement(By.xpath(pressButtonXPath)).click();

  //     Thread.sleep(3000);
  // }

    // тест не проходит
 // @Test(enabled = false)
 // public void testInputWeight_aA() throws InterruptedException {

 //     webDriver = new ChromeDriver();
 //     webDriver.get(WebUrl);

 //     webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("NAME");
 //     webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("180");
 //     webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("aF");
 //     webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
 //     webDriver.findElement(By.xpath(pressButtonXPath)).click();

 //     Thread.sleep(3000);
 // }


    // Если вес начинается c буквы, символа и прочего, а дальше идут цифры- тест не проходит!!!!!!!!!!!!!!!!!!!!!!!!!!

 //  @Test(enabled = false)
 //  public void testInputWeight_11AAqq() throws InterruptedException {

 //      webDriver = new ChromeDriver();
 //      webDriver.get(WebUrl);

 //      webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("NAME");
 //      webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("180");
 //      webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("%;11");
 //      webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
 //      webDriver.findElement(By.xpath(pressButtonXPath)).click();

 //      Thread.sleep(3000);
 //  }


    // тест не проходит
//   @Test(enabled = false)
//   public void testInputWeight$() throws InterruptedException {

//       webDriver = new ChromeDriver();
//       webDriver.get(WebUrl);

//       webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("NAME");
//       webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("180");
//       webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("*&*");
//       webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
//       webDriver.findElement(By.xpath(pressButtonXPath)).click();

//       Thread.sleep(3000);
//   }


    // тест проходит
 //  @Test(enabled = false)
 //  public void testInputName() throws InterruptedException {

 //      webDriver = new ChromeDriver();
 //      webDriver.get(WebUrl);

 //      webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("NAME");
 //      webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("180");
 //      webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("66");
 //      webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
 //      webDriver.findElement(By.xpath(pressButtonXPath)).click();

 //      Thread.sleep(3000);
 //  }


    // тест не проходит
  // @Test(enabled = false)
  // public void testInputNameNull() throws InterruptedException {

  //     webDriver = new ChromeDriver();
  //     webDriver.get(WebUrl);

  //     webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("");
  //     webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("180");
  //     webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("66");
  //     webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
  //     webDriver.findElement(By.xpath(pressButtonXPath)).click();

  //     Thread.sleep(3000);
  // }


    // тест проходит

  // @Test(enabled = false)
  // public void testInputName$() throws InterruptedException {

  //     webDriver = new ChromeDriver();
  //     webDriver.get(WebUrl);

  //     webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("%$");
  //     webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("180");
  //     webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("66");
  //     webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
  //     webDriver.findElement(By.xpath(pressButtonXPath)).click();

  //     Thread.sleep(3000);
  // }


    // тест не проходит
//  @Test(enabled = false)
//  public void testInputNameSpace() throws InterruptedException {

//      webDriver = new ChromeDriver();
//      webDriver.get(WebUrl);

//      webDriver.findElement(By.xpath(inputNameXPath)).sendKeys(" ");
//      webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("180");
//      webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("66");
//      webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
//      webDriver.findElement(By.xpath(pressButtonXPath)).click();

//      Thread.sleep(3000);
//  }


    // тест не проходит
 //  @Test(enabled = false)
 //  public void testInputName_0() throws InterruptedException {

 //      webDriver = new ChromeDriver();
 //      webDriver.get(WebUrl);

 //      webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("0");
 //      webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("180");
 //      webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("66");
 //      webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
 //      webDriver.findElement(By.xpath(pressButtonXPath)).click();

 //      Thread.sleep(3000);
 //  }


    // тест проходит с двумя нулями в отличии от отдного нуля.

 //  @Test(enabled = false)
 //  public void testInputNameNu__0() throws InterruptedException {

 //      webDriver = new ChromeDriver();
 //      webDriver.get(WebUrl);

 //      webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("00");
 //      webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("180");
 //      webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("66");
 //      webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
 //      webDriver.findElement(By.xpath(pressButtonXPath)).click();

 //      Thread.sleep(3000);
 //  }


    // тест проходит, подставляя пробел и ноль
//   @Test(enabled = false)
//   public void testInputNameNu__0() throws InterruptedException {

//       webDriver = new ChromeDriver();
//       webDriver.get(WebUrl);

//       webDriver.findElement(By.xpath(inputNameXPath)).sendKeys(" 0");
//       webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("180");
//       webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("66");
//       webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
//       webDriver.findElement(By.xpath(pressButtonXPath)).click();

//       Thread.sleep(3000);
//   }


    //тест проходит

 //  @Test(enabled = false)
 //  public void testInputNameNu__() throws InterruptedException {

 //      webDriver = new ChromeDriver();
 //      webDriver.get(WebUrl);

 //      webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("-");
 //      webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("180");
 //      webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("66");
 //      webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
 //      webDriver.findElement(By.xpath(pressButtonXPath)).click();

 //      Thread.sleep(3000);
 //  }


    //тест проходит
//   @Test(enabled = false)
//   public void testInputNameNull() throws InterruptedException {

//       webDriver = new ChromeDriver();
//       webDriver.get(WebUrl);

//       webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("-");
//       webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("180");
//       webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("66");
//       webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
//       webDriver.findElement(By.xpath(pressButtonXPath)).click();

//       Thread.sleep(3000);
//   }


    //тест проходит
 //  @Test(enabled = false)
 //  public void testInputGenderMaleMan() throws InterruptedException {

 //      webDriver = new ChromeDriver();
 //      webDriver.get(WebUrl);

 //      webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("Name");
 //      webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("180");
 //      webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("66");
 //      webDriver.findElement(By.xpath(inputGenderMaleXPath)).click();
 //      webDriver.findElement(By.xpath(pressButtonXPath)).click();

 //      Thread.sleep(3000);
 //  }

    //тест проходит
//  @Test(enabled = false)
//  public void testInputGenderMaleWomen() throws InterruptedException {

//      webDriver = new ChromeDriver();
//      webDriver.get(WebUrl);

//      webDriver.findElement(By.xpath(inputNameXPath)).sendKeys("Name");
//      webDriver.findElement(By.xpath(inputHeightXPath)).sendKeys("180");
//      webDriver.findElement(By.xpath(inputWeightXPath)).sendKeys("66");
//      webDriver.findElement(By.xpath(inputGenderMaleWomenXPath)).click();
//      webDriver.findElement(By.xpath(pressButtonXPath)).click();

//      Thread.sleep(3000);
//  }


    // тест непроходит
 //  @Test(enabled = false)
 //  public void testInputGenderNotMale() throws InterruptedException {

 //      webDriver.get(WebUrl);

 //      WebElement inputName = webDriver.findElement(By.xpath(inputNameXPath));
 //      WebElement inputHeight = webDriver.findElement(By.xpath(inputHeightXPath));
 //      WebElement inputWeight = webDriver.findElement(By.xpath(inputWeightXPath));
 //      WebElement pressButton = webDriver.findElement(By.xpath(pressButtonXPath));

 //      inputName.sendKeys("Name");
 //      inputHeight.sendKeys("180");
 //      inputWeight.sendKeys("66");
 //      pressButton.click();

 //      Thread.sleep(3000);
 //  }

    @AfterClass
    public static void tearDown() {
        webDriver.quit();
    }
}


// 42теста