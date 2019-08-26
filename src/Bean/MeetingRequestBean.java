package Bean;

public class MeetingRequestBean {

	String username,password;
	String date,StartTime,EndTime, MR_No,resource,status,resource_no;
	public String getResource_no() {
		return resource_no;
	}
	public void setResource_no(String resource_no) {
		this.resource_no = resource_no;
	}
	int id;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getMR_No() {
		return MR_No;
	}
	public void setMR_No(String mR_No) {
		MR_No = mR_No;
	}
	public String getResource() {
		return resource;
	}
	public void setResource(String resource) {
		this.resource = resource;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
	

}
