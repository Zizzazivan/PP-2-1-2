import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = kata.java.preproj.msk.AppConfig.class)
public class AppTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void mainTest() {
        kata.java.preproj.msk.HelloWorld tree =
                applicationContext.getBean(kata.java.preproj.msk.HelloWorld.class);
        kata.java.preproj.msk.HelloWorld leaf =
                applicationContext.getBean(kata.java.preproj.msk.HelloWorld.class);

        kata.java.preproj.msk.Cat one = applicationContext.getBean(kata.java.preproj.msk.Cat.class);
        kata.java.preproj.msk.Cat two = applicationContext.getBean(kata.java.preproj.msk.Cat.class);

        Assert.assertSame("Тест провален, не корректная настройка бина kata.java.preproj.msk.HelloWorld", tree, leaf);
        Assert.assertNotSame("Тест провален, не корректная настройка бина kata.java.preproj.msk.Cat", one, two);
    }
}
