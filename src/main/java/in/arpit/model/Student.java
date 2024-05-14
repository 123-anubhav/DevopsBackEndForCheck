package in.arpit.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private Integer stuRollNumber;
	private String stuName;
	private String stuEmailID;
	private String stuMobileNumber;
	public Integer getStuRollNumber() {
		return stuRollNumber;
	}
	public void setStuRollNumber(Integer stuRollNumber) {
		this.stuRollNumber = stuRollNumber;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuEmailID() {
		return stuEmailID;
	}
	public void setStuEmailID(String stuEmailID) {
		this.stuEmailID = stuEmailID;
	}
	public String getStuMobileNumber() {
		return stuMobileNumber;
	}
	public void setStuMobileNumber(String stuMobileNumber) {
		this.stuMobileNumber = stuMobileNumber;
	}
	@Override
	public String toString() {
		return "Student [stuRollNumber=" + stuRollNumber + ", stuName=" + stuName + ", stuEmailID=" + stuEmailID
				+ ", stuMobileNumber=" + stuMobileNumber + "]";
	}
	

}
