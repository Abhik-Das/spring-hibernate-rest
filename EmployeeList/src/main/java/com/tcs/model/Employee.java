package com.tcs.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="CONTACTS")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Employee")
public class Employee implements Serializable {
	    /**
	 * 
	 */
	private static final long serialVersionUID = 3068039651377105835L;

		@Id
	    @Column(name="ID")
	    private int id;
	    
	    @Column(name="FIRSTNAME")
	    private String firstname;
	    
	    @Column(name="LASTNAME")
	    private String lastname;
	    
	    @Column (name="TELEPHONE")
	    private int telephone;
	    
	    @Column (name="EMAIL")
	    private String email;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public int getTelephone() {
			return telephone;
		}

		public void setTelephone(int telephone) {
			this.telephone = telephone;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Employee(int id, String firstname, String lastname, int telephone, String email) {
			super();
			this.id = id;
			this.firstname = firstname;
			this.lastname = lastname;
			this.telephone = telephone;
			this.email = email;
		}

		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    
}
