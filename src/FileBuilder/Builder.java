package FileBuilder;
import FileData.*;

/**
* Copyright (C), 2018-4-3, WuJiali.
* <p>FileName: Builder.java<br>
* Builder类为抽象建造者类。<br>
* @author 吴佳力
* @version 1.00
*/
public interface Builder {

	public void builderHeader(FileHeader fHeader);
	public void builderBody(FileBody fBody);
	public void builderFooter(FileFooter fFooter);
}
