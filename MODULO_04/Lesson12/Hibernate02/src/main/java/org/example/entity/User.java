package org.example.entity;

import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import lombok.Data;

/**
 * The Class User.
 */
@Entity
@Table(name ="USERS")
@Data
public class User implements Serializable {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/** The email. */
	@Column
	private String email;

	/** The name. */
	@Column
	private String name;

	/** The phone. */
	@Column
	private String phone;

}
