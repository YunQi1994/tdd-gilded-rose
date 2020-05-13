package cn.xpbootcamp.gildedrose;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class AgedBrieProduct extends Product {
    private int SellIn;
    private int Quality;

    @Override
    public void timeGoesBy(int days) {
        Quality += days;
    }
}
