package cn.kgc.service;

import java.util.List;

import cn.kgc.pojo.Brand;

public interface BrandService {

	/**
	 * 所有商品品牌
	 * @param brand
	 * @return
	 */
	List<Brand> listBrands();
	/**
	 * 根据商品名模糊查询商品品牌
	 * @param name
	 * @return
	 */
	List<Brand> listBrandsByName(String name);
	/**
	 * 根据品牌id查询商品品牌
	 * @param id
	 * @return
	 */
	Brand getBrandById(Integer id);
	/**
	 * 修改商品品牌
	 * @param brand
	 * @return
	 */
	Boolean updateBrand(Brand brand);
	/**
	 * 增加商品品牌
	 * @param brand
	 * @return
	 */
	Boolean saveBrand(Brand brand);
	/**
	 * 根据品牌ID删除商品品牌
	 * @param id
	 * @return
	 */
	Boolean deleteBrandById(Integer id);

}
