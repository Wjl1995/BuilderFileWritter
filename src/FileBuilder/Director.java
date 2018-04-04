package FileBuilder;

import FileData.*;

/**
* Copyright (C), 2018-4-3, WuJiali.
* <p>FileName: Director.java<br>
* Director��Ϊָ�����ࡣ<br>
* @author �����
* @version 1.00
*/
public class Director {
	
	private Builder builder;
	
	public Director(Builder builder)
	{
		this.builder = builder;
	}
	
	public void construct(FileHeader fHeader, FileBody fBody, FileFooter fFooter)
	{
		builder.builderHeader(fHeader);
		builder.builderBody(fBody);
		builder.builderFooter(fFooter);
	}
}
