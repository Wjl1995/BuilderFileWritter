package FileData;

/**
* Copyright (C), 2018-4-3, WuJiali.
* <p>FileName: FileHeader.java<br>
* FileHeader��Ϊ�ļ��ײ��࣬�����ļ��ײ���Ϣ��<br>
* @author �����
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
