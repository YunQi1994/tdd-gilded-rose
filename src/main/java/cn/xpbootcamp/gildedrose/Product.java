package cn.xpbootcamp.gildedrose;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class Product {

    @NonNull private String name;
    @NonNull private int sellIn;
    @NonNull private int quality;

}
