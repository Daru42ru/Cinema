import org.example.CinemaItem;
import org.example.CinemaManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CinemaManagerTest {
    CinemaItem item_1 = new CinemaItem(1, 01, "Бладшот");
    CinemaItem item_2 = new CinemaItem(2, 02, "Вперёд");
    CinemaItem item_3 = new CinemaItem(3, 03, "Отель 'Белград'");
    CinemaItem item_4 = new CinemaItem(4, 04, "Джентельмены");
    CinemaItem item_5 = new CinemaItem(5, 05, "Человек-невидимка");
    @Test
    public void shouldSave() {
        CinemaManager cond = new CinemaManager();
        cond.save(item_1);
        cond.save(item_2);
        cond.save(item_3);
        cond.save(item_4);
        cond.save(item_5);
        CinemaItem[] expected = {item_1, item_2, item_3, item_4,item_5};
        CinemaItem[] actual = cond.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindAll() {
        CinemaManager cond = new CinemaManager();
        cond.save(item_1);
        cond.save(item_2);
        cond.save(item_3);
        cond.save(item_4);
        cond.save(item_5);
        CinemaItem[] expected = {item_1, item_2, item_3, item_4,item_5};
        CinemaItem[] actual = cond.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindLast() {
        CinemaManager cond = new CinemaManager(5);
        cond.save(item_1);
        cond.save(item_2);
        cond.save(item_3);
        cond.save(item_4);
        cond.save(item_5);
        CinemaItem[] expected = {item_5, item_4, item_3, item_2,item_1};
        CinemaItem[] actual = cond.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindLastIfLimit3Cinema4() {
        CinemaManager cond = new CinemaManager(3);
        cond.save(item_1);
        cond.save(item_2);
        cond.save(item_3);
        cond.save(item_4);
        CinemaItem[] expected = {item_4, item_3, item_2};
        CinemaItem[] actual = cond.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindLastIfLimit4Cinema3() {
        CinemaManager cond = new CinemaManager(4);
        cond.save(item_1);
        cond.save(item_2);
        cond.save(item_3);
        CinemaItem[] expected = {item_3, item_2, item_1};
        CinemaItem[] actual = cond.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
