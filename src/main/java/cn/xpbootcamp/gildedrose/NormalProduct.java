package cn.xpbootcamp.gildedrose;

public class NormalProduct extends Product {

    public NormalProduct(String name, int quality, int sellIn) {
        super(name, quality, sellIn);
    }

    @Override
    public void updateQuality() {
        decreaseQuality();
        if (isExpired()){
            decreaseQuality();
        }
    }
}
