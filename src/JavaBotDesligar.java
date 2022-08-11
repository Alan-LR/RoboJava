import entities.DesligarPc;

import java.awt.AWTException;
import java.awt.Robot;

public class JavaBotDesligar {
    public static void main(String[] args) throws Exception {

        try {
            new DesligarPc(new Robot());
        } catch (AWTException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Robot robo = new Robot();
        // DesligarPc des = new DesligarPc(robo);
        // des.desligar();
    }
}
