package com.yeasheng.malldemo.component;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

/**
 * Desc:
 * @author: yansheng
 * @date: 2019/6/13
 */
@Getter
@Setter
public class NeoProperties {
	@Value("com.yeasheng.title")
	private String title;
	@Value("com.yeasheng.desc")
	private String desc;
}
