package cn.xpbootcamp.gildedrose;

public class Sulfuras extends Product {

    public Sulfuras(String name,int quality) {
        super(name, quality, 0);
    }

    @Override
    public void updateQuality() {
        System.out.println("Legend product is immortal");

    }

    @Override
    public void updateSellIn(){
        System.out.println("Legend product has no SellIn");
    }
}
