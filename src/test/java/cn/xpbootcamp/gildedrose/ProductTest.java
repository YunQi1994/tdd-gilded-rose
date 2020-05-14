package cn.xpbootcamp.gildedrose;

import org.junit.Test;
import org.junit.Assert;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductTest {

    @Test
    public void should_decrease_day_by_day_given_a_product_when_time_goes_by() {
        Product product = new NormalProduct(10, 10);
        product.timeGoesBy(5);

        assertThat(product.getSellIn()).isEqualTo(5);
    }

    @Test
    public void should_quality_decrease_by_1_per_day_given_a_normal_product_within_expired_date_when_time_goes_by() {
        Product product = new NormalProduct(10, 10);
        product.timeGoesBy(5);

        assertThat(product.getQuality()).isEqualTo(5);
    }

    @Test
    public void should_quality_decrease_by_2_per_day_given_a_normal_product_and_being_expired_when_time_goes_by() {
        Product product = new NormalProduct(1, 10);
        product.timeGoesBy(3);

        assertThat(product.getQuality()).isEqualTo(5);
    }

    @Test
    public void should_quality_will_never_be_less_than_0_given_a_normal_product_within_expired_date__when_time_goes_by() {
        Product product = new NormalProduct(1, 10);
        product.timeGoesBy(6);
        assertThat(product.getQuality()).isEqualTo(0);
    }

    @Test
    public void should_quality_will_never_be_less_than_0_given_an_expired_product_for_a_long_term_when_time_goes_by() {
        Product product = new NormalProduct(10, 10);
        product.timeGoesBy(10);

        assertThat(product.getQuality()).isEqualTo(0);
    }

    @Test
    public void should_quality_increase_by_1_point_per_day_given_an_on_date_Aged_Brie_when_time_goes_by() {
        Product product = new AgedBrieProduct(10, 10);
        product.timeGoesBy(5);

        assertThat(product.getQuality()).isEqualTo(15);
    }

    @Test
    public void should_quality_increase_by_3_points_per_day_given_an_expired_Aged_Brie_when_time_goes_by() {
        Product product = new AgedBrieProduct(5, 10);
        product.timeGoesBy(10);

        assertThat(product.getQuality()).isEqualTo(30);
    }

    @Test
    public void should_quality_never_will_be_greater_than_50_given_an_Aged_Brie_expired_for_a_long_term_when_time_goes_by() {
        Product product = new AgedBrieProduct(1, 10);
        product.timeGoesBy(21);

        assertThat(product.getQuality()).isEqualTo(50);
    }

    @Test
    public void should_quality_never_will_change_given_a_Sulfuras_when_time_goes_by() {
        Product product = new LegendProduct(10);
        product.timeGoesBy(5);

        assertThat(product.getQuality()).isEqualTo(10);
    }

    @Test
    public void should_quality_increase_by_1_per_day_given_a_Backstage_Pass_and_before_10_days_ahead_of_the_performance_when_time_goes_by() {
        Product product = new PassProduct(15,10);
        product.timeGoesBy(5);

        assertThat(product.getQuality()).isEqualTo(15);
    }

    @Test
    public void should_quality_become_0_given_a_Backstage_Pass_and_performance_day_has_past_when_time_goes_by() {
        Product product = new PassProduct(1,50);
        product.timeGoesBy(2);

        assertThat(product.getQuality()).isEqualTo(0);
    }

    @Test
    public void should_quality_increase_2_points_per_day_given_a_Backstage_Pass_and_during_10_to_5_days_ahead_of_the_performance_when_time_goes_by() {
        Product product = new PassProduct(15,10);
        product.timeGoesBy(10);

        assertThat(product.getQuality()).isEqualTo(25);
    }

    @Test
    public void should_quality_increase_3_points_per_day_given_a_Backstage_Pass_and_during_5_to_0_days_ahead_of_the_performance_when_time_goes_by() {
        Product product = new PassProduct(15,10);
        product.timeGoesBy(10);

        assertThat(product.getQuality()).isEqualTo(25);
    }

}