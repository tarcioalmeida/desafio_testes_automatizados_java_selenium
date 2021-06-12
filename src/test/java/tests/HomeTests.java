package tests;
import org.testng.annotations.Test;
import pages.HomePage;
public class HomeTests extends BaseTest {

    @Test (priority = 0)
    public void clicarNosBotoesOneThreeFour () {
        HomePage homePage = new HomePage(driver);

        homePage.goToWebJumpPage()
        .clicarBotaoOne()
        .clicarBotaoTwo()
        .clicarLinkFour()
        .clicarBotaoReset();
    }

    @Test (priority = 1)
    public void clicarNosBotoesOneThreeFourDentroDoFrame () {
        HomePage homePage = new HomePage(driver);

        homePage.goToWebJumpPage()
                .entrarNoFrameBotoes()
                .clicarBotaoOne()
                .clicarBotaoTwo()
                .clicarLinkFour()
                .sairDoFrameBotoes();
    }

    @Test (priority = 2)
    public void escreverYourFirstName () {
        HomePage homePage = new HomePage(driver);

        homePage.goToWebJumpPage()
                .escreverNoCampoYourFirstNameBy("Escrever um texto")
                .clicarBotaoOne()
                .clicarOptionThree()
                .selecionarOpcao("ExampleTwo")
                .checarVisibilidadeLogoSeleniumWebdriver();

    }

}