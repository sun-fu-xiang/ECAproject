package cn.kgc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kgc.mapper.SpecificationValueMapper;
import cn.kgc.pojo.SpecificationValue;
import cn.kgc.service.SpecificationValueService;
@Service
public class SpecificationValueServiceImpl implements SpecificationValueService {
	@Autowired
	private SpecificationValueMapper specificationValueMapper;
	@Override
	public List<SpecificationValue> listSpecificationValuesBySpeId(Integer speId) {
		return specificationValueMapper.listSpecificationValuesBySpeId(speId);
	}

	@Override
	public SpecificationValue getSpecificationValueById(Integer id) {
		return specificationValueMapper.getSpecificationValueById(id);
	}
	private Boolean update(Integer data) {
		if (data > 0) {
			return true;
		}
		return false;
	}
	@Override
	public Boolean saveSpecificationValue(SpecificationValue specificationValue) {
		return update(specificationValueMapper.saveSpecificationValue(specificationValue));
	}

	@Override
	public Boolean updateSpecificationValue(SpecificationValue specificationValue) {
		return update(specificationValueMapper.updateSpecificationValue(specificationValue));
	}

	@Override
	public Boolean deleteSpecificationValueById(Integer id) {
		return update(specificationValueMapper.deleteSpecificationValueById(id));
	}

}
