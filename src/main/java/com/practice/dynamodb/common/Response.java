package com.practice.dynamodb.common;


import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Response<T> {
	
	T data;
	
	HttpStatus status;
	
	@JsonProperty("status_message")
	String message;
	
	public Response(T data, HttpStatus status) {
		this.data = data;
		this.status = status;
		if(status.is2xxSuccessful()) 
			this.message = "Success";
		else
			this.message = "Failed";
	}
}
