import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.StaticVariables.FELINE_FAMILY;
import static com.example.StaticVariables.LIST_FOOD_FOR_FELINE;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    private Feline feline;

    @Mock
    private Feline felineMock;
    @Spy
    private Feline felineSpy;

    @Before
    public void createFeline() {
        felineMock = new Feline();
    }

    @Test
    public void eatMeatTest() throws Exception {
        Assert.assertEquals("Неверный список продуктов", LIST_FOOD_FOR_FELINE, felineMock.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        Assert.assertEquals("Неверный список продуктов", FELINE_FAMILY, felineMock.getFamily());
    }

    @Test
    public void getKittensWithParamEquals1Test() {
        felineSpy.getKittens(1);
        Assert.assertEquals(1, felineSpy.getKittens());
    }

    @Test
    public void getKittensWithoutParamsTest() {
        felineSpy.getKittens();
        Mockito.verify(felineSpy, Mockito.times(1)).getKittens();
    }
}
