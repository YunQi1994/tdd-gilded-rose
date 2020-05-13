package cn.xpbootcamp.gildedrose;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductTest {

    private String name;

    @Test
    public void should_return_product_info_given_a_product_is_created_when_check_product_info() {
        Product product = new Product( 20, 10);
        assertThat(product.getQuality()).isEqualTo(10);
        assertThat(product.getSellIn()).isEqualTo(20);
    }

    @Test
    public void should_decrease_SellIn_by_1_given_a_on_date_product_when_has_existed_1_day() {
        Product product= new Product(20,10);
        product.travelOneDay();

        assertThat(product.getQuality()).isEqualTo(9);
        assertThat(product.getSellIn()).isEqualTo(19);
    }

    @Test
    public void should_decrease_SellIn_by_5_given_a_on_date_product_when_travel (){
        Product product = new Product(20, 10);
        product.travel(1);

        assertThat(product.getSellIn()).isEqualTo(19);
        assertThat(product.getQuality()).isEqualTo(9);
    }

//    @Test
//    public void should_decrease_by_2_points_given_a_out_of_date_product_when_travel (){
//        Product product = new Product(1, 20);
//        product.travel(1);
//        assertThat(product.getQuality()).isEqualTo(17);
//
//    }

}