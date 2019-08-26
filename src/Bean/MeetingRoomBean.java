package Bean;

import java.time.LocalDate;

public class MeetingRoomBean  {

	String username,password;
	String MR_No,Date,StartTime,EndTime,bookedby;

	public String getMR_No() {
		return MR_No;
	}

	public void setMR_No(String mR_No) {
		MR_No = mR_No;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
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

	public String getBookedby() {
		return bookedby;
	}

	public void setBookedby(String bookedby) {
		this.bookedby = bookedby;
	}

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
	
}
