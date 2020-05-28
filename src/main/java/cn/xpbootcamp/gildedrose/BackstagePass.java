package cn.xpbootcamp.gildedrose;

public class BackstagePass extends Product {

    public BackstagePass(String name, int quality, int sellIn) {
        super(name, quality, sellIn);
    }

    @Override
    public void updateQuality() {
        if (isExpired()) {
            reSetQuality();
            return;
        }
        increaseQuality();
        if (this.getSellIn() < 10) {
            increaseQuality();
        }
        if (this.getSellIn() < 5) {
            increaseQuality();
        }
    }

}
