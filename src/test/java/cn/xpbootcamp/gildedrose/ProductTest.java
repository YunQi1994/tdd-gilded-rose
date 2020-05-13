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

    @Test
    public void should_decrease_SellIn_by_5_given_a_normal_on_date_product_when_has_existed_5_days() {
        Product product= new Product(name, 20,10);
        product.travelOneDay();

        assertThat(product.getQuality()).isEqualTo(9);
        assertThat(product.getSellIn()).isEqualTo(19);
        assertThat(product.getName()).isEqualTo("Iron Sword");
    }

}