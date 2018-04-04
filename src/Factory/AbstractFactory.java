package Factory;

import Product.*;

/**
* Copyright (C), 2018-4-3, WuJiali.
* <p>FileName: AbstractFactory.java<br>
* AbstractFactory��Ϊ���󹤳��ࡣ<br>
* ����������Ʒ�ȼ��ṹΪ������������ȹ�� 
* ������Ʒ��Ϊ��NIKE��KAPPA
* @author �����
* @version 1.00
*/
public interface AbstractFactory {

	/** �������� */
	public Shirt getShirt(String province, String city, String price);
	/** ����ȹ�� */
	public Skirt getSkirt(String province, String city, String price);
}
