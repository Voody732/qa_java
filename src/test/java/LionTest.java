import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.StaticVariables.LIST_FOOD_FOR_FELINE;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {


    @Mock
    private Feline feline;

    @Test
    public void exceptionWithInvalidSex() {
        Exception exception = assertThrows(Exception.class, () -> new Lion(feline, "Не определился"));
        Assert.assertEquals("Текст отличается от ожидаемого", "Используйте допустимые значения пола животного - самей или самка", exception.getMessage());
    }

    @Test
    public void getKittensTest() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(3);
        Lion lion = new Lion(feline, "Самка");
        Assert.assertEquals("Число котят неверно", 3, lion.getKittens());
    }

    @Test
    public void getFoodTest() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(LIST_FOOD_FOR_FELINE);
        Lion lion = new Lion(feline, "Самец");
        Assert.assertEquals("Неверный список продуктов", LIST_FOOD_FOR_FELINE, lion.getFood());
    }
}
