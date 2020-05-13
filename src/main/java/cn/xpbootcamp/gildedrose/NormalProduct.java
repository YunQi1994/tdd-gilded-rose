package cn.xpbootcamp.gildedrose;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class NormalProduct extends Product {

    private int SellIn;
    private int Quality;

    @Override
    public void timeGoesBy(int days) {
        if (SellIn < days){
            Quality -= SellIn;
            Quality = (Math.max(Quality - 2 * (days-SellIn), 0));
        } else {
            SellIn -= days;
            Quality = Math.max(Quality - days, 0);
        }
    }

}
