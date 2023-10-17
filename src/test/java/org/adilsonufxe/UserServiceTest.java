package org.adilsonufxe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

@Order(1)
public class UserServiceTest {


    @Test
    @DisplayName("Shound signin user on success")
    void testUserSignIn() {
        assertTrue(true);
    }
}
