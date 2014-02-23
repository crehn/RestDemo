package com.github.crehn.restdemo.data;

import java.util.UUID;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.NoArgsConstructor;

import com.wordnik.swagger.annotations.ApiModel;

@Data
@NoArgsConstructor
@XmlRootElement
@ApiModel(value = "value", description = "descxription")
public class ResultObject {
	private String s;
	private String guid;
	
	public ResultObject(String s) {
		this.s = s;
		this.guid = UUID.randomUUID().toString();
	}
}
