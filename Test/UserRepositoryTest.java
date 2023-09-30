package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserRepositoryTest {

    @Test
    public void testLogoutAllNonAdminUsers() {
        UserRepository repo = new UserRepository();
        User admin = new User("admin", "password", true);
        User user1 = new User("user1", "password", false);
        User user2 = new User("user2", "password", false);

        // Предположим, что все пользователи были аутентифицированы
        admin.isAuthenticate = true;
        user1.isAuthenticate = true;
        user2.isAuthenticate = true;

        repo.addUser(admin);
        repo.addUser(user1);
        repo.addUser(user2);

        repo.logoutAllNonAdminUsers();

        assertTrue(admin.isAuthenticate);
        assertFalse(user1.isAuthenticate);
        assertFalse(user2.isAuthenticate);
    }
}
