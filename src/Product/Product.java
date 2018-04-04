package Product;

public abstract class Product {
	
	private String productNM;
	private String productCategoty;
	private String province;
	private String city;
	private String price;
	
	public Product(String province, String city, String price)
	{
		this.setProvince(province);
		this.setCity(city);
		this.setPrice(price);
	}

	public String getProductNM() {
		return productNM;
	}

	public void setProductNM(String productNM) {
		this.productNM = productNM;
	}

	public String getProductCategoty() {
		return productCategoty;
	}

	public void setProductCategoty(String productCategoty) {
		this.productCategoty = productCategoty;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
}
