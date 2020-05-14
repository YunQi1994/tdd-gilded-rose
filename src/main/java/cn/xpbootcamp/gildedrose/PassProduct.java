package cn.xpbootcamp.gildedrose;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class PassProduct extends Product {
    private int SellIn;
    private int Quality;

    @Override
    public void timeGoesBy(int days) {
        int currentSellIn = SellIn - days;
        if (currentSellIn < 0){
            Quality = 0;
        }else {
            if (currentSellIn >= 10){
                Quality = Math.min(50, Quality + days);
            }
            else if (currentSellIn >= 5){
                int increaseBy1 = days - (10 - currentSellIn);
                int increaseBy2 = (10 - currentSellIn) * 2;
                Quality = Math.min(50, increaseBy1 + increaseBy2 + Quality);
            }else {
                int increaseBy3 = (5 - currentSellIn) * 3;
                int increaseBy2 = 10;
                int increaseBy1 = days - (5 + currentSellIn);
                Quality = Math.min(50, increaseBy1 + increaseBy2 + increaseBy3);
            }


        }
        SellIn = currentSellIn;
    }
}
