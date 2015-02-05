package com.JessePetersonCIT360;
import java.io.Serializable;


public class EducationBean implements Serializable{

	String state;
	String college;
	String major;
	int gradYear;
	
	public EducationBean(String state, String college, String major, int gradyear) {
		this.state = state;
		this.college = college;
		this.major = major;
		this.gradYear = gradyear;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.college = state;
	}	
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getGradYear() {
		return gradYear;
	}
	public void setGradYear(int gradYear) {
		this.gradYear = gradYear;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((college == null) ? 0 : college.hashCode());
	result = prime * result + gradYear;
	result = prime * result + ((major == null) ? 0 : major.hashCode());
	result = prime * result + ((state == null) ? 0 : state.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	EducationBean other = (EducationBean) obj;
	if (college == null) {
		if (other.college != null)
			return false;
	} else if (!college.equals(other.college))
		return false;
	if (gradYear != other.gradYear)
		return false;
	if (major == null) {
		if (other.major != null)
			return false;
	} else if (!major.equals(other.major))
		return false;
	if (state == null) {
		if (other.state != null)
			return false;
	} else if (!state.equals(other.state))
		return false;
	return true;
}
}
