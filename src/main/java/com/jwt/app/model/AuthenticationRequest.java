package com.jwt.app.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class AuthenticationRequest implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 3966642324853286791L;

	private String userName;
	private String password;

}
