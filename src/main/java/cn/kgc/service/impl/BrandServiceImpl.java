package cn.kgc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kgc.mapper.BrandMapper;
import cn.kgc.pojo.Brand;
import cn.kgc.service.BrandService;
@Service
public class BrandServiceImpl implements BrandService {
	@Autowired
	private BrandMapper brandMapper;
	@Override
	public List<Brand> listBrands() {
		return brandMapper.listBrands(null);
	}

	@Override
	public List<Brand> listBrandsByName(String name) {
		return brandMapper.listBrands(name);
	}

	@Override
	public Brand getBrandById(Integer id) {
		return brandMapper.getBrandById(id);
	}
	private Boolean update(Integer data) {
		if (data>0) {
			return true;
		}
		return false;
	}
	@Override
	public Boolean updateBrand(Brand brand) {
		return update(brandMapper.updateBrand(brand));
	}

	@Override
	public Boolean saveBrand(Brand brand) {
		return update(brandMapper.saveBrand(brand));
	}

	@Override
	public Boolean deleteBrandById(Integer id) {
		return update(brandMapper.deleteBrandById(id));
	}

}
