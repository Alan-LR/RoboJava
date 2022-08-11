import java.awt.Robot;
import java.awt.event.KeyEvent;

import entities.RoboSoletrando;

public class JavaBotTextos {

    public static void main(String[] args) throws Exception {
        System.out.println("==================BOT INICIADO==================");

        Robot robo = new Robot();
        robo.delay(2000);

        RoboSoletrando rSoletrando = new RoboSoletrando(robo);
        rSoletrando.escrever("TESTANDO O METODO DA APLICACAO");

        // // DELAY PARA EXECUTAR CADA AÇÃO
        // robo.setAutoDelay(10);

        // // DELAY PARA EXECUÇÃO

        // // Comando para digitar com o teclado
        // robo.keyPress(KeyEvent.VK_H);
        // robo.keyRelease(KeyEvent.VK_H);
        // robo.keyPress(KeyEvent.VK_A);
        // robo.keyRelease(KeyEvent.VK_A);
        // robo.keyPress(KeyEvent.VK_C);
        // robo.keyRelease(KeyEvent.VK_C);
        // robo.keyPress(KeyEvent.VK_K);
        // robo.keyRelease(KeyEvent.VK_K);
        // robo.keyPress(KeyEvent.VK_E);
        // robo.keyRelease(KeyEvent.VK_E);
        // robo.keyPress(KeyEvent.VK_A);
        // robo.keyRelease(KeyEvent.VK_A);
        // robo.keyPress(KeyEvent.VK_D);
        // robo.keyRelease(KeyEvent.VK_D);
        // robo.keyPress(KeyEvent.VK_O);
        // robo.keyRelease(KeyEvent.VK_O);

    }

}
