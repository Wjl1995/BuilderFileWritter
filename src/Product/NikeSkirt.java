package Product;

public class NikeSkirt extends Skirt {

	static int ID = 20000;
	
	public NikeSkirt(String province, String city, String price) {
		super(province, city, price);
		// TODO Auto-generated constructor stub
		this.setProductNM("ÄÍ¿ËÈ¹×Ó");
		this.setProductCategoty(String.valueOf(++ID));
	}

}
