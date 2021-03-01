package cn.kgc;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.kgc.pojo.Brand;
import cn.kgc.service.BrandService;
@RunWith(SpringRunner.class)
@SpringBootTest
class CommodityApplicationTests {

	@Autowired
	BrandService brandService;
	@Test
	public void testListBrands() {
		System.out.println("111");
		List<Brand> listBrands = brandService.listBrands();
		for (Brand brand : listBrands) {
			System.out.println(brand.toString());
		}
	}

}
