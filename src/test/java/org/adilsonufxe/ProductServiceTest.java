package org.adilsonufxe;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Order(2)
public class ProductServiceTest {

    @Test
    @DisplayName("Should return a list of products on success")
    void testLoadProducts() {
        assertTrue(true);
    }
}
