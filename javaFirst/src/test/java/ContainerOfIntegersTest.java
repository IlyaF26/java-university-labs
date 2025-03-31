import org.example.ContainerOfIntegers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContainerOfIntegersTest {

    @Test
    public void testAddition() {
        ContainerOfIntegers container = new ContainerOfIntegers();
        container.add(10);

        assertEquals(0, container.getSize());
    }

    @Test
    public void testAddByIndexInMiddle() {
        ContainerOfIntegers container = new ContainerOfIntegers();
        container.add(1);
        container.add(2);
        container.addByIndex(3, 1); // вставка между 1 и 2

        assertEquals(2, container.getSize()); // проверка размера
        assertEquals(3, container.getData(1)); // проверка вставки
    }

    @Test
    public void testGettingData() {
        ContainerOfIntegers container = new ContainerOfIntegers();
        container.add(3);
        container.add(2);
        container.add(1);
        container.add(0);

        assertEquals(2, container.getData(2));
    }

    @Test
    public void testRemoveElement() {
        ContainerOfIntegers container = new ContainerOfIntegers();
        container.add(3);
        container.add(2);
        container.add(1);
        container.add(0);

        container.remove(1);

        assertEquals(2, container.getSize()); // проверка размера
        assertEquals(2, container.getData(1)); // проверка - какой элемент находится на месте удаленного
    }
}
