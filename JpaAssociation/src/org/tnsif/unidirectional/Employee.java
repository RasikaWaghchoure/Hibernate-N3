package org.tnsif.unidirectional;

import java.io.Serializable;

import javax.persistence.CascadeType;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import javax.persistence.Table;

@Entity

@Table(name="Employee")

public class Employee implements Serializable {

private static final long serialVersionUID=1L;
@Id

private Integer empid;

private String empname;


@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="Pincode")

private Address address;


//getter setter

public Integer getEmpid() {

return empid;

}

public void setEmpid(Integer empid) {

this.empid = empid;

}

public String getEmpname() {

return empname;

}

public void setEmpname(String empname) {

this.empname = empname;

}

public Address getAddress() {

return address;

}

public void setAddress(Address address) {

this.address = address;

}

//default constructor

public Employee() {

super();

// TODO Auto-generated constructor stub

}

//para constructor

public Employee(Integer empid, String empname, Address address) {

super();

this.empid = empid;

this.empname = empname;

this.address = address;

}




}