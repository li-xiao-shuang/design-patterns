import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lixiaoshuang
 */
public class QuestionBankControllerTest {
    
    @Test
    public void createPaper() throws CloneNotSupportedException {
        QuestionBankController questionBankController = new QuestionBankController();
        System.out.println(questionBankController.createPaper("花花", "1000001921032"));
        System.out.println(questionBankController.createPaper("豆豆", "1000001921051"));
        System.out.println(questionBankController.createPaper("大宝", "1000001921987"));
    }
}