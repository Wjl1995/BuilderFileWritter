package FileBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;

import FileData.*;
import Product.Product;

/**
* Copyright (C), 2018-4-3, WuJiali.
* <p>FileName: XmlBuilder.java<br>
* XmlBuilder类为XML文件建造者类。<br>
* @author 吴佳力
* @version 1.00
*/
public class XmlBuilder implements Builder{

	private StringBuffer buffer = new StringBuffer();
	
	@Override
	public void builderHeader(FileHeader fHeader) {
		// TODO Auto-generated method stub
		buffer.append("<?xml version='1.0' encoding='gb2312' ?>\n");
		buffer.append("<Report>\n");
		buffer.append("	<Header>\n");
		buffer.append("		<VersionId>"+fHeader.getVersionID()+"</VersionId>\n");
		buffer.append("		<ExportDate>"+fHeader.getHeaderData()+"</ExportDate>\n");
		buffer.append("	</Header>\n");
	}

	@Override
	public void builderBody(FileBody fBody) {
		// TODO Auto-generated method stub
		buffer.append("	<Body>\n");
		buffer.append("		<Datas FilesName=\""+fBody.getTblName()+"\">\n");
		Collection<Product> colFileBody = fBody.getBodyData();
		for(Product product:colFileBody)
		{
			buffer.append("			<Data>\n");
			buffer.append("				<ProductNM>"+product.getProductNM()+"</ProductNM>\n");
			buffer.append("				<ProductCategoty>"+product.getProductCategoty()+"</ProductCategoty>\n");
			buffer.append("				<Province>"+product.getProvince()+"</Province>\n");
			buffer.append("				<City>"+product.getCity()+"</City>\n");
			buffer.append("				<Price>"+product.getPrice()+"</Price>\n");
			buffer.append("			</Data>\n");
		}
		buffer.append("		</Datas>\n");
		
		buffer.append("	</Body>\n");
	}

	@Override
	public void builderFooter(FileFooter fFooter) {
		// TODO Auto-generated method stub
		buffer.append("	<Footer>\n");
		buffer.append("		<ExportUser>"+fFooter.getUserNM()+"</ExportUser>\n");
		buffer.append("	</Footer>\n");
		buffer.append("</Report>\n");
	}

	public StringBuffer getResult() {
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
