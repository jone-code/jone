package com.jone.springlearn.paramvalidate.bean;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

/**
 * 头像
 *
 * @author rui.zhang
 * @since 24 六月 2018
 */
public class Image {

	@NotNull(message = "url不能为空")
	@Size(min = 1, message = "长度大于1")
	private String url;

	public Image() {
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
