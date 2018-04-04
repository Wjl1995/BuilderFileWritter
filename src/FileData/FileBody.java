package FileData;

import java.util.ArrayList;
import java.util.Collection;

import Product.Product;

/**
* Copyright (C), 2018-4-3, WuJiali.
* <p>FileName: FileHeader.java<br>
* FileBody��Ϊ�ļ������࣬�����ļ�������Ϣ��<br>
* @author �����
* @version 1.00
*/
public class FileBody {

	private String TblName;
	private Collection<Product> colProduct;
	
	public FileBody(String TblName)
	{
		this.setTblName(TblName);
		colProduct = new ArrayList<Product>();
	}
	
	public void addProduct(Product product)
	{
		this.colProduct.add(product);
	}
	
	public Collection<Product> getBodyData()
	{
		return colProduct;
	}

	public String getTblName() {
		return TblName;
	}

	public void setTblName(String tblName) {
		TblName = tblName;
	}
}
