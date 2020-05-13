package cn.xpbootcamp.gildedrose;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LegendProduct extends Product {

    private int Quality;

    public LegendProduct(int Quality) {
        this.Quality = Quality;
    }

    @Override
    public void timeGoesBy(int days) {
        System.out.println("Legend Quality is forever");
    }

}
