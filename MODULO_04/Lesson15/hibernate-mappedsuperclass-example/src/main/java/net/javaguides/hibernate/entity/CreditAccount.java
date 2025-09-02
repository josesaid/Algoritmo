package net.javaguides.hibernate.entity;


import jakarta.persistence.Entity;
import lombok.Data;

@Entity//(name="CreditAccount")
@Data
public class CreditAccount extends Account {
	private double creditLimit;
}