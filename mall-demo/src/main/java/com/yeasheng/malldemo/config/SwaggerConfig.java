package com.yeasheng.malldemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Desc:
 * @author: yansheng
 * @date: 2019/6/16
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				// controller包路径
				.apis(RequestHandlerSelectors.basePackage("com.yeasheng.malldemo.controller"))
				.paths(PathSelectors.any())
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("易昇商城api文档")
				.description("restful 风格接口")
				//服务条款网址
				.termsOfServiceUrl("https://www.github.com/yeasheng")
				.version("1.0")
				//.contact(new Contact("帅呆了", "url", "email"))
				.build();
	}

}
