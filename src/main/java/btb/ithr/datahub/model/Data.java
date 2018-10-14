package btb.ithr.datahub.model;

import java.io.Serializable;

public class Data implements Serializable {

	private static final long serialVersionUID = -746388966858050916L;

	private static int count = 0;

	private String strRefID;
	private String strTableName;
	private String strFieldName;
	private String strDataType;
	private String strLength;

	public Data() {

	}

	public String getStrRefID() {
		return strRefID;
	}

	public void setStrRefID(String strRefID) {
		this.strRefID = strRefID;
	}

	public String getStrTableName() {
		return strTableName;
	}

	public void setStrTableName(String strTableName) {
		this.strTableName = strTableName;
	}

	public String getStrFieldName() {
		return strFieldName;
	}

	public void setStrFieldName(String strFieldName) {
		this.strFieldName = strFieldName;
	}

	public String getStrDataType() {
		return strDataType;
	}

	public void setStrDataType(String strDataType) {
		this.strDataType = strDataType;
	}

	public String getStrLength() {
		return strLength;
	}

	public void setStrLength(String strLength) {
		this.strLength = strLength;
	}

}
