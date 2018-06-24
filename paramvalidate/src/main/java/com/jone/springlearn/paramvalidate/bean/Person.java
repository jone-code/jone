package com.jone.springlearn.paramvalidate.bean;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * TODO completion javadoc.
 *
 * @author rui.zhang
 * @since 24 六月 2018
 */
public class Person {

	@NotNull(message = "name不可以为空")
	private String name;

	@NotEmpty(message="不能为empty")
	private String sex;

	@NotNull(message="age不能为空")
	private Integer age;

	@Valid
	@NotNull(message = "image不为空")
	private Image image;

	public Person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
