package Factory;

import Product.*;

public class NikeFactory implements AbstractFactory {

	@Override
	public Shirt getShirt(String province, String city, String price) {
		// TODO Auto-generated method stub
		return new NikeShirt(province, city, price);
	}

	@Override
	public Skirt getSkirt(String province, String city, String price) {
		// TODO Auto-generated method stub
		return new NikeSkirt(province, city, price);
	}

}
