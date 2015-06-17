package edu.mum.cs.waa.fp.as.domain;

 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

 

@Entity(name = "User")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UserId")
	private int userId;
	@Column(name = "UserName", nullable = false, unique = true)
	@NotNull
	@Size(min = 3)
	private String userName;
	@Column
	@NotNull
	@Size(min = 1)
	private String firstName;
	@Column
	@NotNull
	@Size(min = 1)
	private String lastName;
	@NotNull
	@Size(min = 6)
	@Column(name = "Password", nullable = false, unique = false)
	private String password;
	@Column(name = "Enabled", nullable = false, unique = false)
	private boolean enabled=true;
	/*
	 * @ManyToMany
	 * 
	 * @JoinTable (name="User_Role", joinColumns={ @JoinColumn(name="UserId")},
	 * inverseJoinColumns={ @JoinColumn(name="RoleId" ) } ) private Set<Role>
	 * roles;
	 */
	@Column(name = "Role", nullable = false, unique = false)
	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getVerifyPassword() {
		return verifyPassword;
	}

	public void setVerifyPassword(String verifyPassword) {
		this.verifyPassword = verifyPassword;
	}
	@Transient
	private String verifyPassword;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
