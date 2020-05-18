package cn.xpbootcamp.gildedrose;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SulfurasTest {

    @Test
    public void given_Sulfuras_with_Quality_10_when_one_day_pass_then_Quality_10(){
        Product sulfuras = new Sulfuras(10);
        sulfuras.oneDayPast();
        assertThat(sulfuras.getQuality()).isEqualTo(10);
    }
}