package entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "\"tbl_citizen\"")
public class Citizen extends Commonfield implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	    private int id;
	    private String name;
	    private String address;
	    private String phone;
	    private Date dateOfBirth;
	    

}
