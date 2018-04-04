package Product;

public class NikeShirt extends Shirt {

	static int ID = 10000;
	
	public NikeShirt( String province, String city, String price) {
		super(province, city, price);
		// TODO Auto-generated constructor stub
		this.setProductNM("дм©кЁдию");
		this.setProductCategoty(String.valueOf(++ID));
	}

}
