package testelogin;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testesenha {
private WebDriver driver;


@Before
public void abrirNavegador() {
	System.setProperty("webdriver.chrome.driver","/Applications/chromedriver");
	driver = new ChromeDriver();
}

@Test
public void testeNavegador() {
	driver.get("http://localhost:4200/login");
 WebElement inputEmail = driver.findElement(By.id("email"));
 WebElement inputSenha = driver.findElement(By.id("senha"));
 WebElement botaoLogin = driver.findElement(By.id("botao-enviar"));
 String[] listaSenhas = {"senhaum","senhadois","senhaerrada","outrasenhaerrada","senha321"};
 for (int tentativas = 0; tentativas < listaSenhas.length; tentativas++) {
		 
	 try{
		 inputEmail.clear();
		 inputSenha.clear();
		 
		 inputEmail.sendKeys("vanessa@email.com");
		 inputSenha.sendKeys(listaSenhas[tentativas]);
		 botaoLogin.click();
		 
		  
		 Thread.sleep(3000);
		 
	 }catch(InterruptedException e){
		 e.printStackTrace();
	 
	 }
	
 }
}
}
