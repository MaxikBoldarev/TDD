import org.junit.jupiter.api.Test;
import ru.netology.PhoneBook;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    private static PhoneBook phoneBook = new PhoneBook();

    @Test
    public void addTest() {
        int expected = 2;
        phoneBook.add("Oleg", "8950111");
        phoneBook.add("Ira", "8951240");
        int actual = phoneBook.add("Oleg", "8908754");
        assertEquals(expected, actual);
    }

    @Test
    public void findByNumber() {
        phoneBook.add("Oleg", "8950111");
        String expected = "Oleg";
        String actual = phoneBook.findByNumber("8950111");
        assertEquals(expected, actual);
    }

    @Test
    public void findByName() {
        phoneBook.add("Oleg", "8950111");
        String expected = "8950111";
        String actual = phoneBook.findByName("Oleg");
        assertEquals(expected, actual);
    }

    @Test
    public void printAllName() {
        phoneBook.add("Oleg", "8950111");
        phoneBook.add("Ira", "8951240");
        String[] expected = {"Ira", "Oleg"};
        List<String> actual = phoneBook.printAllNames();
        assertThat(actual, contains(expected));
    }
}
