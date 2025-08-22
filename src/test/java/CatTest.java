import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.StaticVariables.CAT_SOUND;
import static com.example.StaticVariables.LIST_FOOD_FOR_FELINE;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;
    private Cat cat;

    @Before
    public void createCat() {
        cat = new Cat(feline);
    }

    @Test
    public void getSoundTest() {
        Assert.assertEquals("Кот говорит не так", CAT_SOUND, cat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(LIST_FOOD_FOR_FELINE);
        Assert.assertEquals("Неверный список продуктов", LIST_FOOD_FOR_FELINE, cat.getFood());

    }
}
