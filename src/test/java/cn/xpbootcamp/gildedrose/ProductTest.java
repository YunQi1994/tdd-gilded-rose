package cn.xpbootcamp.gildedrose;

import org.junit.Test;
import org.junit.Assert;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductTest {

    private String name;

    @Test
    public void should_decrease_day_by_day_given_a_product_when_time_goes_by() {
        Product product = new Product(10, 10);
        product.timeGoesBy(5);
        int actual = product.getSellIn();
        Assert.assertEquals(5, product.getSellIn());
    }

    @Test
    public void should_quality_decrease_by_1_per_day_given_a_normal_product_within_expired_date_when_when_time_goes_by() {
        Product product = new Product(10, 10);
        product.timeGoesBy(5);

        assertThat(product.getQuality()).isEqualTo(5);
        assertThat(product.getSellIn()).isEqualTo(5);
    }


}