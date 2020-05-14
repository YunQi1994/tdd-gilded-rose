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

### assume: system starts from day 0:

* given a store owner using WOW product system, when create a product in system, then create with a name, origin SellIn and origin Quality.
* given a product defined with SellIn and Quality in system, when check product info, then should show its SellIn and Quality info.

* 1. given a product, when time goes by, then its SellIn date should decrease day by day.
* 2. given a normal product and within expired date, when time goes by, then its Quality should decrease by 1 point per day.
* 3. given a normal product and being expired, when time goes by, then its Quality should start to decrease by 2 points per day.
* 4. given a product and within expired date, when time goes by, then Quality will never be less than 0.
* 5. given an expired product for a long term, when time still goes by, then Quality will never be less than 0.

* 6. given an on-date Aged Brie, when time go by, then Quality should increase 1 point per day.
* 7. given an expired Aged Brie, when time go by, then Quality should increase 2 points per day.
* 8. given an Aged Brie and expired for a long term, when time still goes by, then Quality will never be greater than 50.

* 9. given a Sulfuras, when days go by, then Quality should never change.

*given a Backstage Pass and before 10 days ahead of the performance, when times goes by, then Quality should increase 1 point per day.
*given a Backstage Pass and during 10 to 5 days ahead of the performance, when times goes by, then Quality should increase 2 points per day.
*given a Backstage Pass and during 5 to 0 days ahead of the performance, when times goes by, then Quality should increase 3 points per day.
*given a Backstage Pass and as soon as the performance day has past, when times goes by, then Quality should become 0.












