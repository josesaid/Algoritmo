package org.example.entity;

import lombok.Data;
import org.example.converters.RatingAttributeConverter;
import org.example.enums.Rating;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The Class User.
 */
@Entity
@Table(name ="USER")
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

	@Convert(converter = RatingAttributeConverter.class)
	private Rating rating;

	@Column(name = "importantValue")
	@Formula("concat(name, '@', 'codegym.com')")
	public String importantValue;

	@Embedded
	public UserAddress userAddress;

	@PostLoad
	public void postLoad (){
		System.out.println("Despues de cargar la información hacemos algo...");
		if (userAddress==null)
			System.err.println("UserAddress es nula");
		else
			System.out.println("User actual: " + this );
	}

	@PrePersist
	public void antesDePersistir (){
		System.out.println("Antes de persistir hacemos algo...LALALALA!");
	}
}
