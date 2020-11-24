package com.naveen.projectserviceui;

import org.springframework.stereotype.Component;

@Component
public class Project {

	
	private Integer pnumber;
	private String pname;
	private String plocation;
	private Integer dnum;
	
	public Project(Integer pnumber, String pname, String plocation, Integer dnum) {
		super();
		this.pnumber = pnumber;
		this.pname = pname;
		this.plocation = plocation;
		this.dnum = dnum;
	}
	
	public Project() {
		
	}
	public Integer getPnumber() {
		return pnumber;
	}
	public void setPnumber(Integer pnumber) {
		this.pnumber = pnumber;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPlocation() {
		return plocation;
	}
	public void setPlocation(String plocation) {
		this.plocation = plocation;
	}
	public Integer getDnum() {
		return dnum;
	}
	public void setDnum(Integer dnum) {
		this.dnum = dnum;
	}
	
	@Override
	public String toString() {
		return "Project [pnumber=" + pnumber + ", pname=" + pname + ", plocation=" + plocation + ", dnum=" + dnum + "]";
	}
}
