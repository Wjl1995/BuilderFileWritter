package Factory;

import Product.*;

public class KappaFactory implements AbstractFactory {

	@Override
	public Shirt getShirt(String province, String city, String price) {
		// TODO Auto-generated method stub
		return new KappaShirt(province, city, price);
	}

	@Override
	public Skirt getSkirt(String province, String city, String price) {
		// TODO Auto-generated method stub
		return new KappaSkirt(province, city, price);
	}

}
