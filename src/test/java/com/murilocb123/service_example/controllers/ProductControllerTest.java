package com.murilocb123.service_example.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
class ProductControllerTest {

    @InjectMocks
    private ProductController productController;


    @Test
    @DisplayName("1 - Should return a list of products")
    void testList() {
        //act
        var productList = productController.list();

        //assert
        assertNotNull(productList);
        Assertions.assertEquals(3, productList.size());

    }
}
