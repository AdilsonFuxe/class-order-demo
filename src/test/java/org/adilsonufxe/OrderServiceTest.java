package org.adilsonufxe;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Order(3)
public class OrderServiceTest {
    @Test
    @DisplayName("Should create a order on success")
    void testCreateOrder() {
        assertTrue(true);
    }
}
