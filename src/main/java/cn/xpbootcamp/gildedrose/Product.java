package cn.xpbootcamp.gildedrose;

import lombok.*;

@AllArgsConstructor
@Getter
public class Product {

    private int SellIn;
    private int Quality;

    public void timeGoesBy(int days) {
        if (SellIn < days){
            Quality -= SellIn;
            Quality = Math.max(Quality - 2 * (days-SellIn), 0);
        }else {
            SellIn -= days;
            Quality = Math.max(Quality - days, 0);

        }
    }

}
