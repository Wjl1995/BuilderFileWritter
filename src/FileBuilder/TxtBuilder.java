package FileBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;

import FileData.*;
import Product.Product;

/**
* Copyright (C), 2018-4-3, WuJiali.
* <p>FileName: TxtBuilder.java<br>
* TxtBuilder类为文本文件建造者类。<br>
* @author 吴佳力
* @version 1.00
*/
public class TxtBuilder implements Builder {

	private StringBuffer buffer = new StringBuffer();
	
	@Override
	public void builderHeader(FileHeader fHeader) {
		// TODO Auto-generated method stub
		buffer.append(fHeader.getVersionID()+","+fHeader.getHeaderData()+"\n");
	}

	@Override
	public void builderBody(FileBody fBody) {
		// TODO Auto-generated method stub
		
		buffer.append(fBody.getTblName()+"\n");
		Collection<Product> colFileBody = fBody.getBodyData();
		for(Product product:colFileBody)
		{
			buffer.append(product.getProductNM()+","+product.getProductCategoty()+","+product.getProvince()+
						","+product.getCity()+","+product.getPrice()+"\n");
		}
	}

	@Override
	public void builderFooter(FileFooter fFooter) {
		// TODO Auto-generated method stub
		buffer.append(fFooter.getUserNM());
	}
	
	public StringBuffer getResult()
	{
		return buffer;
	}
	
	public void writeResult(String fileName) throws IOException
	{
		try {
			FileWriter fout = new FileWriter(fileName);
			fout.write(buffer.toString().toCharArray());
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
