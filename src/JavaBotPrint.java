import java.awt.Robot;
import java.awt.Dimension;
import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class JavaBotPrint {
    public static void main(String[] args) throws AWTException {
        System.out.println("==================BOT INICIADO==================");

        Robot robo = new Robot();
        // seta um delay para cada evento que o robo executa - em milisegundos
        robo.setAutoDelay(1000);

        // precisamos pegar os pixels da tela para printar, utilizamos o Toolkit
        Toolkit.getDefaultToolkit().getScreenSize();
        // recupero a resolução da tela
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        // crio um retangulo do tamanho da tela
        Rectangle retanguloPrint = new Rectangle(
                (int) screenSize.getWidth(),
                (int) screenSize.getHeight());
        // mando o robo criar uma imagem da tela
        BufferedImage imagemBuffer = robo.createScreenCapture(retanguloPrint);
        // crio o arquivo de imagem no filesistem do so
        File arquivoImg = new File("D:/Documentos/TESTEPRINT/tela.png");
        try {
            ImageIO.write(imagemBuffer, "png", arquivoImg);
            if (arquivoImg.exists()) {
                System.out.println(arquivoImg.getAbsolutePath());
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
