package cn.xpbootcamp.gildedrose;

public class BackstagePass extends Product {
    public BackstagePass(int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    public void oneDayPast() {
        decreaseSellIn();
        if (isExpired()) {
            decreaseQuality();
            return;
        }
        increaseQuality();
        if (sellIn < 10) {
            increaseQuality();
        }
        if (sellIn < 5) {
            increaseQuality();
        }
    }

    @Override
    protected void decreaseQuality() {
        quality = 0;
    }

}
