package javabasecource.module1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by andrew on 25.12.16.
 */
public class QuizTest {
    private Quiz quiz = new Quiz();

    @Test
    public void whenPassPolindrom(){
        Assert.assertTrue(quiz.isPolindrom("Madam I'm adam"));
    }

    @Test
    public void whenPassNotPolindrom(){
        Assert.assertFalse(quiz.isPolindrom("I'm not polindrom."));
    }

    @Test
    public void whenPass6(){
        Assert.assertEquals("Passed value is: 6", 720, quiz.factorial(6).intValue());
    }

}
