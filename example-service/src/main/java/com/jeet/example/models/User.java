package com.jeet.example.models;

import lombok.Data;

//@Entity
@Data
public class User
{

	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String firstName;
	private String lastName;
}
