package cn.kgc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@MapperScan(basePackages = "cn.kgc.mapper")
@EnableSwagger2
@SpringBootApplication
public class CommodityApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommodityApplication.class, args);
	}

}
