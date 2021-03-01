package cn.kgc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	/**
	 * api的描述信息 标题 版本 联系方式等
	 * 
	 * @return
	 */
	public ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("ECM商品管理系统")
				.contact(new Contact("孙福祥", "#", "1873540041@qq.com")).version("1.1")
				.description("测试后台返回的收据").build();
	}
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("cn.kgc")).build();

	}
}
