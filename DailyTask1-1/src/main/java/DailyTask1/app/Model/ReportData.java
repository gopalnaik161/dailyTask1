package DailyTask1.app.Model;

import javax.persistence.Entity;
import javax.persistence.Id;


public class ReportData {
	

	
    private String targetSystemCode;
    private String targetSystemName;
    private String screenCode;
    private String screenName;
    private String objectCode;
    private String objectName;
    private String objectType;
    private String setUpValue_Desc;
    private String path;

    public ReportData(String targetSystemCode, String targetSystemName, String screenCode, String screenName, String objectCode, String objectName, String objectType, String setUpValue_Desc, String path) {
        this.targetSystemCode = targetSystemCode;
        this.targetSystemName = targetSystemName;
        this.screenCode = screenCode;
        this.screenName = screenName;
        this.objectCode = objectCode;
        this.objectName = objectName;
        this.objectType = objectType;
        this.setUpValue_Desc = setUpValue_Desc;
        this.path = path;
    }

	public String getTargetSystemCode() {
		return targetSystemCode;
	}

	public void setTargetSystemCode(String targetSystemCode) {
		this.targetSystemCode = targetSystemCode;
	}

	public String getTargetSystemName() {
		return targetSystemName;
	}

	public void setTargetSystemName(String targetSystemName) {
		this.targetSystemName = targetSystemName;
	}

    
    
	public String getScreenCode() {
		return screenCode;
	}

//public ReportData(String screenCode, String screenName, String objectCode, String objectName, String objectType) {
//
//	this.screenCode = screenCode;
//	this.screenName = screenName;
//	this.objectCode = objectCode;
//	this.objectName = objectName;
//	this.objectType = objectType;
//}

//	public ReportData(String screenCode, String screenName) {
//	
//	this.screenCode = screenCode;
//	this.screenName = screenName;
//}

	public void setScreenCode(String screenCode) {
		this.screenCode = screenCode;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public String getObjectCode() {
		return objectCode;
	}

	public void setObjectCode(String objectCode) {
		this.objectCode = objectCode;
	}
//
	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}
//
	public String getObjectType() {
		return objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}
//
	public String getObjectTypeDescription() {
		return setUpValue_Desc;
	}

	public void setObjectTypeDescription(String setUpValue_Desc) {
		this.setUpValue_Desc = setUpValue_Desc;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
    

}

