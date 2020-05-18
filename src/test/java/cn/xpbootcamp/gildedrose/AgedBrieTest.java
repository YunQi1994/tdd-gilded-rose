package cn.xpbootcamp.gildedrose;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AgedBrieTest {
    @Test
    public void given_Aged_Brie_with_SellIn_5_and_Quality_10_when_one_day_past_then_Quality_11() {
        Product agedBrie = new AgedBrie(5, 10);
        agedBrie.oneDayPast();
        assertThat(agedBrie.getQuality()).isEqualTo(11);
    }

    @Test
    public void given_Aged_Brie_with_SellIn_0_and_Quality_10_when_one_day_past_then_Quality_12() {
        Product agedBrie = new AgedBrie(0, 10);
        agedBrie.oneDayPast();
        assertThat(agedBrie.getQuality()).isEqualTo(12);
    }

    @Test
    public void given_Aged_Brie_with_SellIn_5_and_Quality_50_when_one_day_past_then_Quality_50() {
        Product agedBrie = new AgedBrie(5, 50);
        agedBrie.oneDayPast();
        assertThat(agedBrie.getQuality()).isEqualTo(50);
    }


    @Test
    public void given_Aged_Brie_with_SellIn_0_and_Quality_49_when_one_day_past_then_Quality_50() {
        Product agedBrie = new AgedBrie(0, 49);
        agedBrie.oneDayPast();
        assertThat(agedBrie.getQuality()).isEqualTo(50);
    }
}