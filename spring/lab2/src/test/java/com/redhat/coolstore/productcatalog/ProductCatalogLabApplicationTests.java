package com.redhat.coolstore.productcatalog;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.redhat.coolstore.productcatalog.service.ProductCatalogService;


@SpringBootTest
@ActiveProfiles("dev")
class ProductCatalogApplicationTests {

    @Autowired
    private ProductCatalogService productCatalogService;
	
	@Test
	void contextLoads() {
	}

    @Test
    public void testDefaultProductList() {
        String message = productCatalogService.sayHello();
        assertThat(message).isNotNull();
        assertThat(message).isEqualTo("Hey Developer!");
    }
	
}
