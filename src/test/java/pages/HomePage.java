package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Variáveis da página
    String baseURL = "https://wejump-automation-test.github.io/qa-test/";

    // Elementos
    By btOneBy = By.id("btn_one");
    By btTwoBy = By.id("btn_two");
    By btResetBy = By.id("reset_buttons");
    By linkFourBy = By.id("btn_link");
    By frameBotoesBy = By.xpath("//div/iframe[@src='buttons.html']");
    By campoYourFirstNameBy = By.id("first_name");
    By checkOptionThreeBy = By.id("opt_three");
    By selectBoxBy = By.id("select_box");
    By imgLogoSeleniumBy = By.xpath("//img[@class='img-responsive-center-block' and @alt='selenium']");

    //Métodos da página

    //Ir para página inicial
    public HomePage goToWebJumpPage (){
        driver.get(baseURL);
        return this;
    }

    public HomePage clicarBotaoOne (){
        clicar(btOneBy);
        checarVisibilidade(btOneBy);
        return this;
    }


    public HomePage clicarBotaoTwo (){
        clicar(btTwoBy);
        checarVisibilidade(btTwoBy);
        return this;
    }

    public HomePage clicarBotaoReset (){
        clicar(btResetBy);
        return this;
    }

    public HomePage clicarLinkFour (){
        clicar(linkFourBy);
        checarVisibilidade(linkFourBy);
        return this;
    }

    public HomePage clicarOptionThree (){
        clicar(checkOptionThreeBy);
        return this;
    }

    public HomePage escreverNoCampoYourFirstNameBy(String texto){
        escreverTexto(campoYourFirstNameBy,texto);
        return this;
    }

    public HomePage selecionarOpcao(String textoVisivel){
        selecionarOpcao(selectBoxBy,textoVisivel);
        return this;
    }

    public HomePage checarVisibilidadeLogoSeleniumWebdriver(){
        checarVisibilidadeImagem(imgLogoSeleniumBy);
        return this;
    }

    public HomePage entrarNoFrameBotoes (){
        entrarFrame(frameBotoesBy);
        return this;
    }

    public HomePage sairDoFrameBotoes (){
        sairFrame();
        return this;
    }


}