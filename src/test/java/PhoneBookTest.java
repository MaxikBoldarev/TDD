
import org.junit.jupiter.api.Test;
import ru.netology.PhoneBook;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    private static PhoneBook phoneBook = new PhoneBook();

    @Test
    public void addTest() {
        int expected = 2;
        phoneBook.add("Oleg","8950111");
        phoneBook.add("Ira","8951240");
        int actual = phoneBook.add("Oleg","8908754");
        assertEquals(expected,actual);
    }

    @Test
    public void findByName(){
        String expected = "8950111";
        String actual = phoneBook.findByName("Oleg");
        assertEquals(expected,actual);
    }


}
