package com.sip.ams.entities;

public class Etudiant {
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", email=" + email + ", age=" + age + "]";
	}
	private String nom;
	private String email;
	private int age;
	public String getNom() {
		return nom;
	}
	public Etudiant(String nom, String email, int age) {
		this.nom = nom;
		this.email = email;
		this.age = age;
	}
	
	public Etudiant() {
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
