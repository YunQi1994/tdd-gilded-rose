package cn.xpbootcamp.gildedrose;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BackstagePassTest {
    @Test
    public void given_Backstage_Pass_with_SellIn_11_and_Quality_10_when_one_day_past_then_Quality_11() {
        Product backstagePass = new BackstagePass(11, 10);
        backstagePass.oneDayPast();
        assertThat(backstagePass.getQuality()).isEqualTo(11);
    }

    @Test
    public void given_Backstage_Pass_with_SellIn_11_and_Quality_50_when_one_day_past_then_Quality_50() {
        Product backstagePass = new BackstagePass(11, 50);
        backstagePass.oneDayPast();
        assertThat(backstagePass.getQuality()).isEqualTo(50);
    }

    @Test
    public void given_Backstage_Pass_with_SellIn_10_and_Quality_10_when_one_day_past_then_Quality_12() {
        Product backstagePass = new BackstagePass(10, 10);
        backstagePass.oneDayPast();
        assertThat(backstagePass.getQuality()).isEqualTo(12);
    }

    @Test
    public void given_Backstage_Pass_with_SellIn_10_and_Quality_49_when_one_day_past_then_Quality_50() {
        Product backstagePass = new BackstagePass(10, 49);
        backstagePass.oneDayPast();
        assertThat(backstagePass.getQuality()).isEqualTo(50);
    }

    @Test
    public void given_Backstage_Pass_with_SellIn_5_and_Quality_10_when_one_day_past_then_Quality_50() {
        Product backstagePass = new BackstagePass(5, 10);
        backstagePass.oneDayPast();
        assertThat(backstagePass.getQuality()).isEqualTo(13);
    }

    @Test
    public void given_Backstage_Pass_with_SellIn_5_and_Quality_49_when_one_day_past_then_Quality_50() {
        Product backstagePass = new BackstagePass(5, 49);
        backstagePass.oneDayPast();
        assertThat(backstagePass.getQuality()).isEqualTo(50);
    }

    @Test
    public void given_Backstage_Pass_with_SellIn_1_and_Quality_50_when_one_day_past_then_Quality_50() {
        Product backstagePass = new BackstagePass(1, 50);
        backstagePass.oneDayPast();
        assertThat(backstagePass.getQuality()).isEqualTo(50);
    }

    @Test
    public void given_Backstage_Pass_with_SellIn_0_and_Quality_10_when_one_day_past_then_Quality_0() {
        Product backstagePass = new BackstagePass(0, 10);
        backstagePass.oneDayPast();
        assertThat(backstagePass.getQuality()).isEqualTo(0);
    }

}