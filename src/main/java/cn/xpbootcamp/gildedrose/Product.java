package cn.xpbootcamp.gildedrose;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
public class Product {

    private int SellIn;
    private int Quality;

    public void timeGoesBy(int days) {
        SellIn -= days;
        Quality -= days;
    }
}
