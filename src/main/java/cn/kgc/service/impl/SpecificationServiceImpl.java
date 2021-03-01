package cn.kgc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.kgc.mapper.SpecificationMapper;
import cn.kgc.mapper.SpecificationValueMapper;
import cn.kgc.pojo.Specification;
import cn.kgc.service.SpecificationService;
@Service
public class SpecificationServiceImpl implements SpecificationService {
	@Autowired
	private SpecificationMapper specificationMapper;
	@Autowired
	private SpecificationValueMapper specificationValueMapper;
	@Override
	public List<Specification> listSpecifications() {
		return specificationMapper.listSpecifications(null);
	}
	@Override
	public List<Specification> listSpecifications(String name){
		return specificationMapper.listSpecifications(name);
	};
	@Override
	public Specification getSpecificationById(Integer id) {
		Specification specification = specificationMapper.getSpecificationById(id);
		specification.setSpecificationValues(specificationValueMapper.listSpecificationValuesBySpeId(id));
		return specification;
	}
	private Boolean update(Integer data) {
		if (data > 0) {
			return true;
		}
		return false;
	}
	@Override
	public Boolean updateSpecification(Specification specification) {
		return update(specificationMapper.updateSpecification(specification));
	}

	@Override
	public Boolean saveSpecification(String name) {
		return update(specificationMapper.saveSpecification(name));
	}
	@Transactional()
	@Override
	public Boolean deleteSpecificationById(Integer id) {
		Integer result = specificationValueMapper.deleteSpecificationValueBySpeId(id);
		result += specificationMapper.deleteSpecificationById(id) - 1;
		return update(result);
	}

}
