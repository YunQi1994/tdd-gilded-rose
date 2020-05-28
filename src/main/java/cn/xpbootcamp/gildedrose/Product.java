package cn.xpbootcamp.gildedrose;

import lombok.Getter;

@Getter
public abstract class Product {

    private int sellIn;
    private int quality;
    private String name;

    public Product(String name, int quality, int sellIn) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    protected void reSetQuality(){
        this.quality = 0;
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

    protected void updateSellIn() {
        sellIn--;
    }

    protected boolean isExpired() {
        return sellIn < 0;
    }

    public abstract void updateQuality();
    protected void updateProduct(){
        updateSellIn();
        updateQuality();
    };
}
