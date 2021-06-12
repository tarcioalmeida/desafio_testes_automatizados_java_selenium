package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,15);
    }

    //Aguardar exibição dos elementos
    public void aguardarExibicaoElemento(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public void clicar (By elementBy) {
        aguardarExibicaoElemento(elementBy);
        driver.findElement(elementBy).click();
    }
    public void escreverTexto (By elementBy, String text) {
        aguardarExibicaoElemento(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }

    public void selecionarOpcao (By elementBy, String textoVisivel) {
        aguardarExibicaoElemento(elementBy);
        Select opcoes = new Select(driver.findElement(elementBy));
        opcoes.selectByVisibleText(textoVisivel);
    }

    public void checarVisibilidade(By elementBy){
        boolean estaVisivel = wait.until(ExpectedConditions.invisibilityOfElementLocated(elementBy));
        Assert.assertTrue(estaVisivel);
    }

    public void checarVisibilidadeImagem(By elementBy){
        boolean estaVisivel = driver.findElement(elementBy).isDisplayed();
        Assert.assertTrue(estaVisivel);
    }

    public void entrarFrame(By elementBy){
        driver.switchTo().frame(driver.findElement(elementBy));
    }

    public void sairFrame(){
        driver.switchTo().defaultContent();
    }
}