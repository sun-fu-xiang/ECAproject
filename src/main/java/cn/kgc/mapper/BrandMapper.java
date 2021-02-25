package cn.kgc.mapper;

import java.util.List;

import cn.kgc.pojo.Brand;

public interface BrandMapper {
	/**
	 * 查询商品品牌
	 * @param brand
	 * @return
	 */
	List<Brand> listBrands(String name);
	/**
	 * 修改商品品牌
	 * @param brand
	 * @return
	 */
	Integer updateBrand(Brand brand);
	/**
	 * 增加商品品牌
	 * @param brand
	 * @return
	 */
	Integer saveBrand(Brand brand);
	/**
	 * 根据品牌Id删除商品品牌
	 * @param id
	 * @return
	 */
	Integer deleteBrandById(Integer id);
	Brand getBrandById(Integer id);
}
