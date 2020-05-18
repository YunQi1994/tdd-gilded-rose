package cn.xpbootcamp.gildedrose;

public class NormalProduct extends Product {

    public NormalProduct(int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    public void oneDayPast(){
        decreaseSellIn();
        decreaseQuality();
        if (isExpired()){
            decreaseQuality();
        }
    }


}
