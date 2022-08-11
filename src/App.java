import java.awt.Robot;
import java.awt.event.InputEvent;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("==================BOT INICIADO==================");

        Robot robo = new Robot();
        // tempo de executar as ações
        robo.setAutoDelay(1000);
        // mover o mouse pra posição
        robo.mouseMove(1420, 15);
        // clicar com o botão esquerdo do mouse
        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        // robo.mouseMove(340, 500);
        // soltar o botão 01
        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        // scroll do mouse
        // robo.mouseWheel(1000);
        // robo.mouseWheel(-1000);

        // botão direito do mouse
        // robo.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        // robo.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);

    }
}
