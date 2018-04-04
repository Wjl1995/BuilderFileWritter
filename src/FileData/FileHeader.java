package FileData;

/**
* Copyright (C), 2018-4-3, WuJiali.
* <p>FileName: FileHeader.java<br>
* FileHeader类为文件首部类，包含文件首部信息。<br>
* @author 吴佳力
* @version 1.00
*/
public class FileHeader {
	
	private String versionID;
	private String exportDate;
	
	public String getVersionID()
	{
		return versionID;
	}
	
	public void setVersionID(String versionID)
	{
		this.versionID = versionID;
	}
	
	public String getHeaderData()
	{
		return exportDate;
	}
	
	public void setHeaderData(String headerDate)
	{
		this.exportDate = headerDate;
	}
}
