package cn.xpbootcamp.gildedrose;

public class AgedBrie extends Product {
    public AgedBrie(int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    public void oneDayPast() {
        decreaseSellIn();
        increaseQuality();
        if (isExpired()){
            increaseQuality();
        }
    }
}
