package com.murilocb123.service_example.dto;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ProductDTOTest {

    @Test
    @DisplayName("1 - Should create a product")
    void testCreateProduct() {
        //act
        var product = new ProductDTO("Product 1", "Description 1", 100.0);

        //assert
        Assertions.assertNotNull(product);
        Assertions.assertEquals("Product 1", product.name());
        Assertions.assertEquals("Description 1", product.description());
        Assertions.assertEquals(100.0, product.price());
    }

    @Test
    @DisplayName("2 - Should throw an exception when creating a product with null name")
    void testCreateProductWithNullName() {
        //assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> new ProductDTO(null, "Description 1", 100.0));
    }

    @Test
    @DisplayName("3 - Should throw an exception when creating a product with empty name")
    void testCreateProductWithEmptyName() {
        //assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> new ProductDTO("", "Description 1", 100.0));
    }

    @Test
    @DisplayName("4 - Should throw an exception when creating a product with null description")
    void testCreateProductWithNullDescription() {
        //assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> new ProductDTO("Product 1", null, 100.0));
    }

    @Test
    @DisplayName("5 - Should throw an exception when creating a product with empty description")
    void testCreateProductWithEmptyDescription() {
        //assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> new ProductDTO("Product 1", "", 100.0));
    }

    @Test
    @DisplayName("6 - Should throw an exception when creating a product with negative price")
    void testCreateProductWithNegativePrice() {
        //assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> new ProductDTO("Product 1", "Description 1", -100.0));
    }

}
