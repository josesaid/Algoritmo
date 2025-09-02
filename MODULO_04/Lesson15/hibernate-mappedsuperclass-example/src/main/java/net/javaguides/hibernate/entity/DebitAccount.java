package net.javaguides.hibernate.entity;


import jakarta.persistence.Entity;

@Entity//(name="DebitAccount")
public class DebitAccount extends Account {
	private double overdraftFee;
}