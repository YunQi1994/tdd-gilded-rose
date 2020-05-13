package cn.xpbootcamp.gildedrose;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
public class Product {

    private int SellIn;
    private int Quality;

    public void timeGoesBy(int days) {
        if (SellIn < days){
            Quality =- SellIn;
            Quality -= 2 * (days-SellIn);
        }else {
            SellIn -= days;
            Quality -= days;
        }
    }

}
