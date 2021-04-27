package com.example.oracleaccesssvc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TEST_TBL")
public class TestTbl {
	
    private Integer id;
    private String fname;
    private String lname;
    
    public TestTbl() {
    }
 
    public TestTbl(Integer id, String fname, String lname) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

}
