# TDD @Gilded Rose


## 开发环境
 - JDK1.8+
 
## 业务需求

"镶金玫瑰"！这是一家魔兽世界里的小商店。出售的商品也都是高质量的。但不妙的是，随着商品逐渐接近保质期，它们的质量也不断下滑。我们用一个IT系统来更新库存信息。

首先，简单介绍一下我们的系统：

- 所有商品都有一个`SellIn`值，这是商品距离过期的天数，最好在这么多天之内卖掉
- 所有商品都有一个`Quality`值，代表商品的价值
- 商品的`SellIn`值和`Quality`值，它们每天会发生变化，但是会有特例


商品的价格规则说明如下：

- 商品的价值永远不会小于0，也永远不会超过50
- 一旦过了保质期，`Quality`就以双倍的速度下滑
- 陈年干酪（`Aged Brie`）是一种特殊的商品，放得越久，价值反而越高
- 萨弗拉斯（`Sulfuras`）是一种传奇商品，没有保质期的概念，价值也不会下滑
- 后台门票（`Backstage pass`）和陈年干酪（`Aged Brie`）有相似之处：
	- 越接近演出日，商品的价值反而上升
	- 在演出前10天，价值每天上升2点
	- 演出前5天，价值每天上升3点
	- 一旦过了演出日，价值就马上变成0







## Tasking

* 1. given a product with SellIn 5, when one day past, then its SellIn should decrease to 4.
* 2. given a normal product with SellIn 5 and Quality 10, when one day past, then its Quality should decrease to 9.
* 3. given a normal product with SellIn 0 and Quality 10, when one day past, then its Quality should decrease to 8.
* 4. given a normal product with SellIn 5 and Quality 0, when one day past, then Quality should still be 0.
* 5. given a normal product with SellIn 0 and Quality 0, when oen day past, then Quality should still be 0.

* 6. given an Aged Brie with SellIn 5 and Quality 10, when one day past, then Quality should increase to 11.
* 7. given an expired Aged Brie with SellIn 0 and Quality 10, when one day past, then Quality should increase to 12.
* 8. given an Aged Brie with SellIn 5 and Quality 50, when one day past, then Quality will still be 50.
* 8. given an Aged Brie with SellIn 0 and Quality 49, when one day past, then Quality will increase to 50.

* 9. given a Sulfuras with Quality 10, when one day past, then Quality will still be 10.

* 10. given a Backstage Pass with SellIn 11 and Quality 10, when one day past, then Quality should increase to 11.
* 11. given a Backstage Pass and SellIn 11 and Quality 50, when one day past, then Quality will still be 50.
* 12. given a Backstage Pass and SellIn 10 and Quality 10, when one day past, then Quality will increase to 12.
* 13. given a Backstage Pass and SellIn 10 and Quality 49, when one day past, then Quality will increase to 50.
* 14. given a Backstage Pass and SellIn 5 and Quality 10, when one day past, then Quality will increase to 13.
* 15. given a Backstage Pass and SellIn 5 and Quality 49, when one day past, then Quality will increase to 50.
* 16. given a Backstage Pass and SellIn 1 and Quality 50, when one day past, then Quality will still be 50.
* 17. given a Backstage Pass and SellIn 0 and Quality 10, when one day past, then Quality will decrease to 0.

















