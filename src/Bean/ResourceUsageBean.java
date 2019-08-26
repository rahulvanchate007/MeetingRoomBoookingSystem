package Bean;

public class ResourceUsageBean {

	String Res_No,ResName,date,StartTime,EndTime,usedby,usedin;

	public String getRes_No() {
		return Res_No;
	}

	public void setRes_No(String res_No) {
		Res_No = res_No;
	}

	public String getResName() {
		return ResName;
	}

	public void setResName(String resName) {
		ResName = resName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStartTime() {
		return StartTime;
	}

	public void setStartTime(String startTime) {
		StartTime = startTime;
	}

	public String getEndTime() {
		return EndTime;
	}

	public void setEndTime(String endTime) {
		EndTime = endTime;
	}

	public String getUsedby() {
		return usedby;
	}

	public void setUsedby(String usedby) {
		this.usedby = usedby;
	}

	public String getUsedin() {
		return usedin;
	}

	public void setUsedin(String usedin) {
		this.usedin = usedin;
	}
}
