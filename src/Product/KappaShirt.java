package Product;

public class KappaShirt extends Shirt {

	static int ID = 30000;
	
	public KappaShirt(String province, String city, String price) {
		super(province, city, price);
		// TODO Auto-generated constructor stub
		this.setProductNM("Kappa³ÄÉÀ");
		this.setProductCategoty(String.valueOf(++ID));
	}

}
