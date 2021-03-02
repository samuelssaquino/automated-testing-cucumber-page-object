package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Utility {

    // PRINTA A TELA
    public static void screenshot(WebDriver driver, long ms) {

        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File("./ScreenShots/" + ms + ".jpg"));
            System.out.println("ScreenShot Taken Selenium");
        } catch (Exception e) {
            System.out.println("Exception while taking ScreenShot " + e.getMessage());
        }

    }

    // PRINTA A TELA
//	public static void screenshot(long ms) {
//
//		try {
//
//			Rectangle react = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
//			BufferedImage image = new Robot().createScreenCapture(react);
//			File file = new File("C:\\Users\\SAMUEL\\Documents\\framework\\PmavvAuto\\PmavvEvidencias\\target\\screenshots\\"+ ms +".jpg");
//			ImageIO.write(image, "jpg", file);
//			System.out.println("ScreenShot Taken JAVA");
//
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}

    // PRINTA A TELA NA REDE
    public static void screenshot(long ms) {

        try {

            Rectangle react = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage image = new Robot().createScreenCapture(react);
            File file = new File("T:\\02 TESTE DE SOFTWARE\\PMAVV\\evidencias_auto\\prints\\" + ms + ".jpg");
            ImageIO.write(image, "jpg", file);
            System.out.println("--- Screenshot pmavv ok---");

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    // PARA O SISTEMA DURANTE UM TEMPO "X"
    public static void esperar() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // PASSA O MOUSE SOBRE O ELEMENTO
    public static void hover(WebDriver driver, WebElement element) {

        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    // PASSA O MOUSE SOBRE O ELEMENTO E DEPOIS CLICA
    public static void hoverAndClick(WebDriver driver, WebElement elementToHover, WebElement elementToClick) {

        Actions action = new Actions(driver);
        action.moveToElement(elementToHover).click(elementToClick).build().perform();
    }

    // ENTRA NO FRAME ATUAL
    public static void entraNoFrame(WebDriver driver) {
        driver.switchTo().frame("menu_iframe");

    }

    // ENTRA NO FRAME DEFAULT
    public static void entraFrameDefault(WebDriver driver) {
        driver.switchTo().defaultContent();
    }

}