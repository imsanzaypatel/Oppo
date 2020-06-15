package com.oppo.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
		@Id
		private int user_id;
		private String name;
		private String password;
		private String mobile;
		private String DOB;
		private String address;
		private String profilePicture;
		
		@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
		@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
		private Set<Role> roles;
		
		//User Registration, login, logout, profile update(Name, Mobile, DOB, profile picture, Address), fetch userDetails.
}

