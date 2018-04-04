package Main;

import FileData.*;
import Product.*;
import Factory.*;

import java.io.IOException;

import FileBuilder.*;

public class BuilderFileWritter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileHeader fHeader = new FileHeader();
		fHeader.setVersionID("Version:1.0");
		fHeader.setHeaderData("2018-04-03");
		FileFooter fFooter = new FileFooter();
		fFooter.setUserNM("Wu-Jiali");
		FileBody fBody = new FileBody("�������ƣ���ƷID��ʡ�����У��۸�");
		NikeFactory nikeFactory= new NikeFactory();
		Product product1 = nikeFactory.getShirt("�㽭", "����", "100");
		Product product2 = nikeFactory.getShirt("����", "����", "150");
		Product product3 = nikeFactory.getSkirt("����", "����", "120");
		KappaFactory kappaFactory= new KappaFactory();
		Product product4 = kappaFactory.getShirt("�㽭", "����", "100");
		Product product5 = kappaFactory.getShirt("����", "����", "150");
		Product product6 = kappaFactory.getSkirt("����", "����", "120");
		fBody.addProduct(product1);
		fBody.addProduct(product2);
		fBody.addProduct(product3);
		fBody.addProduct(product4);
		fBody.addProduct(product5);
		fBody.addProduct(product6);
		
		
		// ����������ı��ļ�
		TxtBuilder txtBuilder = new TxtBuilder();
		Director director1 = new Director(txtBuilder);
		director1.construct(fHeader, fBody, fFooter);
		try {
			txtBuilder.writeResult("testTxt.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// ���������XML�ļ�
		XmlBuilder xmlBuilder = new XmlBuilder();
		Director director2 = new Director(xmlBuilder);
		director2.construct(fHeader, fBody, fFooter);
		try {
			xmlBuilder.writeResult("testXML.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
