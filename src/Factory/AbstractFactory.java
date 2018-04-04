package Factory;

import Product.*;

/**
* Copyright (C), 2018-4-3, WuJiali.
* <p>FileName: AbstractFactory.java<br>
* AbstractFactory类为抽象工厂类。<br>
* 工厂生产产品等级结构为两个：衬衫和裙子 
* 工厂产品族为：NIKE和KAPPA
* @author 吴佳力
* @version 1.00
*/
public interface AbstractFactory {

	/** 生产衬衫 */
	public Shirt getShirt(String province, String city, String price);
	/** 生产裙子 */
	public Skirt getSkirt(String province, String city, String price);
}
