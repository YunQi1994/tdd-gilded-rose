package cn.xpbootcamp.gildedrose;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class Product {

    @NonNull
    private int sellIn;
    @NonNull
    private int quality;

    public void travelOneDay() {
        sellIn--;
        quality--;
    }

    public void travel(int days) {


        sellIn = sellIn - 1;
        quality = quality - 1;

    }
}
