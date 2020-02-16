package es.upm.miw.iwvg.ecosystem.junit;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest {
    private User user;

    @BeforeEach
    void before() {
        user = new User(21,"matt", "bat");
    }
    @Test
    void fullName(){
        assertEquals("Matt Bat",user.fullName());
    }

    @Test
    void initials(){
        assertEquals("M.B",user.initials());
    }
}
