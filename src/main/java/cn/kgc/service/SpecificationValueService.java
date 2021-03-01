package cn.kgc.service;

import java.util.List;

import cn.kgc.pojo.SpecificationValue;

public interface SpecificationValueService {

	/**
	 * 根据规格属性id查询属性值
	 * @param speId
	 * @return
	 */
	List<SpecificationValue> listSpecificationValuesBySpeId(Integer speId);
	/**
	 * 根据Id查询属性值
	 * @param id
	 * @return
	 */
	SpecificationValue getSpecificationValueById(Integer id);
	/**
	 * 新增规格属性值
	 * @param specificationValue
	 * @return
	 */
	Boolean saveSpecificationValue(SpecificationValue specificationValue);
	/**
	 * 修改规格属性值
	 * @param specificationValue
	 * @return
	 */
	Boolean updateSpecificationValue(SpecificationValue specificationValue);
	/**
	 * 删除规格属性值
	 * @param specificationValue
	 * @return
	 */
	Boolean deleteSpecificationValueById(Integer id);

}
