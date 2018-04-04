package Product;

public class KappaSkirt extends Skirt {

	static int ID = 40000;
	
	public KappaSkirt(String province, String city, String price) {
		super(province, city, price);
		// TODO Auto-generated constructor stub
		this.setProductNM("Kappa³ÄÉÀ");
		this.setProductCategoty(String.valueOf(++ID));
	}

}
