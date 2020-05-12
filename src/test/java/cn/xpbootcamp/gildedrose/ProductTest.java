package cn.xpbootcamp.gildedrose;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductTest {

    private String name;

    @Before
    public void setTestProduct(){
        name = "Iron Sword";
    }

    @Test
    public void should_return_product_info_given_a_product_is_created_when_check_product_info() {
        Product product = new Product(name, 20, 10);
        assertThat(product.getQuality()).isEqualTo(10);
        assertThat(product.getSellIn()).isEqualTo(20);
        assertThat(product.getName()).isEqualTo(name);
    }


}