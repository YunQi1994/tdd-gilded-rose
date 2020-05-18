package cn.xpbootcamp.gildedrose;

public class Sulfuras extends Product {

    public Sulfuras(int quality) {
        super(quality);
    }

    @Override
    public void oneDayPast(){
        System.out.println("Legend product is immortal !!!");
    }


}
