import org.junit.Test;

import static org.junit.Assert.*;


public class EngineControllerTest {

    @Test
    public void process() {
        EngineController engineController = new EngineController();
        String process = engineController.process("Oli09pLkdjh", "man", 29);
        System.out.println(process);
    }
}