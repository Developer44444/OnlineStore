package com.example.OnlineStore.services;

import com.example.OnlineStore.repo.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.Rollback;

import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class AddProductServiceTest {

    @MockBean
    ProductRepository productRepository;

    @MockBean
    AddProductService addProductService;

    @Test
    public void productAdd() {
        addProductService.addProduct("n", "asdz", 23, "Engine");
    }
}
