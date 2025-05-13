import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import static com.example.StaticVariables.FELINE_FAMILY;
import static com.example.StaticVariables.LIST_FOOD_FOR_FELINE;


public class FelineTest {
    private final Feline feline = new Feline();


    @Test
    public void eatMeatTest() throws Exception {
        Assert.assertEquals("Неверный список продуктов", LIST_FOOD_FOR_FELINE, feline.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        Assert.assertEquals("Неверное семейство", FELINE_FAMILY, feline.getFamily());
    }

    @Test
    public void getKittensWithParamsTest() {
        Assert.assertEquals("Неверное количество", 5, feline.getKittens(5));
    }

    @Test
    public void getKittensWithoutParamsTest() {
        Assert.assertEquals("Неверное количество", 1, feline.getKittens());
    }
}
