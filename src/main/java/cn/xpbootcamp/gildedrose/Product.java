package cn.xpbootcamp.gildedrose;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Product {

    protected int sellIn;
    protected int quality;

    public Product(int sellIn, int quality) {
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public Product(int quality){
        this.quality = quality;
    }

    protected void decreaseQuality() {
        if (quality > 0){
            quality --;
        }
    }

    protected void increaseQuality() {
        if (quality < 50) {
            quality++;
        }
    }

    protected void decreaseSellIn() {
        sellIn--;
    }

    protected boolean isExpired() {
        return sellIn < 0;
    }

    public abstract void oneDayPast();
}
