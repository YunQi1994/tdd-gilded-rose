package cn.xpbootcamp.gildedrose;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NormalProductTest {
    @Test
    public void given_normal_product_with_SellIn_5_when_one_day_past_then_SellIn_4() {
        Product normalProduct = new NormalProduct("normal shield",5,10);
        normalProduct.updateProduct();
        assertThat(normalProduct.getSellIn()).isEqualTo(4);
    }

    @Test
    public void given_normal_product_with_SellIn_5_and_Quality_10_when_one_day_past_then_Quality_9() {
        Product normalProduct = new NormalProduct("normal shield",5, 10);
        normalProduct.updateProduct();
        assertThat(normalProduct.getQuality()).isEqualTo(9);
    }

    @Test
    public void given_normal_product_with_SellIn_0_and_Quality_10_when_one_day_past_then_Quality_8() {
        Product normalProduct = new NormalProduct("normal shield",0, 10);
        normalProduct.updateProduct();
        assertThat(normalProduct.getQuality()).isEqualTo(8);
    }

    @Test
    public void given_normal_product_with_SellIn_5_and_Quality_0_when_one_day_past_then_Quality_0() {
        Product normalProduct = new NormalProduct("normal shield",5, 0);
        normalProduct.updateProduct();
        assertThat(normalProduct.getQuality()).isEqualTo(0);
    }

    @Test
    public void given_normal_product_with_SellIn_0_and_Quality_0_when_one_day_past_then_Quality_0() {
        Product normalProduct = new NormalProduct("normal shield",0, 0);
        normalProduct.updateProduct();
        assertThat(normalProduct.getQuality()).isEqualTo(0);
    }
}