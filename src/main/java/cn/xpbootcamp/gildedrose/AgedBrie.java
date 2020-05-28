package cn.xpbootcamp.gildedrose;

public class AgedBrie extends Product {

    public AgedBrie(String name, int quality, int sellIn) {
        super(name, quality, sellIn);
    }

    @Override
    public void updateQuality() {
        increaseQuality();
        if (isExpired()){
            increaseQuality();
        }
    }
}
