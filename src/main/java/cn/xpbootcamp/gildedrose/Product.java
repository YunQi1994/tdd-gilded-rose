package cn.xpbootcamp.gildedrose;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Product {

    int SellIn;
    int Quality;

    public abstract void timeGoesBy(int days);

}
