package Product;

public class ProductCounter {

	private static ProductCounter instance = null;
	int i = 0;
	
	private ProductCounter()
	{
	}
	
	public int getProductCount()
	{
		return i;
	}
	
	public void newProduct()
	{
		i++;
	}
	
	public static ProductCounter getInstance()
	{
		synchronized (ProductCounter.class)
		{
			if (instance == null)
				instance = new ProductCounter();
		}
		return instance;
	}
}
