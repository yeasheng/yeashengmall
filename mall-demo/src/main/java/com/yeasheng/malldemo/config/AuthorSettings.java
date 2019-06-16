package com.yeasheng.malldemo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Desc:
 * @author: yansheng
 * @date: 2019/6/15
 */
@Component
@ConfigurationProperties(prefix = "author")
@PropertySource("classpath:config/author.properties")
@Getter
@Setter
public class AuthorSettings {
private String name;
private Long age;

}
